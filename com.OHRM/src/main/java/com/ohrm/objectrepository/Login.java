package com.ohrm.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.genericlib.BRowser;
import com.ohrm.genericlib.Constants;

public class Login extends com.ohrm.genericlib.WebDriverCommonLib{
	@FindBy(id="txtUsername")
	WebElement userNameEdt;

	@FindBy(id="txtPassword")
	WebElement pwdEdt;

	@FindBy(id="btnLogin")
	WebElement loginBtn;

	
	
	public void loginToApp() throws InterruptedException{
	
		
		BRowser.getBrowser();
		BRowser.driver.manage().window().maximize();
		BRowser.driver.get(Constants.url);
		waitForPAgeToLoad();
		Thread.sleep(2000);

		//get page title
		String title=BRowser.driver.getTitle();
		System.out.println(title);
		
		//BRowser.driver.findElement(By.id("txtUsername")).sendKeys("amlana");
		
		
//				userNameEdt.sendKeys(Constants.userName);
//				pwdEdt.sendKeys(Constants.password);
				//loginBtn.click();
	}
}




