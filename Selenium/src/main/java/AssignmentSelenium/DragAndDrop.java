package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		//WebElement draganddropsource= driver.findElement(By.xpath(("(//a[@class='button button-orange'])[2]")));
		//WebElement draganddropdestination= driver.findElement(By.xpath(("(//li[@class='placeholder'])[2]")));
		//action.dragAndDrop(draganddropsource, draganddropdestination).build().perform();
		
		//int x=draganddropsource.getLocation().getX();
		//int y=draganddropdestination.getLocation().getY();
		 //action.dragAndDropBy(draganddropsource, x, y).build().perform();*/
		driver.get("https://selenium.obsqurazone.com/range-sliders.php");
		driver.manage().window().maximize();
		WebElement click= driver.findElement(By.xpath("(//input[@type='range'])[1]"));
		action.moveToElement(click, 10, 0).click().build().perform();
		
		

	}

}
