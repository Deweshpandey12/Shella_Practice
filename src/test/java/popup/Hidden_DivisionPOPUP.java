package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_DivisionPOPUP 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//fetch the address of Date element
		driver.findElement(By.xpath("//text[text()=\"Date\"] ")).click();
		//Fetching the address of respective date
		driver.findElement(By.xpath("//div[text()='Jul']/../..//span[text()='26']")).click();
		//driver.findElement(By.xpath("//text[text()='24 Jul']")).isDisplayed();
	}
}
