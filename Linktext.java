package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	 public static void main(String [] args) throws InterruptedException {
			//build path
			 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		   //launch browser
			WebDriver driver = new ChromeDriver();
			
			//passtheURL
			driver.get("http://127.0.0.1:5500/link.html");
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText(gooogle)).click();

}
}
