package com.fdmgroup;

public class DeviceApp {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.turnOn();
		phone.makeACall("8138436651");
		phone.sendData();
		phone.receiveData();
		phone.newFeature();
		phone.turnOff();
	}
}
