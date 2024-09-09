package test1.smartschool;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;



public class partnersignup {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions secuer = new ChromeOptions();
secuer.setAcceptInsecureCerts(true);
WebDriver driver=new ChromeDriver(secuer);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.get("https://smartidealsolution.com/");
driver.findElement(By.xpath("//span[normalize-space()='Become A Partner']")).click();
driver.findElement(By.name("institute_name")).sendKeys("balram vidya mandir");
driver.findElement(By.name("institute_email")).sendKeys("balram1234@gmail.com");
driver.findElement(By.name("institute_address")).sendKeys("ssr,haryan");
driver.findElement(By.name("udise_code")).sendKeys("123451234513");
driver.findElement(By.name("institute_pincode")).sendKeys("120002");
driver.findElement(By.name("candidate_name")).sendKeys("ram kumar");
driver.findElement(By.name("candidate_designation")).sendKeys("hr");
driver.findElement(By.name("contact_number")).sendKeys("9020158754");
driver.findElement(By.name("contact_email")).sendKeys("balramji@gmail.com");
WebElement add1 = driver.findElement(By.name("contact_address"));
add1.sendKeys("ssr,faridabad,haryana");
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("arguments[0].scrollIntoView(true)",add1);
driver.findElement(By.className("btn-text")).click();
Thread.sleep(2000);
TakesScreenshot screenshot=(TakesScreenshot) driver;
File getter=screenshot.getScreenshotAs(OutputType.FILE);
File destination=new File("D:\\test3.png");
try {
	Files.copy(getter, destination);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Thread.sleep(120000);
driver.findElement(By.id("otpsubmit")).click();



	}

}
