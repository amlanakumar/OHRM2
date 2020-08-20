package com.ohrm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ohrm.genericlib.BRowser;
import com.ohrm.genericlib.ExcelLib;
import com.ohrm.objectrepository.Login;



public class CURD_Employee {
	// Login loginPage;
	//opbject decalration
		ExcelLib eLib;
		//WebDRiverCommonLib wLib;
		WebDriver driver;
		Login loginPage ;
		//Coomon commonPage;
		//Candidate candiPage;
	 
	 @BeforeClass
		public void configBeforeClass(){
			//object intailization ,launch browser
			//eLib = new ExcelLib();
			//wLib = new WebDRiverCommonLib();
			// driver = BRowser.getBrowser();
			 loginPage = PageFactory.initElements(driver,Login.class);
			 //commonPage = PageFactory.initElements(driver,Coomon.class);

		}
	 
	@Test
	public void createEmployee() {
		  //step 1 : login to app
		//loginPage.loginToApp();
	}
}
