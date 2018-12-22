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

public class Login {
	
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
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[1]/div/a")).click();
		driver.getWindowHandles();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/h3")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/iframe")));
		driver.findElement(By.xpath("//img[@alt='Customer Portal Login']")).click();
		System.out.println("paget Title :"+driver.getTitle());
		
		
		
		
		
		
		
		driver.quit();
		

	}
	

}
