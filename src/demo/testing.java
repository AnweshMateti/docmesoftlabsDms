package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/AdminDel");
	    driver.findElement(By.id("txtUserId")).sendKeys("admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnlogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"divFrameHolder\"]/div/ul/li[7]/a/img")).click();
		
			driver.quit();
	
	
	}
}
