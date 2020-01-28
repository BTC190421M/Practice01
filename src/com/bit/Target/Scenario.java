package com.bit.Target;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {

	ChromeDriver dr;
	Utility u;
	Data d;
	
	Scenario(ChromeDriver dr) {
		
		this.dr = dr;
	}
	
	public void targetLogIn() throws InterruptedException {
		
		u = new Utility(dr);
		d = new Data();
		u.getUrl(d.TargetUrl);
		u.verifyPageLogo(By.xpath(d.Targetlogo));
		u.verifyPageTitle(d.Target_Title);
		u.clickElement(By.xpath(d.Target_Sign_In_Path));
		u.myWait(3000);
		u.clickElement(By.xpath(d.Target_Sign_In_Main_Path));
		u.verifyPageTitle(d.Target_Log_In_Page_Title);
		u.myWait(3000);
		u.type(dr.findElement(By.xpath(d.target_User_name_Box)), "pokemon");
		u.type(dr.findElement(By.xpath(d.target_Password_Box)), "555123123");
		u.myWait(3000);
		u.verifyPageTitle(d.Target_Log_In_Page_Title);
		u.clickElement(By.xpath(d.target_User_Sign_In_Page));
		
		
	}
	
	
	
}
