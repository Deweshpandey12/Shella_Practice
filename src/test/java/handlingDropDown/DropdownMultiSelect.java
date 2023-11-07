package handlingDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiSelect 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement multidropdown = driver.findElement(By.id("cars"));
		Select sel = new Select(multidropdown);
		sel.selectByIndex(2);
		sel.selectByValue("299");
		//select by visible text will not work
		//deselect value
		sel.deselectByIndex(2);
		sel.deselectByValue("299");
		
		//fetching all value
		List<WebElement> alldropdownvalue = sel.getOptions();
		for(WebElement ele:alldropdownvalue)
		{
			System.out.println(ele.getText());
		}
	}
}
