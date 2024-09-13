package test1.smartschool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class onlineadmissionstudentreject {

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
		WebElement bttn = driver.findElement(By.className("btn"));
		bttn.click();
		try {
			WebElement captch = driver.findElement(By.xpath("//p[normalize-space()='Incorrect Captcha']"));
			
			if (captch.getText().contains("Incorrect Captcha")) {
		Thread.sleep(15000);
		captch.submit();		
		
					
	}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Online Admission']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Reject']")).click();
		driver.switchTo().alert().accept();
		
		
	}

}
