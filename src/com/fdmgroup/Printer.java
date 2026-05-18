package com.fdmgroup;

public class Printer extends Device implements Bluetooth{
	private String ink;

	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Printer(String ink) {
		super();
		this.ink = ink;
	}

	public String getInk() {
		return ink;
	}

	public void setInk(String ink) {
		this.ink = ink;
	}

	@Override
	public String toString() {
		return "Printer [ink=" + ink + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on printer..");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off printer..");
	}
	
	public void printing(String document) {
		System.out.println("printing " + document + "...");
	}

	@Override
	public void sendData() {
		System.out.println("sending data from printer..");
	}

	@Override
	public void receiveData() {
		System.out.println("receiving data to printer..");
	}
}
