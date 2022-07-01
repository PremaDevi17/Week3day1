package org.system;

public class Desktop extends Computer {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.computerModel();
		Desktop desktop = new Desktop();
		desktop.desktopSize();
	}
	
	public void desktopSize() {
		System.out.println("15.6 inch");
	}
}
