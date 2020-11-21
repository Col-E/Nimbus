package me.coley.nimbus.stuff;

import me.coley.nimbus.net.serial.KeyedEnum;

public enum ConnectionType implements KeyedEnum {
	SSH(0), FTP(1), HTTP(2);

	private final byte key;

	ConnectionType(int key) {
		this.key = (byte) key;
		register();
	}

	@Override
	public byte getEnumKey() {
		return key;
	}
}
