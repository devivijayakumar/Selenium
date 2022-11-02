package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchFeild= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
				searchFeild.sendKeys("7012055819");
		WebElement searchfeilds= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
				searchfeilds.sendKeys("12345696");
				WebElement searchbutton= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
				searchbutton.click();
				driver.navigate().refresh();
				WebElement searchbuttons= driver.findElement(By.xpath("//a[@class='_14Me7y']"));
				searchbuttons.click();
				
				
		
	}

}
