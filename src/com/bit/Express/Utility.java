package com.bit.Express;
																					
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	
	ChromeDriver dr;

	Utility(ChromeDriver dr) {
		this.dr = dr;

	}

	public void getURL(String url) {
		dr.get(url);
	}

	public void myClick(By by) {
		dr.findElement(by).click();

	}

	public void enterOnKeybord(By by) {
		dr.findElement(by).sendKeys(Keys.ENTER);
	}

	public void myType(By by, String v) {
		WebElement textbox = dr.findElement(by);
		textbox.sendKeys(v);

	}

	public void verifyUrl(String expectedurl) {

		String actualurl = dr.getCurrentUrl();
		boolean b = actualurl.equals(expectedurl);
		System.out.println("URL is Matched : " + b);

	}

	public void verifyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean b = actualTitle.equals(expectedTitle);
		System.out.println("Title is Matched : " + b);

	}

	public void verifyProductPageTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean b = actualTitle.equals(expectedTitle);
		System.out.println("Product page title is matched : " + b);

	}

	public void verifyShoppingBegPageTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean b = actualTitle.equals(expectedTitle);
		System.out.println("Shopping beg page title is matched : " + b);

	}

	public void verifyLogo(WebElement ele) {
		boolean b = ele.isDisplayed();
		System.out.println("Logo is displayed : " + b);

	}

	public void verifyByVisibleText(By by) {
		boolean b = dr.findElement(by).isDisplayed();
		System.out.println("Sign In text is displayed : " + b);

	}

	public void selectByVisiablevalue(By by, int b) {
		new Select(dr.findElement(by)).selectByIndex(b);

	}

	public void isSelectByVisiablevalue(By by, int v) {
		new Select(dr.findElement(by)).selectByIndex(v);

	}

	public void myWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}

	public void getText(By by, String v) {
		String actualText = dr.findElement(by).getText();
		System.out.println("actual Text : " + actualText);
		boolean b = actualText.equals(v);
		System.out.println("Sign in Text matched : " + b);

	}

	public void getErrorMessage(By by, String expectedError) {
		String actualText = dr.findElement(by).getText();
		System.out.println("error message : " + actualText);
		boolean b = actualText.equals(expectedError);
		System.out.println("Sign in error Text matched : " + b);

	}

	public void verifyHowManyItem(By by) {
		boolean b = dr.findElement(by).isDisplayed();
		System.out.println("one item selected : " + b);

	}

}
