package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-alert.php ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		
		WebElement autoclosablesucess= driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		action.click(autoclosablesucess).build().perform();
		System.out.println(autoclosablesucess.getCssValue("background-color"));
		
		WebElement normal= driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		System.out.println(normal.getCssValue("background-color"));
		
		WebElement autoclosablewarning= driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		System.out.println(autoclosablewarning.getCssValue("background-color"));
		
		WebElement normalwarning= driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));
		System.out.println(normalwarning.getCssValue("background-color"));
		
		WebElement autoclosabledanger= driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
		System.out.println(autoclosabledanger.getCssValue("background-color"));
		
		WebElement normaldanger= driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));
		System.out.println(normaldanger.getCssValue("background-color"));
		
		WebElement autoclosableinfo= driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
		System.out.println(autoclosableinfo.getCssValue("background-color"));
		
		WebElement normalinfo= driver.findElement(By.xpath("//button[@id='normal-btn-info']"));
		System.out.println(normalinfo.getCssValue("background-color"));


	}

}
