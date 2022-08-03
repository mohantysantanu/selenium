package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement un= driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='santanu'", un);
		
		WebElement newac=driver.findElement(By.xpath("//a[.='Create New Account']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", newac);
		

	}

}
