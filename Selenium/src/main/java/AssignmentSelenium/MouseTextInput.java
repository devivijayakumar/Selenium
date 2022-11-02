package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseTextInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		WebElement textinputfeild= driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		action.sendKeys(textinputfeild, "Devi").build().perform();
		action.keyDown(textinputfeild, Keys.CONTROL).build().perform();
		action.sendKeys(textinputfeild, "a").build().perform();
		//action.keyUp(textinputfeild, Keys.CONTROL).build().perform();
		action.keyDown(textinputfeild, Keys.BACK_SPACE).build().perform();

	}

}
