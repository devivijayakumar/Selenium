package AssignmentSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-dual-list.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>change= driver.findElements(By.tagName("option"));
		for(WebElement changing:change)
		{
			changing.click();
			
			
		}
		WebElement clicks= driver.findElement(By.xpath("//button[@class='btn btn-sm btn-block btn-info add']"));
		clicks.click();
	}

}
