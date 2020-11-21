package me.coley.nimbus.net.serial.impl.binary;

/**
 * Identifiers for content types used in {@link BinaryObjectReader} and {@link BinaryObjectWriter}.
 *
 * @author Matt Coley
 * @see BinaryObjectReader
 * @see BinaryObjectWriter
 */
public interface BinaryConstants {
	byte KIND_BOOL   = 1;
	byte KIND_BYTE   = 2;
	byte KIND_CHAR   = 3;
	byte KIND_SHORT  = 4;
	byte KIND_INT    = 5;
	byte KIND_FLOAT  = 6;
	byte KIND_DOUBLE = 7;
	byte KIND_LONG   = 8;
	byte KIND_BYTES  = 9;
	byte KIND_UTF    = 10;
	byte KIND_STRUCT = 11;
}
