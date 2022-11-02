package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValueAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement autoclosable= driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		System.out.println(autoclosable.getCssValue("background-color"));
		System.out.println(autoclosable.getCssValue("font-color"));
		System.out.println(autoclosable.getCssValue("font-size"));
		System.out.println(autoclosable.getCssValue("font-weight"));
		
		WebElement normal= driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		System.out.println(normal.getCssValue("background-color"));
		System.out.println(normal.getCssValue("font-color"));
		System.out.println(normal.getCssValue("font-size"));
		System.out.println(normal.getCssValue("font-weight"));
		
		WebElement autoclosablewarning= driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		System.out.println(autoclosablewarning.getCssValue("background-color"));
		System.out.println(autoclosablewarning.getCssValue("font-color"));
		System.out.println(autoclosablewarning.getCssValue("font-size"));
		System.out.println(autoclosablewarning.getCssValue("font-weight"));
		
		WebElement normalwarning= driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));
		System.out.println(normalwarning.getCssValue("background-color"));
		System.out.println(normalwarning.getCssValue("font-color"));
		System.out.println(normalwarning.getCssValue("font-size"));
		System.out.println(normalwarning.getCssValue("font-weight"));
		
		WebElement autoclosabledanger= driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
		System.out.println(autoclosabledanger.getCssValue("background-color"));
		System.out.println(autoclosabledanger.getCssValue("font-color"));
		System.out.println(autoclosabledanger.getCssValue("font-size"));
		System.out.println(autoclosabledanger.getCssValue("font-weight"));
		
		WebElement normaldanger= driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));
		System.out.println(normaldanger.getCssValue("background-color"));
		System.out.println(normaldanger.getCssValue("font-color"));
		System.out.println(normaldanger.getCssValue("font-size"));
		System.out.println(normaldanger.getCssValue("font-weight"));
		
		WebElement autoclosableinfo= driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
		System.out.println(autoclosableinfo.getCssValue("background-color"));
		System.out.println(autoclosableinfo.getCssValue("font-color"));
		System.out.println(autoclosableinfo.getCssValue("font-size"));
		System.out.println(autoclosableinfo.getCssValue("font-weight"));
		
		WebElement normalinfo= driver.findElement(By.xpath("//button[@id='normal-btn-info']"));
		System.out.println(normalinfo.getCssValue("background-color"));
		System.out.println(normalinfo.getCssValue("font-color"));
		System.out.println(normalinfo.getCssValue("font-size"));
		System.out.println(normalinfo.getCssValue("font-weight"));
		
		
		
		
		
		
		
		

	}

}
