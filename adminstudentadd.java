package test1.smartschool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.sdk.internal.JavaVersionSpecific;
import net.bytebuddy.asm.Advice.Argument;

public class adminstudentadd {



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
				
				
				try {
					driver.findElement(By.className("btn")).click();
					Thread.sleep(5000);
					
					
				} catch (Exception e) {
					
					
					Thread.sleep(15000);
					
					driver.findElement(By.className("btn")).click();
					// TODO: handle exception
				}
		driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Student Admission']")).click();
		driver.findElement(By.name("class_id")).click();
		driver.findElement(By.xpath("//select[@id='class_id']//option[@value='16'][normalize-space()='Class A']")).click();
		driver.findElement(By.name("section_id")).click();
		driver.findElement(By.xpath("//option[@value='29']")).click();
		driver.findElement(By.name("firstname")).sendKeys("balram student");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.name("dob")).sendKeys("10/12/2002");
		
		driver.findElement(By.id("email")).sendKeys("balramstu1243@gmail.in");
		driver.findElement(By.name("candidate-pincode")).sendKeys("811211");
		driver.findElement(By.id("hindi")).click();
		driver.findElement(By.id("sanskrit")).click();
		driver.findElement(By.id("english")).click();
		driver.findElement(By.id("Math")).click();
		driver.findElement(By.id("Art")).click();
		driver.findElement(By.id("Computer")).click();
		driver.findElement(By.id("Agriculture")).click();
		driver.findElement(By.id("Geography")).click();
		
		WebElement scroll = driver.findElement(By.xpath("//h4[normalize-space()='Parent Guardian Detail']"));
JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("arguments[0].scrollIntoView(true);", scroll);
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@class='btn btn-info pull-right']")).click();
		
		
		

	}

}
