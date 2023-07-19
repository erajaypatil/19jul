package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		// fbsoftware
		
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\ChromeDriver.exe\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//loginpage
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sldkfjweiojro");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sdhrfuiewe");
		
		//click
		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(day);
		s.selectByIndex(2);
		Thread.sleep(2000);
	//	s.deselectByIndex(2);
	//	Thread.sleep(2000);
        s.selectByIndex(3);
	    Thread.sleep(2000);
		
		Select s1=new Select(month);		s1.selectByValue("5");
		Thread.sleep(2000);
		s1.selectByValue("12");
		Thread.sleep(2000);
		
		Select s2=new Select(year);
		s2.selectByValue("2022");
		Thread.sleep(2000);
		try
		{
		s2.selectByValue("2024");
		}
		catch(Exception e)
		{
			System.out.println("2024 is running");
		}
		
		s2.selectByValue("1992");
		Thread.sleep(2000);
		
		
		//firstname
		
		WebElement fname = driver.findElement(By.name("firstname"));
	
		fname.sendKeys("ajay");
		String fntext = fname.getText();
		System.out.println("text is" +fntext);
		
		//surname
		WebElement snametext = driver.findElement(By.name("lastname"));
		snametext.click();
		snametext.sendKeys("deshmukh");
		Thread.sleep(2000);
		
		//mono
		WebElement monotext = driver.findElement(By.name("reg_email__"));
		monotext.sendKeys("99224578742145");
		Thread.sleep(2000);
		
		//new password
		WebElement nepassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		nepassword.sendKeys("ajayrokade001#jgdhhi");
		Thread.sleep(2000);
		
		//feamelclick button
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/input[1]")).click();
		Thread.sleep(2000);
		
		//maleclick button
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]")).click();
		Thread.sleep(2000);
		
		//custom click button
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[3]/input[1]")).click();
		Thread.sleep(2000);
		
		//signup
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		

		
	}

}
