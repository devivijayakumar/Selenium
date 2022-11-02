package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAssignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();

		WebElement selectcolor= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobj= new Select(selectcolor);
		selectobj.selectByValue("Green");
		WebElement selectcolors= driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectobj1= new Select(selectcolors);
		selectobj1.selectByVisibleText("Yellow");
		WebElement searchbutton= driver.findElement(By.xpath("//button[@id='button-first']"));
		searchbutton.click();

		
		
		


	}

}
