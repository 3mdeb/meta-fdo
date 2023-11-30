SUMMARY = "An implementation of the FIDO Device Onboard (FDO) Linux client \
written in Rust."
HOMEPAGE = "https://github.com/fdo-rs/fido-device-onboard-rs"
LICENSE = "BSD-3-Clause"

LIC_FILES_CHKSUM = "file://LICENSE;md5=4564fca518fc70f71d178dff59609d4c"

inherit cargo

SRC_URI += "git://github.com/fdo-rs/fido-device-onboard-rs.git;protocol=https;nobranch=1;branch=main"
SRCREV = "068346128f4d683bf7a04fa82b469f1af9809e28"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "client-linuxapp"
PV:append = ".AUTOINC+068346128f"

SRC_URI += " \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/aho-corasick/1.0.1 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anstream/0.3.2 \
    crate://crates.io/anstyle-parse/0.2.0 \
    crate://crates.io/anstyle-query/1.0.0 \
    crate://crates.io/anstyle-wincon/1.0.1 \
    crate://crates.io/anstyle/1.0.0 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/arrayref/0.3.7 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/assert-str/0.1.0 \
    crate://crates.io/async-lock/2.7.0 \
    crate://crates.io/async-session/3.0.0 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/aws-nitro-enclaves-cose/0.4.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.2 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bindgen/0.63.0 \
    crate://crates.io/bitfield/0.13.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/blake3/0.3.8 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/bstr/1.5.0 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cbindgen/0.24.5 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono-tz-build/0.0.2 \
    crate://crates.io/chrono-tz/0.6.1 \
    crate://crates.io/chrono/0.4.25 \
    crate://crates.io/ciborium-io/0.2.1 \
    crate://crates.io/ciborium-ll/0.2.1 \
    crate://crates.io/ciborium/0.2.1 \
    crate://crates.io/clang-sys/1.6.1 \
    crate://crates.io/clap/3.2.25 \
    crate://crates.io/clap/4.3.0 \
    crate://crates.io/clap_builder/4.3.0 \
    crate://crates.io/clap_derive/4.3.0 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/clap_lex/0.5.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/config/0.13.3 \
    crate://crates.io/constant_time_eq/0.1.5 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/crypto-mac/0.8.0 \
    crate://crates.io/ctor/0.1.26 \
    crate://crates.io/dashmap/5.4.0 \
    crate://crates.io/deunicode/0.4.3 \
    crate://crates.io/devicemapper-sys/0.1.5 \
    crate://crates.io/devicemapper/0.33.5 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dlv-list/0.3.0 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/enumflags2/0.7.7 \
    crate://crates.io/enumflags2_derive/0.7.7 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/env_logger/0.7.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.9 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.10 \
    crate://crates.io/globwalk/0.8.1 \
    crate://crates.io/h2/0.3.19 \
    crate://crates.io/half/1.8.2 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/hostname-validator/1.1.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humansize/2.1.3 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.26 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.56 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/ipnet/2.7.2 \
    crate://crates.io/is-terminal/0.4.7 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/js-sys/0.3.63 \
    crate://crates.io/json5/0.4.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.144 \
    crate://crates.io/libcryptsetup-rs-sys/0.2.4 \
    crate://crates.io/libcryptsetup-rs/0.8.0 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/libm/0.2.7 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.18 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/mbox/0.6.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/mio/0.8.7 \
    crate://crates.io/multer/2.1.0 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/oid/0.2.1 \
    crate://crates.io/once_cell/1.17.2 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-kdf/0.4.1 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-sys/0.9.90 \
    crate://crates.io/openssl/0.10.55 \
    crate://crates.io/ordered-multimap/0.4.3 \
    crate://crates.io/os_str_bytes/6.5.0 \
    crate://crates.io/output_vt100/0.1.3 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/parse-zoneinfo/0.3.0 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/pathdiff/0.2.1 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/pem/2.0.1 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pest/2.6.0 \
    crate://crates.io/pest_derive/2.6.0 \
    crate://crates.io/pest_generator/2.6.0 \
    crate://crates.io/pest_meta/2.6.0 \
    crate://crates.io/phf/0.10.1 \
    crate://crates.io/phf_codegen/0.10.0 \
    crate://crates.io/phf_generator/0.10.0 \
    crate://crates.io/phf_shared/0.10.0 \
    crate://crates.io/picky-asn1-der/0.2.5 \
    crate://crates.io/picky-asn1-x509/0.6.1 \
    crate://crates.io/picky-asn1/0.3.3 \
    crate://crates.io/pin-project-internal/1.1.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.1.0 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty_assertions/1.3.0 \
    crate://crates.io/pretty_env_logger/0.4.0 \
    crate://crates.io/proc-macro2/1.0.59 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/regex/1.8.3 \
    crate://crates.io/reqwest/0.11.18 \
    crate://crates.io/retry/1.3.1 \
    crate://crates.io/ron/0.7.1 \
    crate://crates.io/rust-ini/0.18.0 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/rustix/0.37.19 \
    crate://crates.io/rustls-pemfile/1.0.2 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/secrecy/0.8.0 \
    crate://crates.io/security-framework-sys/2.9.0 \
    crate://crates.io/security-framework/2.9.1 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.163 \
    crate://crates.io/serde_bytes/0.11.9 \
    crate://crates.io/serde_cbor/0.11.2 \
    crate://crates.io/serde_derive/1.0.163 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_repr/0.1.12 \
    crate://crates.io/serde_tuple/0.5.0 \
    crate://crates.io/serde_tuple_macros/0.5.0 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_with/1.14.0 \
    crate://crates.io/serde_yaml/0.9.21 \
    crate://crates.io/serial_test/2.0.0 \
    crate://crates.io/serial_test_derive/2.0.0 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/slug/0.1.4 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/sys-info/0.9.1 \
    crate://crates.io/target-lexicon/0.12.7 \
    crate://crates.io/tempfile/3.5.0 \
    crate://crates.io/tera/1.18.1 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/time-core/0.1.1 \
    crate://crates.io/time/0.3.21 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-native-tls/0.3.1 \
    crate://crates.io/tokio-stream/0.1.14 \
    crate://crates.io/tokio-tungstenite/0.18.0 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.28.2 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/tss-esapi-sys/0.4.0 \
    crate://crates.io/tss-esapi/7.2.0 \
    crate://crates.io/tungstenite/0.18.0 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/ucd-trie/0.1.5 \
    crate://crates.io/uncased/0.9.9 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-segment/0.9.0 \
    crate://crates.io/unic-ucd-segment/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unsafe-libyaml/0.2.8 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/users/0.11.0 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/uuid/1.3.3 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/warp-sessions/1.0.19 \
    crate://crates.io/warp/0.3.5 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.86 \
    crate://crates.io/wasm-bindgen-futures/0.4.36 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.86 \
    crate://crates.io/wasm-bindgen-macro/0.2.86 \
    crate://crates.io/wasm-bindgen-shared/0.2.86 \
    crate://crates.io/wasm-bindgen/0.2.86 \
    crate://crates.io/web-sys/0.3.63 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/xattr/1.0.0 \
    crate://crates.io/yaml-rust/0.4.5 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zeroize/1.6.0 \
    crate://crates.io/zeroize_derive/1.4.2 \
"


