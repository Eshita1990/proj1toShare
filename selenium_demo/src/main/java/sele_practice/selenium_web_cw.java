package sele_practice;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WEbDriverManager;
public class selenium_web_cw {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.Chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", null);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.findElement(By.xpath("//input[@value='Trird Option'")).click();
		TakeScreenShot shot=driver;

	}

}
