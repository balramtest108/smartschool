package test1.smartschool;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class adminteacheradd {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions secure=new ChromeOptions();
secure.setAcceptInsecureCerts(true);
WebDriver driver=new ChromeDriver(secure);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
driver.get("https://smartidealsolution.com/admin/site/login");
driver.findElement(By.name("username")).sendKeys("remosi2606@kwalah.com");
driver.findElement(By.name("password")).sendKeys("cFtRtP");
Thread.sleep(15000);
driver.findElement(By.className("btn")).click();
driver.findElement(By.xpath("//span[normalize-space()='Human Resource']")).click();
driver.findElement(By.linkText("Staff Directory")).click();
driver.findElement(By.linkText("Add Staff")).click();
driver.findElement(By.name("employee_id")).sendKeys("balteacher1");
driver.findElement(By.name("role")).click();
driver.findElement(By.xpath("//option[normalize-space()='Teacher']")).click();
driver.findElement(By.name("name")).sendKeys("balramteaecher");
driver.findElement(By.id("email")).sendKeys("barlamteacher1@gmail.com");
driver.findElement(By.name("gender")).click();
driver.findElement(By.xpath("//option[@value='Male']")).click();
driver.findElement(By.name("dob")).sendKeys("02/12/1998");
driver.findElement(By.name("pincode")).sendKeys("110034");
WebElement chk = driver.findElement(By.name("note"));

JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("arguments[0].scrollIntoView(true);", chk);
Thread.sleep(2000);
chk.click();
driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']")).click();


 

	}

}
