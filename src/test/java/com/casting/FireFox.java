package com.casting;

public class FireFox implements WebDriver{

	@Override
	public void launchBrowser() {
		System.out.println("Launch firefox");
		
	}

	@Override
	public void getURL() {
		System.out.println("https://www.flipkart.com");
		
	}

}
