package com.bit.Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	ChromeDriver dr;
	
//	static int z = 10;
//	int f = 25;
//	
//	
//	static void abc() {
//		
//		System.out.println(z);
//		System.out.println(f);
//	}
	
	Utility (ChromeDriver dr) {
		this.dr = dr;
	}
	
	public void getUrl (String url) {
		dr.get(url);
	}
	
	public void verifyPageLogo (By by) {
		boolean b = dr.findElement(by).isDisplayed();
		System.out.println("Target Logo is Displayed" +b);
		
	}
	
	public void verifyPageTitle (String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean g = actualTitle.contentEquals(expectedTitle);
		System.out.println("Title matched ? : " +g);
	}
	
	public void type (WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public void clickElement (By by) {
		dr.findElement(by).click();
			
	}
	
	public void selecByVisibleText (By by, String value ) {
		new Select (dr.findElement(by)).selectByVisibleText(value);
	
	}
	
	public void verifyPageURL (String expectedURL) {
		String actualURL = dr.getCurrentUrl();
		boolean y = actualURL.contains(expectedURL);
		System.out.println("URL matched : ");
	}
	
	public void myWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	

}
