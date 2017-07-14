package com.fanniemae.payroll;

public class EmailProcess implements Runnable {
public void sendEmail (){
	System.out.println("Email process started");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Email process ended");
}

@Override
public void run() {
	sendEmail();
	
}
}
