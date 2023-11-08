package com.casting;

public class Chrome implements WebDriver {

	@Override
	public void launchBrowser() {
		//launch chrome browser
		
		System.out.println("launch chrome browser");
		
	}

	@Override
	public void getURL() {
		// TODO Auto-generated method stub
		System.out.println("https://www.amazon.in");
	}

}
