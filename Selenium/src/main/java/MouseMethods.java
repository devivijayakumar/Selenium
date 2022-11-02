import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		WebElement hellosignin= driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		action.moveToElement(hellosignin).build().perform();
		action.moveToElement(hellosignin, 50, 20).build().perform();
		//action.moveByOffset(0, 0)
		//action.click().build().perform();
		//action.click(hellosignin).build().perform();
		WebElement amazonmouse= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.clickAndHold().build().perform();
		action.clickAndHold(amazonmouse).build().perform();
		Thread.sleep(3000);
		action.release();
	}

}
