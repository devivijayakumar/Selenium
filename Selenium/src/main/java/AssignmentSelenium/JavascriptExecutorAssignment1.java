package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		WebElement likefbbutton= driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		jse.executeScript("arguments[0].click();\r\n;", likefbbutton);
		WebElement followusbutton= driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		jse.executeScript("arguments[0].click();\r\n;", followusbutton);
	}

}
