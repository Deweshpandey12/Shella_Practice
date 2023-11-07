package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgeSliderElement 
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
		driver.findElement(By.xpath("//div[text()=\"Edit Goal\"]")).click();
		driver.findElement(By.xpath("//text[text()=\"Change\"]")).click();
		WebElement silderwidth = driver.findElement(By.xpath("//div[text()=\" Retirement Age:\"]//../..//span[@class=\"MuiSlider-root jss126 MuiSlider-colorPrimary\"]"));
		int xordinate = silderwidth.getLocation().getX();
		int yordinate=silderwidth.getLocation().getY();
		System.out.println("Width : "+silderwidth.getSize().getWidth());
		System.out.println("xordinate :"+xordinate);
		System.out.println("yordinate : "+yordinate);
		// Replace the locator with the appropriate method to find the slider element
		WebElement slider = driver.findElement(By.xpath("//span[@role='slider']"));
		// Get the width of the slider for later use
		
		// Create an instance of Actions class
		Actions actions = new Actions(driver);

		// Assuming you want to set the slider to 50% of its width, you can modify this value as needed
		int desiredPercentage = 50;

		// Calculate the desired position based on the percentage
		//int xOffset = (int) (width * (desiredPercentage / 100.0));
		//System.out.println("xOffset : "+xOffset);

		// Perform the dragging action
		actions.dragAndDropBy(slider, xOffset, 0).perform();

	}
}
