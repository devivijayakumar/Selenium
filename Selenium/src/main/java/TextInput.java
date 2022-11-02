import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		WebElement textfeild= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		action.sendKeys(textfeild, "devi").build().perform();
		action.keyDown(textfeild, Keys.CONTROL).build().perform();
		action.sendKeys(textfeild, "a").build().perform();
		//action.release(textfeild).build().perform();
		action.keyUp(textfeild, Keys.CONTROL).build().perform();
		action.keyDown(textfeild, Keys.BACK_SPACE).build().perform();
		//action.release(textfeild).build().perform();
		action.keyUp(textfeild, Keys.BACK_SPACE).build().perform();
		textfeild.clear();
		
		textfeild.sendKeys("devi vijayakumar");
		action.sendKeys(textfeild, Keys.BACK_SPACE).build().perform();
		
		
		

	}

}
