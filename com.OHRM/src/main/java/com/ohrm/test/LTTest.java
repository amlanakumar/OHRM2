package com.ohrm.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ohrm.genericlib.BRowser;
import com.ohrm.genericlib.WebDriverCommonLib;
import com.ohrm.objectrepository.Login ;

public class LTTest extends WebDriverCommonLib{
	Login loginPage ;
	
	
	/*
	 * @BeforeClass public void bedoreClassTest() {
	 * System.out.println("Before class"); //this.driver = BRowser.driver;
	 * 
	 * }
	 * 
	 * @BeforeMethod public void beforeMethodTest(){
	 * System.out.println("Before Method1");
	 * 
	 }*/

	

	@Test(priority = 1)
	
	public void LoginToAppTest() throws InterruptedException {
		PageFactory.initElements(BRowser.driver, this);
		loginPage = PageFactory.initElements(BRowser.driver,Login.class);
		
		System.out.println("Test1");
		loginPage.loginToApp();
		System.out.println("Test Bhai");

	}	
	
	/*
	 * @AfterMethod public void afterMethodTest(){
	 * System.out.println("After Method1"); }
	 */
	

	/*
	 * @AfterClass
	 * public void afterClassTest() { 
	 * System.out.println("After class 
	 * }
	 */
}