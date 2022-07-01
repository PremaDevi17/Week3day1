package org.system;

public class AxisBank extends BankInfo{
public static void main(String[] args) {
	BankInfo bankInfo = new BankInfo();
	bankInfo.deposit();
	bankInfo.fixed();
	bankInfo.saving();
	AxisBank axisBank = new AxisBank();
	axisBank.deposit();
}

public void deposit() {
	System.out.println("AxisDeposit : 2000");
}
}
