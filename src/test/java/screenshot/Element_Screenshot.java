package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element_Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.pensionbox.in/getstarted");
		try
		{
		WebElement nametextField = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		int xcor = nametextField.getLocation().getX();
		int ycor = nametextField.getLocation().getY();
		int height = nametextField.getSize().getHeight();
		int width = nametextField.getSize().getWidth();
		BufferedImage fullImage = ImageIO.read(src);
		BufferedImage nameFieldImage = fullImage.getSubimage(xcor, ycor, height, width);
		ImageIO.write(nameFieldImage, "png", src);
		File dest = new File("./Scrren-shot/nameField.png");
		FileUtils.copyFile(src, dest);
		}
		catch (Exception e) 
		{
            e.printStackTrace();
        } 

		
		
	}
}
