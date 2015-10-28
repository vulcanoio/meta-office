SUMMARY = "Library for parsing and serializing RDF syntaxes"
LICENSE = "GPLv2 | LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

DEPENDS = "libxml2 libxslt curl yajl"

SRC_URI = " \
    http://download.librdf.org/source/${BPN}-${PV}.tar.gz \
    file://0001-configure.ac-do-additional-checks-on-libxml2-also-wh.patch \
"
SRC_URI[md5sum] = "a39f6c07ddb20d7dd2ff1f95fa21e2cd"
SRC_URI[sha256sum] = "ada7f0ba54787b33485d090d3d2680533520cd4426d2f7fb4782dd4a6a1480ed"

inherit autotools pkgconfig

EXTRA_OECONF = " \
    --without-xml2-config \
    --without-curl-config \
    --without-xslt-config \
"