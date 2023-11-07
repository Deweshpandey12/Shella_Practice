package handlingDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement dropdown = driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"]"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(3);
		Thread.sleep(5000);
		sel.selectByVisibleText("Books");
		Thread.sleep(5000);
		sel.selectByValue("search-alias=amazon-pharmacy");
		//Fetch all the element inside drop down
		List<WebElement> alldropdownText = sel.getOptions();
		for(WebElement ele:alldropdownText)
		{
			System.out.println(ele.getText());
		}
	}
}
