package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	//	Thread.sleep(3000);
	/*	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[.='Login ']")).click();
	//	ent.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sibasish");
		WebElement web = driver.findElement(By.xpath("//select[@name=\"active\"]"));
		Select sel = new Select(web);
		sel.selectByValue("false");
		driver.findElement(By.xpath("(//input[@name='billable'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='rate']")).sendKeys("100.00");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='sibasish']/../..//a[contains(text(),'delete')]")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
	*/	
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_T);
		
		
		Set<String> windows=driver.getWindowHandles();
		Thread.sleep(5000);
		System.out.println(windows.size());
		ArrayList<String> al=new ArrayList<String>(windows);
		Thread.sleep(5000);
		System.out.println(al.size());
		driver.switchTo().window(al.get(1));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("(//div[.='Fashion'])[2]")).click();
		WebElement ele= driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement mi= driver.findElement(By.xpath("//a[.='Mi']"));
		act.click(mi).perform();
		
		Robot rob1 = new Robot();
		rob1.keyPress(KeyEvent.VK_CONTROL);
		rob1.keyPress(KeyEvent.VK_T);
		rob1.keyRelease(KeyEvent.VK_CONTROL);
		rob1.keyRelease(KeyEvent.VK_T);		
		Set<String> windows1=driver.getWindowHandles();
		Thread.sleep(5000);
		System.out.println(windows1.size());
		ArrayList<String> al1=new ArrayList<String>(windows1);
		Thread.sleep(5000);
		System.out.println(al1.size());
		driver.switchTo().window(al1.get(2));
		driver.get("https://www.google.com/");
		
		WebElement search= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("selenium");
		List<WebElement> suggest=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggest.size());
		
		for(int i=0;i<suggest.size();i++)
		{
			String text=suggest.get(i).getText();
			if(text.equalsIgnoreCase("selenium interview questions"))
			{
				suggest.get(i).click();
				break;
			}
	    }
		
		Robot rob2 = new Robot();
		rob2.keyPress(KeyEvent.VK_CONTROL);
		rob2.keyPress(KeyEvent.VK_T);
		rob2.keyRelease(KeyEvent.VK_CONTROL);
		rob2.keyRelease(KeyEvent.VK_T);		
		Set<String> windows2=driver.getWindowHandles();
		Thread.sleep(5000);
		System.out.println(windows2.size());
		ArrayList<String> al2=new ArrayList<String>(windows2);
		Thread.sleep(5000);
		System.out.println(al2.size());
		driver.switchTo().window(al2.get(3));
		driver.get("https://www.ilovepdf.com");
		
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		driver.findElement(By.xpath("//span[.='Select PDF file']")).click();
		
		Thread.sleep(5000);

		StringSelection file = new StringSelection("C:\\Users\\LENOVO\\Desktop\\BBI TO BOM.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_ENTER);

		
	
		driver.findElement(By.xpath("//span[.='Convert to WORD']")).click();
		
	}
}
