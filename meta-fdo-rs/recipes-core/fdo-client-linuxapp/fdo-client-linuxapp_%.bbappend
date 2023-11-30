inherit systemd pkgconfig

DEPENDS:append = " \
    pkgconfig \
    openssl-native openssl \
    tpm2-tss \
    clang-native \
    libdevmapper \
    cryptsetup \
    cryptsetup-native \
"

RDEPENDS:${PN}:append = " \
    cryptsetup \
    libssl \
    libcrypto \
    libtss2-mu \
    libtss2 \
"

SRC_URI:append = " \
    file://0001-Use-pkg-config-to-find-OpenSSL-include-directories.patch;patchdir=${WORKDIR}/cargo_home/bitbake/openssl-kdf-0.4.1 \
    file://0001-Fix-libcryptsetup-h-while-cross-compiling.patch;patchdir=${WORKDIR}/cargo_home/bitbake/libcryptsetup-rs-sys-0.2.4 \
    file://0001-Use-pkg-config-to-find-devmapper-include-directories.patch;patchdir=${WORKDIR}/cargo_home/bitbake/devicemapper-sys-0.1.5 \
    file://device-credentials \
    file://fdo-client-linuxapp.service \
"

# Set path to workspace root directory and use --bin to select the app to build.
# This workarounds fdo-store build failure due to wrong feature flags.
CARGO_SRC_DIR = ""
CARGO_BUILD_FLAGS += "--bin fdo-client-linuxapp"

# Bindgen needs clang
export LIBCLANG_PATH = "${RECIPE_SYSROOT_NATIVE}/usr/lib"

# By default pkg-config variables point to aarch64 libraries which are picked up
# during x86_64 builds, this causes aarch64 include directories and linker
# search paths to into x86_64 builds, causing problems.
#
# Host libraries already use absolute paths so set sysroot to /
export PKG_CONFIG_SYSROOT_DIR="/"
export PKG_CONFIG_PATH="${RECIPE_SYSROOT_NATIVE}/usr/lib/pkgconfig:${RECIPE_SYSROOT_NATIVE}/usr/share/pkgconfig"
export PKG_CONFIG_LIBDIR="${RECIPE_SYSROOT_NATIVE}/usr/lib/pkgconfig"
export PKG_CONFIG_DIR="${RECIPE_SYSROOT_NATIVE}/usr/lib/pkgconfig"

# Those variables are handled internally by pkg-config crate.
# All paths are relative to sysroot, so set PKG_CONFIG_SYSROOT_DIR
# The PKG_CONFIG_*_{TARGET} needs underscores in it's triple instead of hyphens

export PKG_CONFIG_TARGET_VAR = "${@d.getVar('TARGET_SYS').replace('-','_')}"

do_compile:prepend() {
    export PKG_CONFIG_SYSROOT_DIR_${PKG_CONFIG_TARGET_VAR}="${RECIPE_SYSROOT}"
    export PKG_CONFIG_PATH_${PKG_CONFIG_TARGET_VAR}="${RECIPE_SYSROOT}/usr/lib/pkgconfig:${RECIPE_SYSROOT}/usr/share/pkgconfig"
    export PKG_CONFIG_LIBDIR_${PKG_CONFIG_TARGET_VAR}="${RECIPE_SYSROOT}/usr/lib/pkgconfig"
    export PKG_CONFIG_DIR_${PKG_CONFIG_TARGET_VAR}="${RECIPE_SYSROOT}/usr/lib/pkgconfig"
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN} = " \
    fdo-client-linuxapp.service \
"

SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -d ${D}${sysconfdir}
    install -m 0755 ${WORKDIR}/device-credentials ${D}${sysconfdir}/device-credentials
    install -d ${D}${systemd_unitdir}/system/
    install -m 0755 ${WORKDIR}/fdo-client-linuxapp.service ${D}${systemd_unitdir}/system/fdo-client-linuxapp.service
}

FILES:${PN} += " \
    ${systemd_unitdir}/system/fdo-client-linuxapp.service \
    ${sysconfdir}/device-credentials \
"
