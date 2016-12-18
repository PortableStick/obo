package com.github.dunmatt.obo.core.msgpack

object Constants {
  val ARRAY_16                   = 0xdc.toByte
  val ARRAY_32                   = 0xdd.toByte
  val BIN_16                     = 0xc5.toByte
  val BIN_32                     = 0xc6.toByte
  val BIN_8                      = 0xc4.toByte
  val EXT_16                     = 0xc8.toByte
  val EXT_32                     = 0xc9.toByte
  val EXT_8                      = 0xc7.toByte
  val FALSE                      = 0xc2.toByte
  val FIXARRAY_CUTOFF            = 0xa0
  val FIXARRAY_VALUE_MASK        = 0x0f
  val FIXEXT_1                   = 0xd4.toByte
  val FIXEXT_16                  = 0xd8.toByte
  val FIXEXT_2                   = 0xd5.toByte
  val FIXEXT_4                   = 0xd6.toByte
  val FIXEXT_8                   = 0xd7.toByte
  val FIXMAP_CUTOFF              = 0x90
  val FIXMAP_VALUE_MASK          = 0x0f
  val FIXSTR_CUTOFF              = 0xc0
  val FIXSTR_MASK                = 0xe0
  val FIXSTR_VALUE_MASK          = 0x1f
  val FLOAT_32                   = 0xca.toByte
  val FLOAT_64                   = 0xcb.toByte
  val INT_16                     = 0xd1.toByte
  val INT_32                     = 0xd2.toByte
  val INT_64                     = 0xd3.toByte
  val INT_8                      = 0xd0.toByte
  val MAP_16                     = 0xde.toByte
  val MAP_32                     = 0xdf.toByte
  val MAX_UINT_8                 = 0xff  // NOTE: these MAX_UINT_ constants are intentionally 32-bit Ints
  val MAX_UINT_16                = 0xffff
  val NEGATIVE_FIXINT_THRESHHOLD = 0xe0
  val NEGATIVE_FIXINT_VALUE_MASK = 0x1f
  val NIL                        = 0xc0.toByte
  val POSITIVE_FIXINT_CUTOFF     = 0x80
  val POSITIVE_FIXINT_MASK       = 0x7f
  val STR_16                     = 0xda.toByte
  val STR_32                     = 0xdb.toByte
  val STR_8                      = 0xd9.toByte
  val TRUE                       = 0xc3.toByte
  val UINT_16                    = 0xcd.toByte
  val UINT_32                    = 0xce.toByte
  val UINT_64                    = 0xcf.toByte
  val UINT_8                     = 0xcc.toByte
}
