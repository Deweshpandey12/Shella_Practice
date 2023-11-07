package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Calender 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.pensionbox.in/getstarted");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys("6201940513");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name=\"char1\"]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name=\"char2\"]")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name=\"char3\"]")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name=\"char4\"]")).sendKeys("1");
		
	}
}
