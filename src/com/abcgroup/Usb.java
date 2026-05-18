package com.fdmgroup;

public interface Usb {
	
	default void sendData() {
		System.out.println("default sendData implementation of Usb");
	}
	
	default void receiveData() {
		System.out.println("default recieveData implementation of Usb");
	}
	
	void charge();
	
}
