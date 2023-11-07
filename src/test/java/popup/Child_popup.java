package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://skillrary.com/");
		String parent = driver.getWindowHandle();
		//address of gear element
		driver.findElement(By.linkText(" GEARS ")).click();
		driver.findElement(By.linkText(" SkillRary Compilers")).click();
		Set<String> child = driver.getWindowHandles();
		
		
	}
}
