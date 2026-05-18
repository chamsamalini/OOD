package com.fdmgroup;

public abstract class Device {
	private long serialNo;
	private String deviceName;
	private String manufacturer;
	
	public Device() {
		super();
	}

	public Device(long serialNo, String deviceName, String manufacturer) {
		super();
		this.serialNo = serialNo;
		this.deviceName = deviceName;
		this.manufacturer = manufacturer;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Device [serialNo=" + serialNo + ", deviceName=" + deviceName + ", manufacturer=" + manufacturer + "]";
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}
