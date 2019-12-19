package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ConnectionString {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/eBizAdminLatest");
		driver.findElement(By.id("txtUserId")).sendKeys("admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnlogin")).click();
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.linkText("Tools"));
		Actions ac =new Actions(driver);
		ac.moveToElement(element).perform();
		JavascriptExecutor je =(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView(true;)",element);
		System.out.println(element.getText());
		driver.findElement(By.linkText("Indexing")).click();
		driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/ul/li/a")).click();
		int totalframes=driver.findElements(By.tagName("Frames")).size();
		System.out.println("tatal frames are "+totalframes);
		
		driver.quit();
	
	}
	public void openapp() {
		System.out.println("opened");
	}
	public void closeapp() {
		System.out.println("closed");
		
	}
}
