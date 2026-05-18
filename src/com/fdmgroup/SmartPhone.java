package com.fdmgroup;

public class SmartPhone extends Device implements Bluetooth, Usb{
	private String keypad;

	public SmartPhone() {
		super();
	}

	public SmartPhone(long serialNo, String deviceName, String manufacturer, String keypad) {
		super(serialNo, deviceName, manufacturer);
		this.keypad = keypad;
	}

	public String getKeypad() {
		return keypad;
	}

	public void setKeypad(String keypad) {
		this.keypad = keypad;
	}

	@Override
	public String toString() {
		return "SmartPhone [keypad=" + keypad + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on phone..");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off phone..");
	}
	
	public void makeACall(String number) {
		System.out.println("Calling "+ number + ".....");
	}

	@Override
	public void charge() {
		System.out.println("Charging phone..");
	}
	
	@Override
	public void receiveData() {
		//System.out.println("receiving data in  phone..");
		Bluetooth.super.receiveData();
	}
	
	@Override
	public void sendData() {
//		System.out.println("sending data in phone..");
		Usb.super.sendData();
		
	}
	
	
}
