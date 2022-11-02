package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		
		WebElement singlecheckbox= driver.findElement(By.xpath("//input[@class='form-check-input']"));
		action.click(singlecheckbox).build().perform();
		
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='check-box-one']"));
		action.click(checkbox1).build().perform();
		
		WebElement checkbox2= driver.findElement(By.xpath("//input[@id='check-box-two']"));
		action.click(checkbox2).build().perform();
		
		WebElement checkbox3= driver.findElement(By.xpath("//input[@id='check-box-three']"));
		action.click(checkbox3).build().perform();
		
		WebElement checkbox4= driver.findElement(By.xpath("//input[@id='check-box-four']"));
		action.click(checkbox4).build().perform();

	}

}
