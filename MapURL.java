package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapURL {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("pattambi");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='mL3xi']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[data-value='Directions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[aria-label='Choose starting point, or click on the map...']")).sendKeys("palarivattom");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']")).click();
		Thread.sleep(2000);
}

}
