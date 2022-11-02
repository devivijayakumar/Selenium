package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		WebElement mouseover1= driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
		WebElement mouseover2= driver.findElement(By.xpath("//a[@id='windowMulti']"));
		action.moveToElement(mouseover1, 2, 3).build().perform();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//action.contextClick().build().perform();
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(rightclick).build().perform();
		WebElement deleteClickButton=driver.findElement(By.xpath("//span[text()='Delete']"));
		action.moveToElement(deleteClickButton).build().perform();
		//action.click().build().perform();
	    driver.get(driver.getCurrentUrl());
	    WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    action.doubleClick().build().perform();
	    action.doubleClick(doubleClickButton).build().perform();
		
		//action.moveToElement(mouseover2).build().perform();
		

	}

}
