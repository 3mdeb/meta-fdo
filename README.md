# meta-fdo

## About

This layers contains recipes for integrating the functionalities of [FIDO Device
Onboarding Protocol](https://fidoalliance.org/device-onboarding-overview/) into
the Yocto Project. As of now it's in its early stage and supports only the
[fido-device-onboard-rs](https://github.com/fdo-rs/fido-device-onboard-rs/tree/main)
project.

## Dependancies

This layer depends on the following layers:
* [meta-clang](https://github.com/kraj/meta-clang)
* [meta-tpm2](https://github.com/Wind-River/meta-secure-core)
* [meta-rust](https://github.com/meta-rust/meta-rust)
