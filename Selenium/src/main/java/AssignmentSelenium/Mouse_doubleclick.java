package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		WebElement clickandhold= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		action.clickAndHold(clickandhold).build().perform();
		clickandhold.sendKeys("devi");
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Show Message']"));
		action.doubleClick(doubleclick).build().perform();
	}

}
