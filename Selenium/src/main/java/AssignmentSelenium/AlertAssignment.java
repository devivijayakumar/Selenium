package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement clickme1= driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme1.click();
		driver.switchTo().alert().accept();
		
		WebElement clickme2= driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		driver.switchTo().alert().dismiss();
		
		WebElement clickforpromt= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickforpromt.click();
		driver.switchTo().alert().sendKeys("Devi");
		driver.switchTo().alert().accept();

	}

}