SRC_URI[ahash-0.7.6.sha256sum] = "fcb51a0695d8f838b1ee009b3fbf66bda078cd64590202a864a8f3e8c4315c47"
SRC_URI[aho-corasick-0.7.20.sha256sum] = "cc936419f96fa211c1b9166887b38e5e40b19958e5b895be7c1f93adec7071ac"
SRC_URI[aho-corasick-1.0.1.sha256sum] = "67fc08ce920c31afb70f013dcce1bfc3a3195de6a228474e45e1f145b36f8d04"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anstream-0.3.2.sha256sum] = "0ca84f3628370c59db74ee214b3263d58f9aadd9b4fe7e711fd87dc452b7f163"
SRC_URI[anstyle-parse-0.2.0.sha256sum] = "e765fd216e48e067936442276d1d57399e37bce53c264d6fefbe298080cb57ee"
SRC_URI[anstyle-query-1.0.0.sha256sum] = "5ca11d4be1bab0c8bc8734a9aa7bf4ee8316d462a08c6ac5052f888fef5b494b"
SRC_URI[anstyle-wincon-1.0.1.sha256sum] = "180abfa45703aebe0093f79badacc01b8fd4ea2e35118747e5811127f926e188"
SRC_URI[anstyle-1.0.0.sha256sum] = "41ed9a86bf92ae6580e0a31281f65a1b1d867c0cc68d5346e2ae128dddfa6a7d"
SRC_URI[anyhow-1.0.71.sha256sum] = "9c7d0618f0e0b7e8ff11427422b64564d5fb0be1940354bfe2e0529b18a9d9b8"
SRC_URI[arrayref-0.3.7.sha256sum] = "6b4930d2cb77ce62f89ee5d5289b4ac049559b1c45539271f5ed4fdc7db34545"
SRC_URI[arrayvec-0.5.2.sha256sum] = "23b62fc65de8e4e7f52534fb52b0f3ed04746ae267519eef2a83941e8085068b"
SRC_URI[assert-str-0.1.0.sha256sum] = "6eff46575e86b852295e41df8599e94a910b1136c6af2821df9925f3cf8a1389"
SRC_URI[async-lock-2.7.0.sha256sum] = "fa24f727524730b077666307f2734b4a1a1c57acb79193127dcc8914d5242dd7"
SRC_URI[async-session-3.0.0.sha256sum] = "07da4ce523b4e2ebaaf330746761df23a465b951a83d84bbce4233dabedae630"
SRC_URI[async-trait-0.1.68.sha256sum] = "b9ccdd8f2a161be9bd5c023df56f1b2a0bd1d83872ae53b71a84a12c9bf6e842"
SRC_URI[atty-0.2.14.sha256sum] = "d9b39be18770d11421cdb1b9947a45dd3f37e93092cbf377614828a319d5fee8"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[aws-nitro-enclaves-cose-0.4.0.sha256sum] = "4e2fe3e862758ef5bb5d89868141ab28781d96347522b60eb6abeaf7f9acd4bc"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[base64-0.21.2.sha256sum] = "604178f6c5c21f02dc555784810edfb88d34ac2c73b2eae109655649ee73ce3d"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bindgen-0.63.0.sha256sum] = "36d860121800b2a9a94f9b5604b332d5cffb234ce17609ea479d723dbc9d3885"
SRC_URI[bitfield-0.13.2.sha256sum] = "46afbd2983a5d5a7bd740ccb198caf5b82f45c40c09c0eed36052d91cb92e719"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[blake3-0.3.8.sha256sum] = "b64485778c4f16a6a5a9d335e80d449ac6c70cdd6a06d2af18a6f6f775a125b3"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[block-buffer-0.9.0.sha256sum] = "4152116fd6e9dadb291ae18fc1ec3575ed6d84c29642d97890f4b4a3417297e4"
SRC_URI[bstr-1.5.0.sha256sum] = "a246e68bb43f6cd9db24bea052a53e40405417c5fb372e3d1a8a7f770a564ef5"
SRC_URI[bumpalo-3.13.0.sha256sum] = "a3e2c3daef883ecc1b5d58c15adae93470a91d425f3532ba1695849656af3fc1"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[bytes-1.4.0.sha256sum] = "89b2fd2a0dcf38d7971e2194b6b6eebab45ae01067456a7fd93d5547a61b70be"
SRC_URI[cbindgen-0.24.5.sha256sum] = "4b922faaf31122819ec80c4047cc684c6979a087366c069611e33649bf98e18d"
SRC_URI[cc-1.0.79.sha256sum] = "50d30906286121d95be3d479533b458f87493b30a4b5f79a607db8f5d11aa91f"
SRC_URI[cexpr-0.6.0.sha256sum] = "6fac387a98bb7c37292057cffc56d62ecb629900026402633ae9160df93a8766"
SRC_URI[cfg-if-0.1.10.sha256sum] = "4785bdd1c96b2a846b2bd7cc02e86b6b3dbf14e7e53446c4f54c92a361040822"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-tz-build-0.0.2.sha256sum] = "db058d493fb2f65f41861bfed7e3fe6335264a9f0f92710cab5bdf01fef09069"
SRC_URI[chrono-tz-0.6.1.sha256sum] = "58549f1842da3080ce63002102d5bc954c7bc843d4f47818e642abdc36253552"
SRC_URI[chrono-0.4.25.sha256sum] = "fdbc37d37da9e5bce8173f3a41b71d9bf3c674deebbaceacd0ebdabde76efb03"
SRC_URI[ciborium-io-0.2.1.sha256sum] = "cdf919175532b369853f5d5e20b26b43112613fd6fe7aee757e35f7a44642656"
SRC_URI[ciborium-ll-0.2.1.sha256sum] = "defaa24ecc093c77630e6c15e17c51f5e187bf35ee514f4e2d67baaa96dae22b"
SRC_URI[ciborium-0.2.1.sha256sum] = "effd91f6c78e5a4ace8a5d3c0b6bfaec9e2baaef55f3efc00e45fb2e477ee926"
SRC_URI[clang-sys-1.6.1.sha256sum] = "c688fc74432808e3eb684cae8830a86be1d66a2bd58e1f248ed0960a590baf6f"
SRC_URI[clap-3.2.25.sha256sum] = "4ea181bf566f71cb9a5d17a59e1871af638180a18fb0035c92ae62b705207123"
SRC_URI[clap-4.3.0.sha256sum] = "93aae7a4192245f70fe75dd9157fc7b4a5bf53e88d30bd4396f7d8f9284d5acc"
SRC_URI[clap_builder-4.3.0.sha256sum] = "4f423e341edefb78c9caba2d9c7f7687d0e72e89df3ce3394554754393ac3990"
SRC_URI[clap_derive-4.3.0.sha256sum] = "191d9573962933b4027f932c600cd252ce27a8ad5979418fe78e43c07996f27b"
SRC_URI[clap_lex-0.2.4.sha256sum] = "2850f2f5a82cbf437dd5af4d49848fbdfc27c157c3d010345776f952765261c5"
SRC_URI[clap_lex-0.5.0.sha256sum] = "2da6da31387c7e4ef160ffab6d5e7f00c42626fe39aea70a7b0f1773f7dd6c1b"
SRC_URI[colorchoice-1.0.0.sha256sum] = "acbf1af155f9b9ef647e42cdc158db4b64a1b61f743629225fde6f3e0be2a7c7"
SRC_URI[config-0.13.3.sha256sum] = "d379af7f68bfc21714c6c7dea883544201741d2ce8274bb12fa54f89507f52a7"
SRC_URI[constant_time_eq-0.1.5.sha256sum] = "245097e9a4535ee1e3e3931fcfcd55a796a44c643e8596ff6566d68f09b87bbc"
SRC_URI[core-foundation-sys-0.8.4.sha256sum] = "e496a50fda8aacccc86d7529e2c1e0892dbd0f898a6b5645b5561b89c3210efa"
SRC_URI[core-foundation-0.9.3.sha256sum] = "194a7a9e6de53fa55116934067c844d9d749312f75c6f6d0980e8c252f8c2146"
SRC_URI[cpufeatures-0.2.7.sha256sum] = "3e4c1eaa2012c47becbbad2ab175484c2a84d1185b566fb2cc5b8707343dfe58"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[crypto-mac-0.11.1.sha256sum] = "b1d1a86f49236c215f271d40892d5fc950490551400b02ef360692c29815c714"
SRC_URI[crypto-mac-0.8.0.sha256sum] = "b584a330336237c1eecd3e94266efb216c56ed91225d634cb2991c5f3fd1aeab"
SRC_URI[ctor-0.1.26.sha256sum] = "6d2301688392eb071b0bf1a37be05c469d3cc4dbbd95df672fe28ab021e6a096"
SRC_URI[dashmap-5.4.0.sha256sum] = "907076dfda823b0b36d2a1bb5f90c96660a5bbcd7729e10727f07858f22c4edc"
SRC_URI[deunicode-0.4.3.sha256sum] = "850878694b7933ca4c9569d30a34b55031b9b139ee1fc7b94a527c4ef960d690"
SRC_URI[devicemapper-sys-0.1.5.sha256sum] = "f0b0f9d16560f830ae6e90b769017333c4561d2c84f39e7aa7d935d2e7bcbc4c"
SRC_URI[devicemapper-0.33.5.sha256sum] = "75a9fd602a98d192f7662a1f4c4cf6920a1b454c3a9e724f6490cf8e30910114"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[digest-0.9.0.sha256sum] = "d3dd60d1080a57a05ab032377049e0591415d2b31afd7028356dbf3cc6dcb066"
SRC_URI[dlv-list-0.3.0.sha256sum] = "0688c2a7f92e427f44895cd63841bff7b29f8d7a1648b9e7e07a4a365b2e1257"
SRC_URI[either-1.8.1.sha256sum] = "7fcaabb2fef8c910e7f4c7ce9f67a1283a1715879a7c230ca9d6d1ae31f16d91"
SRC_URI[encoding_rs-0.8.32.sha256sum] = "071a31f4ee85403370b58aca746f01041ede6f0da2730960ad001edc2b71b394"
SRC_URI[enumflags2-0.7.7.sha256sum] = "c041f5090df68b32bcd905365fd51769c8b9d553fe87fde0b683534f10c01bd2"
SRC_URI[enumflags2_derive-0.7.7.sha256sum] = "5e9a1f9f7d83e59740248a6e14ecf93929ade55027844dfcea78beafccc15745"
SRC_URI[env_logger-0.10.0.sha256sum] = "85cdab6a89accf66733ad5a1693a4dcced6aeff64602b634530dd73c1f3ee9f0"
SRC_URI[env_logger-0.7.1.sha256sum] = "44533bbbb3bb3c1fa17d9f2e4e38bbbaf8396ba82193c4cb1b6445d711445d36"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[errno-0.3.1.sha256sum] = "4bcfec3a70f97c962c307b2d2c56e358cf1d00b558d74262b5f929ee8cc7e73a"
SRC_URI[event-listener-2.5.3.sha256sum] = "0206175f82b8d6bf6652ff7d71a1e27fd2e4efde587fd368662814d6ec1d9ce0"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[form_urlencoded-1.1.0.sha256sum] = "a9c384f161156f5260c24a097c56119f9be8c798586aecc13afbcbe7b7e26bf8"
SRC_URI[futures-channel-0.3.28.sha256sum] = "955518d47e09b25bbebc7a18df10b81f0c766eaf4c4f1cccef2fca5f2a4fb5f2"
SRC_URI[futures-core-0.3.28.sha256sum] = "4bca583b7e26f571124fe5b7561d49cb2868d79116cfa0eefce955557c6fee8c"
SRC_URI[futures-executor-0.3.28.sha256sum] = "ccecee823288125bd88b4d7f565c9e58e41858e47ab72e8ea2d64e93624386e0"
SRC_URI[futures-io-0.3.28.sha256sum] = "4fff74096e71ed47f8e023204cfd0aa1289cd54ae5430a9523be060cdb849964"
SRC_URI[futures-macro-0.3.28.sha256sum] = "89ca545a94061b6365f2c7355b4b32bd20df3ff95f02da9329b34ccc3bd6ee72"
SRC_URI[futures-sink-0.3.28.sha256sum] = "f43be4fe21a13b9781a69afa4985b0f6ee0e1afab2c6f454a8cf30e2b2237b6e"
SRC_URI[futures-task-0.3.28.sha256sum] = "76d3d132be6c0e6aa1534069c705a74a5997a356c0dc2f86a47765e5617c5b65"
SRC_URI[futures-util-0.3.28.sha256sum] = "26b01e40b772d54cf6c6d721c1d1abd0647a0106a12ecaa1c186273392a69533"
SRC_URI[futures-0.3.28.sha256sum] = "23342abe12aba583913b2e62f22225ff9c950774065e4bfb61a19cd9770fec40"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.9.sha256sum] = "c85e1d9ab2eadba7e5040d4e09cbd6d072b76a557ad64e797c2cb9d4da21d7e4"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[globset-0.4.10.sha256sum] = "029d74589adefde59de1a0c4f4732695c32805624aec7b68d91503d4dba79afc"
SRC_URI[globwalk-0.8.1.sha256sum] = "93e3af942408868f6934a7b85134a3230832b9977cf66125df2f9edcfce4ddcc"
SRC_URI[h2-0.3.19.sha256sum] = "d357c7ae988e7d2182f7d7871d0b963962420b0678b0997ce7de72001aeab782"
SRC_URI[half-1.8.2.sha256sum] = "eabb4a44450da02c90444cf74558da904edde8fb4e9035a9a6a4e15445af0bd7"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[headers-core-0.2.0.sha256sum] = "e7f66481bfee273957b1f20485a4ff3362987f85b2c236580d81b4eb7a326429"
SRC_URI[headers-0.3.8.sha256sum] = "f3e372db8e5c0d213e0cd0b9be18be2aca3d44cf2fe30a9d46a65581cd454584"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.1.19.sha256sum] = "62b467343b94ba476dcb2500d242dadbb39557df889310ac77c5d99100aaac33"
SRC_URI[hermit-abi-0.2.6.sha256sum] = "ee512640fe35acbfb4bb779db6f0d80704c2cacfa2e39b601ef3e3f47d1ae4c7"
SRC_URI[hermit-abi-0.3.1.sha256sum] = "fed44880c466736ef9a5c5b5facefb5ed0785676d0c02d612db14e54f0d84286"
SRC_URI[hex-0.4.3.sha256sum] = "7f24254aa9a54b5c858eaee2f5bccdb46aaf0e486a595ed5fd8f86ba55232a70"
SRC_URI[hmac-0.11.0.sha256sum] = "2a2a2320eb7ec0ebe8da8f744d7812d9fc4cb4d09344ac01898dbcb6a20ae69b"
SRC_URI[hostname-validator-1.1.1.sha256sum] = "f558a64ac9af88b5ba400d99b579451af0d39c6d360980045b91aac966d705e2"
SRC_URI[http-body-0.4.5.sha256sum] = "d5f38f16d184e36f2408a55281cd658ecbd3ca05cce6d6510a176eca393e26d1"
SRC_URI[http-0.2.9.sha256sum] = "bd6effc99afb63425aff9b05836f029929e345a6148a14b7ecd5ab67af944482"
SRC_URI[httparse-1.8.0.sha256sum] = "d897f394bad6a705d5f4104762e116a75639e470d80901eed05a860a95cb1904"
SRC_URI[httpdate-1.0.2.sha256sum] = "c4a1e36c821dbe04574f602848a19f742f4fb3c98d40449f11bcad18d6b17421"
SRC_URI[humansize-2.1.3.sha256sum] = "6cb51c9a029ddc91b07a787f1d86b53ccfa49b0e86688c946ebe8d3555685dd7"
SRC_URI[humantime-1.3.0.sha256sum] = "df004cfca50ef23c36850aaaa59ad52cc70d0e90243c3c7737a4dd32dc7a3c4f"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[hyper-tls-0.5.0.sha256sum] = "d6183ddfa99b85da61a140bea0efc93fdf56ceaa041b37d553518030827f9905"
SRC_URI[hyper-0.14.26.sha256sum] = "ab302d72a6f11a3b910431ff93aae7e773078c769f0a3ef15fb9ec692ed147d4"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[iana-time-zone-0.1.56.sha256sum] = "0722cd7114b7de04316e7ea5456a0bbb20e4adb46fd27a3697adb812cff0f37c"
SRC_URI[idna-0.3.0.sha256sum] = "e14ddfc70884202db2244c223200c204c2bda1bc6e0998d11b5e024d657209e6"
SRC_URI[ignore-0.4.20.sha256sum] = "dbe7873dab538a9a44ad79ede1faf5f30d49f9a5c883ddbab48bce81b64b7492"
SRC_URI[indexmap-1.9.3.sha256sum] = "bd070e393353796e801d209ad339e89596eb4c8d430d18ede6a1cced8fafbd99"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[ipnet-2.7.2.sha256sum] = "12b6ee2129af8d4fb011108c73d99a1b83a85977f23b82460c0ae2e25bb4b57f"
SRC_URI[is-terminal-0.4.7.sha256sum] = "adcf93614601c8129ddf72e2d5633df827ba6551541c6d8c59520a371475be1f"
SRC_URI[itoa-1.0.6.sha256sum] = "453ad9f582a441959e5f0d088b02ce04cfe8d51a8eaf077f12ac6d3e94164ca6"
SRC_URI[js-sys-0.3.63.sha256sum] = "2f37a4a5928311ac501dee68b3c7613a1037d0edb30c8e5427bd832d55d1b790"
SRC_URI[json5-0.4.1.sha256sum] = "96b0db21af676c1ce64250b5f40f3ce2cf27e4e47cb91ed91eb6fe9350b430c1"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lazycell-1.3.0.sha256sum] = "830d08ce1d1d941e6b30645f1a0eb5643013d835ce3779a5fc208261dbe10f55"
SRC_URI[libc-0.2.144.sha256sum] = "2b00cc1c228a6782d0f076e7b232802e0c5689d41bb5df366f2a6b6621cfdfe1"
SRC_URI[libcryptsetup-rs-sys-0.2.4.sha256sum] = "d7c355c283a470a1a09924182b3606999786979697753df3c2206948dcd8f4eb"
SRC_URI[libcryptsetup-rs-0.8.0.sha256sum] = "54de25d80cf59c099a01fc9939251bbf8021c131adf97beb7d57c094b16ed474"
SRC_URI[libloading-0.7.4.sha256sum] = "b67380fd3b2fbe7527a606e18729d21c6f3951633d0500574c4dc22d2d638b9f"
SRC_URI[libm-0.2.7.sha256sum] = "f7012b1bbb0719e1097c47611d3898568c546d597c2e74d66f6087edd5233ff4"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[lock_api-0.4.9.sha256sum] = "435011366fe56583b16cf956f9df0095b405b82d76425bc8981c0e22e60ec4df"
SRC_URI[log-0.4.18.sha256sum] = "518ef76f2f87365916b142844c16d8fefd85039bc5699050210a7778ee1cd1de"
SRC_URI[maplit-1.0.2.sha256sum] = "3e2e65a1a2e43cfcb47a895c4c8b10d1f4a61097f9f254f183aee60cad9c651d"
SRC_URI[mbox-0.6.0.sha256sum] = "0f88d5c34d63aad11aa4321ef55ccb064af58b3ad8091079ae22bf83e5eb75d6"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memoffset-0.7.1.sha256sum] = "5de893c32cde5f383baa4c04c5d6dbdd735cfd4a794b0debdb2bb1b421da5ff4"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[mime_guess-2.0.4.sha256sum] = "4192263c238a5f0d0c6bfd21f336a313a4ce1c450542449ca191bb657b4642ef"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[mio-0.8.7.sha256sum] = "eebffdb73fe72e917997fad08bdbf31ac50b0fa91cec93e69a0662e4264d454c"
SRC_URI[multer-2.1.0.sha256sum] = "01acbdc23469fd8fe07ab135923371d5f5a422fbf9c522158677c8eb15bc51c2"
SRC_URI[native-tls-0.2.11.sha256sum] = "07226173c32f2926027b63cce4bcd8076c3552846cbe7925f3aaffeac0a3b92e"
SRC_URI[nix-0.26.2.sha256sum] = "bfdda3d196821d6af13126e40375cdf7da646a96114af134d5f417a9a1dc8e1a"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[num-derive-0.3.3.sha256sum] = "876a53fff98e03a936a674b29568b0e605f06b29372c2489ff4de23f1949743d"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[num_cpus-1.15.0.sha256sum] = "0fac9e2da13b5eb447a6ce3d392f23a29d8694bff781bf03a16cd9ac8697593b"
SRC_URI[oid-0.2.1.sha256sum] = "9c19903c598813dba001b53beeae59bb77ad4892c5c1b9b3500ce4293a0d06c2"
SRC_URI[once_cell-1.17.2.sha256sum] = "9670a07f94779e00908f3e686eab508878ebb390ba6e604d3a284c00e8d0487b"
SRC_URI[opaque-debug-0.3.0.sha256sum] = "624a8340c38c1b80fd549087862da4ba43e08858af025b236e509b6649fc13d5"
SRC_URI[openssl-kdf-0.4.1.sha256sum] = "3a1fa996d05b13619516a4a4a76da9d0c1ffd60b1d1f3f3523f0bd5d27c12f27"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.5.sha256sum] = "ff011a302c396a5197692431fc1948019154afc178baf7d8e37367442a4601cf"
SRC_URI[openssl-sys-0.9.90.sha256sum] = "374533b0e45f3a7ced10fcaeccca020e66656bc03dac384f852e4e5a7a8104a6"
SRC_URI[openssl-0.10.55.sha256sum] = "345df152bc43501c5eb9e4654ff05f794effb78d4efe3d53abc158baddc0703d"
SRC_URI[ordered-multimap-0.4.3.sha256sum] = "ccd746e37177e1711c20dd619a1620f34f5c8b569c53590a72dedd5344d8924a"
SRC_URI[os_str_bytes-6.5.0.sha256sum] = "ceedf44fb00f2d1984b0bc98102627ce622e083e49a5bacdb3e514fa4238e267"
SRC_URI[output_vt100-0.1.3.sha256sum] = "628223faebab4e3e40667ee0b2336d34a5b960ff60ea743ddfdbcf7770bcfb66"
SRC_URI[parking_lot-0.12.1.sha256sum] = "3742b2c103b9f06bc9fff0a37ff4912935851bee6d36f3c02bcc755bcfec228f"
SRC_URI[parking_lot_core-0.9.7.sha256sum] = "9069cbb9f99e3a5083476ccb29ceb1de18b9118cafa53e90c9551235de2b9521"
SRC_URI[parse-zoneinfo-0.3.0.sha256sum] = "c705f256449c60da65e11ff6626e0c16a0a0b96aaa348de61376b249bc340f41"
SRC_URI[paste-1.0.12.sha256sum] = "9f746c4065a8fa3fe23974dd82f15431cc8d40779821001404d10d2e79ca7d79"
SRC_URI[pathdiff-0.2.1.sha256sum] = "8835116a5c179084a830efb3adc117ab007512b535bc1a21c991d3b32a6b44dd"
SRC_URI[peeking_take_while-0.1.2.sha256sum] = "19b17cddbe7ec3f8bc800887bab5e717348c95ea2ca0b1bf0837fb964dc67099"
SRC_URI[pem-2.0.1.sha256sum] = "6b13fe415cdf3c8e44518e18a7c95a13431d9bdf6d15367d82b23c377fdd441a"
SRC_URI[percent-encoding-2.2.0.sha256sum] = "478c572c3d73181ff3c2539045f6eb99e5491218eae919370993b890cdbdd98e"
SRC_URI[pest-2.6.0.sha256sum] = "e68e84bfb01f0507134eac1e9b410a12ba379d064eab48c50ba4ce329a527b70"
SRC_URI[pest_derive-2.6.0.sha256sum] = "6b79d4c71c865a25a4322296122e3924d30bc8ee0834c8bfc8b95f7f054afbfb"
SRC_URI[pest_generator-2.6.0.sha256sum] = "6c435bf1076437b851ebc8edc3a18442796b30f1728ffea6262d59bbe28b077e"
SRC_URI[pest_meta-2.6.0.sha256sum] = "745a452f8eb71e39ffd8ee32b3c5f51d03845f99786fa9b68db6ff509c505411"
SRC_URI[phf-0.10.1.sha256sum] = "fabbf1ead8a5bcbc20f5f8b939ee3f5b0f6f281b6ad3468b84656b658b455259"
SRC_URI[phf_codegen-0.10.0.sha256sum] = "4fb1c3a8bc4dd4e5cfce29b44ffc14bedd2ee294559a294e2a4d4c9e9a6a13cd"
SRC_URI[phf_generator-0.10.0.sha256sum] = "5d5285893bb5eb82e6aaf5d59ee909a06a16737a8970984dd7746ba9283498d6"
SRC_URI[phf_shared-0.10.0.sha256sum] = "b6796ad771acdc0123d2a88dc428b5e38ef24456743ddb1744ed628f9815c096"
SRC_URI[picky-asn1-der-0.2.5.sha256sum] = "acbbd5390ab967396cc7473e6e0848684aec7166e657c6088604e07b54a73dbe"
SRC_URI[picky-asn1-x509-0.6.1.sha256sum] = "f3033675030de806aba1d5470949701b7c9f1dbf77e3bb17bd12e5f945e560ba"
SRC_URI[picky-asn1-0.3.3.sha256sum] = "889bbb26c80acf919e89980dfc8e04eb19df272d8a9893ec9b748d3a1675abde"
SRC_URI[pin-project-internal-1.1.0.sha256sum] = "39407670928234ebc5e6e580247dd567ad73a3578460c5990f9503df207e8f07"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-project-1.1.0.sha256sum] = "c95a7476719eab1e366eaf73d0260af3021184f18177925b07f54b30089ceead"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.27.sha256sum] = "26072860ba924cbfa98ea39c8c19b4dd6a4a25423dbdf219c1eca91aa0cf6964"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[pretty_assertions-1.3.0.sha256sum] = "a25e9bcb20aa780fd0bb16b72403a9064d6b3f22f026946029acb941a50af755"
SRC_URI[pretty_env_logger-0.4.0.sha256sum] = "926d36b9553851b8b0005f1275891b392ee4d2d833852c417ed025477350fb9d"
SRC_URI[proc-macro2-1.0.59.sha256sum] = "6aeca18b86b413c660b781aa319e4e2648a3e6f9eadc9b47e9038e6fe9f3451b"
SRC_URI[quick-error-1.2.3.sha256sum] = "a1d01941d82fa2ab50be1e79e6714289dd7cde78eba4c074bc5a4374f650dfe0"
SRC_URI[quote-1.0.28.sha256sum] = "1b9ab9c7eadfd8df19006f1cf1a4aed13540ed5cbc047010ece5826e10825488"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[redox_syscall-0.2.16.sha256sum] = "fb5a58c1855b4b6819d59012155603f0b22ad30cad752600aadfcb695265519a"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[regex-syntax-0.7.2.sha256sum] = "436b050e76ed2903236f032a59761c1eb99e1b0aead2c257922771dab1fc8c78"
SRC_URI[regex-1.8.3.sha256sum] = "81ca098a9821bd52d6b24fd8b10bd081f47d39c22778cafaa75a2857a62c6390"
SRC_URI[reqwest-0.11.18.sha256sum] = "cde824a14b7c14f85caff81225f411faacc04a2013f41670f41443742b1c1c55"
SRC_URI[retry-1.3.1.sha256sum] = "ac95c60a949a63fd2822f4964939662d8f2c16c4fa0624fd954bc6e703b9a3f6"
SRC_URI[ron-0.7.1.sha256sum] = "88073939a61e5b7680558e6be56b419e208420c2adb92be54921fa6b72283f1a"
SRC_URI[rust-ini-0.18.0.sha256sum] = "f6d5f2436026b4f6e79dc829837d467cc7e9a55ee40e750d716713540715a2df"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustc_version-0.3.3.sha256sum] = "f0dfe2087c51c460008730de8b57e6a320782fbfb312e1f4d520e6c6fae155ee"
SRC_URI[rustix-0.37.19.sha256sum] = "acf8729d8542766f1b2cf77eb034d52f40d375bb8b615d0b147089946e16613d"
SRC_URI[rustls-pemfile-1.0.2.sha256sum] = "d194b56d58803a43635bdc398cd17e383d6f71f9182b9a192c127ca42494a59b"
SRC_URI[ryu-1.0.13.sha256sum] = "f91339c0467de62360649f8d3e185ca8de4224ff281f66000de5eb2a77a79041"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schannel-0.1.21.sha256sum] = "713cfb06c7059f3588fb8044c0fad1d09e3c01d225e25b9220dbfdcf16dbb1b3"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[secrecy-0.8.0.sha256sum] = "9bd1c54ea06cfd2f6b63219704de0b9b4f72dcc2b8fdef820be6cd799780e91e"
SRC_URI[security-framework-sys-2.9.0.sha256sum] = "f51d0c0d83bec45f16480d0ce0058397a69e48fcdc52d1dc8855fb68acbd31a7"
SRC_URI[security-framework-2.9.1.sha256sum] = "1fc758eb7bffce5b308734e9b0c1468893cae9ff70ebf13e7090be8dcbcc83a8"
SRC_URI[semver-parser-0.10.2.sha256sum] = "00b0bef5b7f9e0df16536d3961cfb6e84331c065b4066afb39768d0e319411f7"
SRC_URI[semver-0.11.0.sha256sum] = "f301af10236f6df4160f7c3f04eec6dbc70ace82d23326abad5edee88801c6b6"
SRC_URI[semver-1.0.17.sha256sum] = "bebd363326d05ec3e2f532ab7660680f3b02130d780c299bca73469d521bc0ed"
SRC_URI[serde-1.0.163.sha256sum] = "2113ab51b87a539ae008b5c6c02dc020ffa39afd2d83cffcb3f4eb2722cebec2"
SRC_URI[serde_bytes-0.11.9.sha256sum] = "416bda436f9aab92e02c8e10d49a15ddd339cea90b6e340fe51ed97abb548294"
SRC_URI[serde_cbor-0.11.2.sha256sum] = "2bef2ebfde456fb76bbcf9f59315333decc4fda0b2b44b420243c11e0f5ec1f5"
SRC_URI[serde_derive-1.0.163.sha256sum] = "8c805777e3930c8883389c602315a24224bcc738b63905ef87cd1420353ea93e"
SRC_URI[serde_json-1.0.96.sha256sum] = "057d394a50403bcac12672b2b18fb387ab6d289d957dab67dd201875391e52f1"
SRC_URI[serde_repr-0.1.12.sha256sum] = "bcec881020c684085e55a25f7fd888954d56609ef363479dc5a1305eb0d40cab"
SRC_URI[serde_tuple-0.5.0.sha256sum] = "f4f025b91216f15a2a32aa39669329a475733590a015835d1783549a56d09427"
SRC_URI[serde_tuple_macros-0.5.0.sha256sum] = "4076151d1a2b688e25aaf236997933c66e18b870d0369f8b248b8ab2be630d7e"
SRC_URI[serde_urlencoded-0.7.1.sha256sum] = "d3491c14715ca2294c4d6a88f15e84739788c1d030eed8c110436aafdaa2f3fd"
SRC_URI[serde_with-1.14.0.sha256sum] = "678b5a069e50bf00ecd22d0cd8ddf7c236f68581b03db652061ed5eb13a312ff"
SRC_URI[serde_yaml-0.9.21.sha256sum] = "d9d684e3ec7de3bf5466b32bd75303ac16f0736426e5a4e0d6e489559ce1249c"
SRC_URI[serial_test-2.0.0.sha256sum] = "0e56dd856803e253c8f298af3f4d7eb0ae5e23a737252cd90bb4f3b435033b2d"
SRC_URI[serial_test_derive-2.0.0.sha256sum] = "91d129178576168c589c9ec973feedf7d3126c01ac2bf08795109aa35b69fb8f"
SRC_URI[sha1-0.10.5.sha256sum] = "f04293dc80c3993519f2d7f6f511707ee7094fe0c6d3406feb330cdb3540eba3"
SRC_URI[sha2-0.10.6.sha256sum] = "82e6b795fe2e3b1e845bafcb27aa35405c4d47cdfc92af5fc8d3002f76cebdc0"
SRC_URI[sha2-0.9.9.sha256sum] = "4d58a1e1bf39749807d89cf2d98ac2dfa0ff1cb3faa38fbb64dd88ac8013d800"
SRC_URI[shlex-1.1.0.sha256sum] = "43b2853a4d09f215c24cc5489c992ce46052d359b5109343cbafbf26bc62f8a3"
SRC_URI[signal-hook-registry-1.4.1.sha256sum] = "d8229b473baa5980ac72ef434c4415e70c4b5e71b423043adb4ba059f89c99a1"
SRC_URI[siphasher-0.3.10.sha256sum] = "7bd3e3206899af3f8b12af284fafc038cc1dc2b41d1b89dd17297221c5d225de"
SRC_URI[slab-0.4.8.sha256sum] = "6528351c9bc8ab22353f9d776db39a20288e8d6c37ef8cfe3317cf875eecfc2d"
SRC_URI[slug-0.1.4.sha256sum] = "b3bc762e6a4b6c6fcaade73e77f9ebc6991b676f88bb2358bddb56560f073373"
SRC_URI[smallvec-1.10.0.sha256sum] = "a507befe795404456341dfab10cef66ead4c041f62b8b11bbb92bffe5d0953e0"
SRC_URI[socket2-0.4.9.sha256sum] = "64a4a911eed85daf18834cfaa86a79b7d266ff93ff5ba14005426219480ed662"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[stable_deref_trait-1.2.0.sha256sum] = "a8f112729512f8e442d81f95a8a7ddf2b7c6b8a1a6f509a95864142b30cab2d3"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[subtle-2.4.1.sha256sum] = "6bdef32e8150c2a081110b42772ffe7d7c9032b606bc226c8260fd97e0976601"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.18.sha256sum] = "32d41677bcbe24c20c52e7c70b0d8db04134c5d1066bf98662e2871ad200ea3e"
SRC_URI[sys-info-0.9.1.sha256sum] = "0b3a0d0aba8bf96a0e1ddfdc352fc53b3df7f39318c71854910c3c4b024ae52c"
SRC_URI[target-lexicon-0.12.7.sha256sum] = "fd1ba337640d60c3e96bc6f0638a939b9c9a7f2c316a1598c279828b3d1dc8c5"
SRC_URI[tempfile-3.5.0.sha256sum] = "b9fbec84f381d5795b08656e4912bec604d162bff9291d6189a78f4c8ab87998"
SRC_URI[tera-1.18.1.sha256sum] = "95a665751302f22a03c56721e23094e4dc22b04a80f381e6737a07bf7a7c70c0"
SRC_URI[termcolor-1.2.0.sha256sum] = "be55cf8942feac5c765c2c993422806843c9a9a45d4d5c407ad6dd2ea95eb9b6"
SRC_URI[textwrap-0.16.0.sha256sum] = "222a222a5bfe1bba4a77b45ec488a741b3cb8872e5e499451fd7d0129c9c7c3d"
SRC_URI[thiserror-impl-1.0.40.sha256sum] = "f9456a42c5b0d803c8cd86e73dd7cc9edd429499f37a3550d286d5e86720569f"
SRC_URI[thiserror-1.0.40.sha256sum] = "978c9a314bd8dc99be594bc3c175faaa9794be04a5a5e153caba6915336cebac"
SRC_URI[thread_local-1.1.4.sha256sum] = "5516c27b78311c50bf42c071425c560ac799b11c30b31f87e3081965fe5e0180"
SRC_URI[time-core-0.1.1.sha256sum] = "7300fbefb4dadc1af235a9cef3737cea692a9d97e1b9cbcd4ebdae6f8868e6fb"
SRC_URI[time-0.3.21.sha256sum] = "8f3403384eaacbca9923fa06940178ac13e4edb725486d70e8e15881d0c836cc"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[tokio-macros-2.1.0.sha256sum] = "630bdcf245f78637c13ec01ffae6187cca34625e8c63150d424b59e55af2675e"
SRC_URI[tokio-native-tls-0.3.1.sha256sum] = "bbae76ab933c85776efabc971569dd6119c580d8f5d448769dec1764bf796ef2"
SRC_URI[tokio-stream-0.1.14.sha256sum] = "397c988d37662c7dda6d2208364a706264bf3d6138b11d436cbac0ad38832842"
SRC_URI[tokio-tungstenite-0.18.0.sha256sum] = "54319c93411147bced34cb5609a80e0a8e44c5999c93903a81cd866630ec0bfd"
SRC_URI[tokio-util-0.7.8.sha256sum] = "806fe8c2c87eccc8b3267cbae29ed3ab2d0bd37fca70ab622e46aaa9375ddb7d"
SRC_URI[tokio-1.28.2.sha256sum] = "94d7b1cfd2aa4011f2de74c2c4c63665e27a71006b0a192dcd2710272e73dfa2"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[tower-service-0.3.2.sha256sum] = "b6bc1c9ce2b5135ac7f93c72918fc37feb872bdc6a5533a8b85eb4b86bfdae52"
SRC_URI[tracing-core-0.1.31.sha256sum] = "0955b8137a1df6f1a2e9a37d8a6656291ff0297c1a97c24e0d8425fe2312f79a"
SRC_URI[tracing-0.1.37.sha256sum] = "8ce8c33a8d48bd45d624a6e523445fd21ec13d3653cd51f681abf67418f54eb8"
SRC_URI[try-lock-0.2.4.sha256sum] = "3528ecfd12c466c6f163363caf2d02a71161dd5e1cc6ae7b34207ea2d42d81ed"
SRC_URI[tss-esapi-sys-0.4.0.sha256sum] = "e7b8be553262e0924410fe96404830252477f175f228081f21cb0bd87f2ccebe"
SRC_URI[tss-esapi-7.2.0.sha256sum] = "891582e26e83f2cbd608b18cbd7ffb921482740524187a2bca20cf44a286547b"
SRC_URI[tungstenite-0.18.0.sha256sum] = "30ee6ab729cd4cf0fd55218530c4522ed30b7b6081752839b68fcec8d0960788"
SRC_URI[typenum-1.16.0.sha256sum] = "497961ef93d974e23eb6f433eb5fe1b7930b659f06d12dec6fc44a8f554c0bba"
SRC_URI[ucd-trie-0.1.5.sha256sum] = "9e79c4d996edb816c91e4308506774452e55e95c3c9de07b6729e17e15a5ef81"
SRC_URI[uncased-0.9.9.sha256sum] = "9b9bc53168a4be7402ab86c3aad243a84dd7381d09be0eddc81280c1da95ca68"
SRC_URI[unic-char-property-0.9.0.sha256sum] = "a8c57a407d9b6fa02b4795eb81c5b6652060a15a7903ea981f3d723e6c0be221"
SRC_URI[unic-char-range-0.9.0.sha256sum] = "0398022d5f700414f6b899e10b8348231abf9173fa93144cbc1a43b9793c1fbc"
SRC_URI[unic-common-0.9.0.sha256sum] = "80d7ff825a6a654ee85a63e80f92f054f904f21e7d12da4e22f9834a4aaa35bc"
SRC_URI[unic-segment-0.9.0.sha256sum] = "e4ed5d26be57f84f176157270c112ef57b86debac9cd21daaabbe56db0f88f23"
SRC_URI[unic-ucd-segment-0.9.0.sha256sum] = "2079c122a62205b421f499da10f3ee0f7697f012f55b675e002483c73ea34700"
SRC_URI[unic-ucd-version-0.9.0.sha256sum] = "96bd2f2237fe450fcd0a1d2f5f4e91711124f7857ba2e964247776ebeeb7b0c4"
SRC_URI[unicase-2.6.0.sha256sum] = "50f37be617794602aabbeee0be4f259dc1778fabe05e2d67ee8f79326d5cb4f6"
SRC_URI[unicode-bidi-0.3.13.sha256sum] = "92888ba5573ff080736b3648696b70cafad7d250551175acbaa4e0385b3e1460"
SRC_URI[unicode-ident-1.0.9.sha256sum] = "b15811caf2415fb889178633e7724bad2509101cde276048e013b9def5e51fa0"
SRC_URI[unicode-normalization-0.1.22.sha256sum] = "5c5713f0fc4b5db668a2ac63cdb7bb4469d8c9fed047b1d0292cc7b0ce2ba921"
SRC_URI[unsafe-libyaml-0.2.8.sha256sum] = "1865806a559042e51ab5414598446a5871b561d21b6764f2eabb0dd481d880a6"
SRC_URI[url-2.3.1.sha256sum] = "0d68c799ae75762b8c3fe375feb6600ef5602c883c5d21eb51c09f22b83c4643"
SRC_URI[users-0.11.0.sha256sum] = "24cc0f6d6f267b73e5a2cadf007ba8f9bc39c6a6f9666f8cf25ea809a153b032"
SRC_URI[utf-8-0.7.6.sha256sum] = "09cc8ee72d2a9becf2f2febe0205bbed8fc6615b7cb429ad062dc7b7ddd036a9"
SRC_URI[utf8parse-0.2.1.sha256sum] = "711b9620af191e0cdc7468a8d14e709c3dcdb115b36f838e601583af800a370a"
SRC_URI[uuid-1.3.3.sha256sum] = "345444e32442451b267fc254ae85a209c64be56d2890e601a0c37ff0c3c5ecd2"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[walkdir-2.3.3.sha256sum] = "36df944cda56c7d8d8b7496af378e6b16de9284591917d307c9b4d313c44e698"
SRC_URI[want-0.3.0.sha256sum] = "1ce8a968cb1cd110d136ff8b819a556d6fb6d919363c61534f6860c7eb172ba0"
SRC_URI[warp-sessions-1.0.19.sha256sum] = "555042eb78480c0d25586d53d85a60769c9d3dc7296e1db6371724e54b7662a1"
SRC_URI[warp-0.3.5.sha256sum] = "ba431ef570df1287f7f8b07e376491ad54f84d26ac473489427231e1718e1f69"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-backend-0.2.86.sha256sum] = "19b04bc93f9d6bdee709f6bd2118f57dd6679cf1176a1af464fca3ab0d66d8fb"
SRC_URI[wasm-bindgen-futures-0.4.36.sha256sum] = "2d1985d03709c53167ce907ff394f5316aa22cb4e12761295c5dc57dacb6297e"
SRC_URI[wasm-bindgen-macro-support-0.2.86.sha256sum] = "e128beba882dd1eb6200e1dc92ae6c5dbaa4311aa7bb211ca035779e5efc39f8"
SRC_URI[wasm-bindgen-macro-0.2.86.sha256sum] = "14d6b024f1a526bb0234f52840389927257beb670610081360e5a03c5df9c258"
SRC_URI[wasm-bindgen-shared-0.2.86.sha256sum] = "ed9d5b4305409d1fc9482fee2d7f9bcbf24b3972bf59817ef757e23982242a93"
SRC_URI[wasm-bindgen-0.2.86.sha256sum] = "5bba0e8cb82ba49ff4e229459ff22a191bbe9a1cb3a341610c9c33efc27ddf73"
SRC_URI[web-sys-0.3.63.sha256sum] = "3bdd9ef4e984da1187bf8110c5cf5b845fbc87a23602cdf912386a76fcd3a7c2"
SRC_URI[which-4.4.0.sha256sum] = "2441c784c52b289a054b7201fc93253e288f094e2f4be9058343127c4226a269"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.42.0.sha256sum] = "5a3e1820f08b8513f676f7ab6c1f99ff312fb97b553d30ff4dd86f9f15728aa7"
SRC_URI[windows-sys-0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows-targets-0.48.0.sha256sum] = "7b1eb6f0cd7c80c79759c929114ef071b87354ce476d9d94271031c0497adfd5"
SRC_URI[windows-0.48.0.sha256sum] = "e686886bc078bc1b0b600cac0147aadb815089b6e4da64016cbd754b6342700f"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_gnullvm-0.48.0.sha256sum] = "91ae572e1b79dba883e0d315474df7305d12f569b400fcf90581b06062f7e1bc"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_aarch64_msvc-0.48.0.sha256sum] = "b2ef27e0d7bdfcfc7b868b317c1d32c641a6fe4629c171b8928c7b08d98d7cf3"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_gnu-0.48.0.sha256sum] = "622a1962a7db830d6fd0a69683c80a18fda201879f0f447f065a3b7467daa241"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_i686_msvc-0.48.0.sha256sum] = "4542c6e364ce21bf45d69fdd2a8e455fa38d316158cfd43b3ac1c5b1b19f8e00"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnu-0.48.0.sha256sum] = "ca2b8a661f7628cbd23440e50b05d705db3686f894fc9580820623656af974b1"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_gnullvm-0.48.0.sha256sum] = "7896dbc1f41e08872e9d5e8f8baa8fdd2677f29468c4e156210174edc7f7b953"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"
SRC_URI[windows_x86_64_msvc-0.48.0.sha256sum] = "1a515f5799fe4961cb532f983ce2b23082366b898e52ffbce459c86f67c8378a"
SRC_URI[winreg-0.10.1.sha256sum] = "80d0f4e272c85def139476380b12f9ac60926689dd2e01d4923222f40580869d"
SRC_URI[xattr-1.0.0.sha256sum] = "ea263437ca03c1522846a4ddafbca2542d0ad5ed9b784909d4b27b76f62bc34a"
SRC_URI[yaml-rust-0.4.5.sha256sum] = "56c1936c4cc7a1c9ab21a1ebb602eb942ba868cbd44a99cb7cdc5892335e1c85"
SRC_URI[yansi-0.5.1.sha256sum] = "09041cd90cf85f7f8b2df60c646f853b7f535ce68f85244eb6731cf89fa498ec"
SRC_URI[zeroize-1.6.0.sha256sum] = "2a0956f1ba7c7909bfb66c2e9e4124ab6f6482560f6628b5aaeba39207c9aad9"
SRC_URI[zeroize_derive-1.4.2.sha256sum] = "ce36e65b0d2999d2aafac989fb249189a141aee1f53c612c1f37d72631959f69"
