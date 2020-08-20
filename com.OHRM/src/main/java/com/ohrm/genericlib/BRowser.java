package com.ohrm.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BRowser {
	public static WebDriver driver;	
	public static WebDriver getBrowser(){		
	    if(Constants.browser.equals("firefox")){
	    	driver = new FirefoxDriver();
	    }else if(Constants.browser.equals("ie")){		
		    System.setProperty("webdriver.ie.driver", 
			"C:\\seleniumJAr\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
	    }else if(Constants.browser.equals("chrome")){		
			System.setProperty("webdriver.chrome.driver", 
			"C:\\SELENIUM\\browsers\\chrome\\Compatable\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	    }
      return driver;  
	}
}
