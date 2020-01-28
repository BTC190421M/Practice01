package com.bit.Express;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {


	ChromeDriver dr;
	Utility u;
	Data d;

	Scenario(ChromeDriver dr) {
		this.dr = dr;
	}

	public void expressTest() throws InterruptedException {
		u = new Utility(dr);
		d = new Data();
		u.getURL(d.express_url);
		u.verifyUrl(d.express_url);
		u.verifyTitle(d.express_Title);
		u.verifyLogo(dr.findElement(By.xpath(d.express_Logo)));
		u.myType(By.id(d.express_type_input_path_id), d.express_type_value);
		u.enterOnKeybord(By.id(d.express_type_input_path_id));
		u.myWait(3000);
		u.myClick(By.xpath(d.express_click_first_Tshirt_xpath));
		u.myWait(3000);
		u.myClick(By.xpath(d.express_select_first_Tshirt_size_path));
		u.myWait(3000);
		u.verifyProductPageTitle(d.express_product_page_Title);
		u.myClick(By.xpath(d.express_select_first_Tshirt_color_path));
		// u.selectByVisiablevalue(By.xpath(d.express_select_first_Tshirt_size_path),
		// d.express_select_first_Tshirt_size_value);
		// u.selectByVisiablevalue(By.xpath(d.express_select_first_Tshirt_color_path),
		// d.express_select_first_Tshirt_color_value);
		u.myClick(By.xpath(d.express_click_add_to_beg));
		u.myWait(2000);
		u.myClick(By.xpath(d.express_click_to_view_beg));
		u.myWait(2000);
		u.selectByVisiablevalue(By.id(d.express_select_numberofProduct_id), 1);
		u.myWait(2000);
		u.verifyShoppingBegPageTitle(d.express_Shopping_beg_title);
		u.myWait(2000);
		u.verifyHowManyItem(By.id(d.express_qty_path_id));
		u.myWait(2000);
		u.myClick(By.id(d.express_click_toCheckout_id));
		u.myWait(3000);
		u.getText(By.xpath(d.express_sign_in_text_path), "Sign In");
		u.getText(By.xpath(d.express_sign_in_text_path), d.express_Sign_in_text);
		u.myWait(2000);
		u.myType(By.id(d.express_Sign_in_page_User_or_email_path_id), d.express_Sign_in_user_value);
		u.myWait(2000);
		u.myType(By.name(d.express_Sign_in_page_password_path_name), d.express_Sign_in_passWord_value);
		u.myWait(3000);
		u.enterOnKeybord(By.name(d.express_Sign_in_page_password_path_name));
		u.myWait(2000);
		u.getErrorMessage(By.className(d.express_error_message_path_class), d.express_actual_error_message);
		u.myWait(3000);
		
		
		
		
		

	}

}
