package org.computer;
//Child Class
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("32inch");

	}
	public static void main(String[] args) {
		Desktop D = new Desktop();
		D.computerMode1();
		D.desktopSize();
	}

}
