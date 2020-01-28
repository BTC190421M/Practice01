package com.bit.Express;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	ChromeDriver dr;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadab\\Downloads\\Bittech\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();

	}

	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		dr.quit();

	}

}

