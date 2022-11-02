import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement jsalert= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsalert.click();
		String message= driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
		
		WebElement jsconfirm= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		jsconfirm.click();
		String message1= driver.switchTo().alert().getText();
		System.out.println(message1);
		driver.switchTo().alert().dismiss();
		jsconfirm.click();
		driver.switchTo().alert().accept();
		WebElement jsprompt= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		jsprompt.click();
		driver.switchTo().alert().sendKeys("Devi");
		driver.switchTo().alert().dismiss();
		jsprompt.click();
		driver.switchTo().alert().sendKeys("Devi");
		driver.switchTo().alert().accept();
		
	}

}
