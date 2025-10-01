
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuIcloud {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://Google.com");
		Thread.sleep(2000);
		
		driver.get("https://gu.icloudems.com");
		
		driver.findElement(By.id("useriid")).sendKeys("23SCSE1040684");
		Thread.sleep(2000);
		
		driver.findElement(By.id("actlpass")).sendKeys("Piyushkumar@123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='psslogin']")).click();
		Thread.sleep(2000);

		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	

		
	}

}

