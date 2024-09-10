package test1.smartschool;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Argument;

public class studentsignup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions unsecure = new ChromeOptions();
		unsecure.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(unsecure);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://smartidealsolution.com/");
		driver.findElement(By.xpath("(//a[normalize-space()='Student'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'dropdown-item')][normalize-space()='Sign Up'])[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select Institute')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='FINAL TESTING']")).click();
		driver.findElement(By.name("candidate-name")).sendKeys("balram QA");
		WebElement adhar = driver.findElement(By.name("candidate-adhar"));
		adhar.sendKeys("501060204080");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);",adhar);
		driver.findElement(By.name("father-name")).sendKeys("father ram kumar");
		driver.findElement(By.name("mother-name")).sendKeys("susila");
		driver.findElement(By.name("candidate-cast")).sendKeys("bhumihar");
		WebElement scrolltext=driver.findElement(By.xpath("//div[3]//div[2]//label[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("",scrolltext);
		driver.findElement(By.name("candidate-mobile")).sendKeys("9308520123");
		driver.findElement(By.name("candidate-email")).sendKeys("balram1081@gmial.com");
		driver.findElement(By.name("candidate-address")).sendKeys("at-ssr,faridabad,haryana,india");
		driver.findElement(By.name("candidate-pincode")).sendKeys("110034");
	
		
		WebElement scrolldob = driver.findElement(By.xpath("//div[contains(text(),'Ration Card')]"));
		scrolldob.click();
		driver.findElement(By.xpath("//span[normalize-space()='BPL']")).click();
  driver.findElement(By.xpath("//div[contains(text(),'Select Gender*')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Male']")).click();
		WebElement scrolldob1 = driver.findElement(By.name("candidate-dob"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].scrollIntoView(true);",scrolldob1);	
		scrolldob1.sendKeys("10/12/2003");
		
		driver.findElement(By.name("institute-class")).click();
		driver.findElement(By.xpath("//option[@value='15']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Hindi']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='English']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Sanskrit']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Home Science']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Math']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Science']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Art']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Computer']")).click();
		WebElement scrollsubject3 = driver.findElement(By.name("old-school"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].scrollIntoView(true);",scrollsubject3);
		driver.findElement(By.className("btn-text")).click();
		
		TakesScreenshot takeshot = (TakesScreenshot) driver;
		File takenscreenshot = takeshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\test1.png");
		try {
			com.google.common.io.Files.copy(takenscreenshot, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
	

}
