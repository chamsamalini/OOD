package com.fdmgroup;

public interface Bluetooth {
	//public static final double VERSION = 4;
	double VERSION = 5.0;
	
//	public abstract void sendData();
	default void sendData() {
		System.out.println("default sendData implementation of bluetooth..");
	}
	
	default void receiveData() {
		System.out.println("default receiveData implementation of bluetooth..");
	}
	
	default void newFeature() {
		System.out.println("default implementation of new feature..");
	}
}
