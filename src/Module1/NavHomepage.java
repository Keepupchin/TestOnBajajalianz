package Module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NavHomepage {
	
	WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip=new FileInputStream("D:\\Workspace\\BajajAllianz\\src\\config.properties");
		prop.load(ip);
		
		System.setProperty(prop.getProperty("driver_key"), prop.getProperty("chromedriver_location"));
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("home_url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
//Term Plan
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//ULIP		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//Retirement Plans		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[3]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[3]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//Savings Plan		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[4]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[4]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//Investment Plan		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[5]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[5]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//Fund performance		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
//Customer service		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[7]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[7]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
		
// Renew Online		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[8]/a"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[8]/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to(prop.getProperty("home_url"));
	
//===========		sameway other 8 bars============================================
		
		

		
		driver.quit();
		

	}
	

}
