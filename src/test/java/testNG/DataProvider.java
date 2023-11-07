package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider 
{
	@org.testng.annotations.DataProvider
	public Object [][] getData()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="ahasjg";
		a[0][1]="12dfgkj";
		
		a[1][0]="12345";
		a[1][1]="asdf1234";
		
		a[2][0]="asd12$#@#";
		a[2][1]="yhsj)(*&";
		return a;
	}
	@Test(dataProvider="getData")
	public void demo(String username,String psd)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(psd);
		
		driver.findElement(By.name("login")).click();
	}
}
