package test1.smartschool;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;


public class partenrlogin {

	private static File get;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
ChromeOptions secure=new ChromeOptions();
secure.setAcceptInsecureCerts(true);
WebDriver driver=new ChromeDriver(secure);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.get("https://smartidealsolution.com/");
driver.findElement(By.xpath("//a[normalize-space()='Institute']")).click();
driver.findElement(By.xpath("//a[contains(@href,'https://smartidealsolution.com/admin/site/login')][normalize-space()='Login']")).click();
driver.findElement(By.name("username")).sendKeys("remosi2606@kwalah.com");
driver.findElement(By.name("password")).sendKeys("cFtRtP");
Thread.sleep(12000);
driver.findElement(By.className("btn")).click();
Thread.sleep(3000);
TakesScreenshot screen=(TakesScreenshot) driver;
File get=screen.getScreenshotAs(OutputType.FILE);
File dest = new File("D:\\login.png");
Files.copy(get, dest);



	}

}
