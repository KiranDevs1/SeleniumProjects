package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeProject {
	 public static void main(String [] args) throws InterruptedException {
			//build path
			 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		   //launch browser
			WebDriver driver = new ChromeDriver();
			
			//passtheURL
			driver.get("https://www.youtube.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.className("ytSearchboxComponentInput")).sendKeys("bigdawgs");
			Thread.sleep(2000);
			driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
			Thread.sleep(2000);
            driver.findElement(By.linkText("Hanumankind – Big Dawgs | Ft. Kalmi (Official Music Video) | Def Jam India")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("ytp-fullscreen-button")).click();


}
}