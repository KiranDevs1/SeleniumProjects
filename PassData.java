package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassData {
	
	 public static void main(String [] args) throws InterruptedException {
			//build path
			 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		   //launch browser
			WebDriver driver = new ChromeDriver();
			
			//passtheURL
			driver.get("http://facebook.com");
			
			Thread.sleep(2000);
			
			//pass the email and passwrd
			
			driver.findElement(By.id("email")).sendKeys("kirandevs@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Pass")).sendKeys("123");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();

}
}
