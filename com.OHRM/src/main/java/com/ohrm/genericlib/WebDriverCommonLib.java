package com.ohrm.genericlib;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPAgeToLoad(){
		BRowser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
public void waitForElementPResent(WebElement dobj){
  //WebDriverWait wait = new WebDriverWait(BRowser.driver, 20);
  //wait.until((Function<? super WebDriver, V>) ExpectedConditions.visibilityOf(dobj));
       
}

}



