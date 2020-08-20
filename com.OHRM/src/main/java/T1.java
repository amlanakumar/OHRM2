import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ohrm.genericlib.Constants;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		//Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\browsers\\chrome\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		
		
		Dimension dim = new Dimension(1280,5277);
		//driver.manage().window().setSize(dim);

		driver.quit();
	Thread.sleep(5000);
	}

}
