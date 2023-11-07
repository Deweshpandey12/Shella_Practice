package handlingDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResourcesDropDownHandling 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.pensionbox.in/");
		driver.findElement(By.xpath("(//div[text()=\"Resources\"])[1]")).click();
		//WebElement multidropdown = driver.findElement(By.xpath("//ul[@id=\"composition-menu\"]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id=\\\"composition-menu\\\"]e")));

        // Get the text of the selected option
        String selectedOptionText = dropdownOption.getText();
        System.out.println("Selected option: " + selectedOptionText);
	}
}
