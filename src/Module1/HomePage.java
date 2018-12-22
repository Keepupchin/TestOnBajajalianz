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

public class HomePage {
	
	WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
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
		
		
		
//======================verify pageLogo=====================//
		boolean pagelogo = driver.findElement(By.id("img-logo")).isEnabled();
		
		if (pagelogo=true) {
			System.out.println("pagelogo is enabled");
		}else {System.out.println("pagelogo is unabled");}
		

//======================verify the search button========================//
		
	driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/input[4]")).sendKeys("Term insurence"+Keys.ENTER);	
	System.out.println("Page title is :="+driver.getTitle());	
	

		
		driver.close();
		

	}
	

}
