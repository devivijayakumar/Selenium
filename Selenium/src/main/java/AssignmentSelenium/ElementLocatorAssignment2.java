package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/?hl=en-US");
		driver.manage().window().maximize();
		WebElement searchFeild= driver.findElement(By.name("q"));
		searchFeild.sendKeys("selenium");
		searchFeild.click();
				
				
				
							
				
	}

}
