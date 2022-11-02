package AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		WebElement getnewuser=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		boolean getnewuserbutton;
		getnewuserbutton=getnewuser.isDisplayed();
		 System.out.println("Status of get new user button:"+getnewuserbutton);
		 if(getnewuserbutton=true)
		 {
			 System.out.println("Get New User Button is present");
			 
		 }
		 else
		 {
			 System.out.println("Get New User Button is not present");
		 }
		
		getnewuser.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']")));
		WebElement picture= driver.findElement(By.xpath("//div[@class='card text-center']"));
		boolean displaypicture;
		displaypicture=picture.isDisplayed();
		System.out.println("Status of profile picture:"+displaypicture);
		if(displaypicture=true)
		{
			System.out.println("profile picture is displayed");
		}
		else
		{
			System.out.println("profile picture is not displayed");
		}
		WebElement name=driver.findElement(By.xpath("//h5[@class='card-title']"));
		System.out.println("name of the person displayed: "+name.getText());
		
	}

}
