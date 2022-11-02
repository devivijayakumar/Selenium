package AssignmentSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.xpath("//*[@id=\"dtBasicExample\"]//tbody//tr[7]//td[4]"));
		System.out.println("Age of Herrod Chandler is "+table.getText());
		List<WebElement>offices=driver.findElements(By.xpath("//*[@id=\"dtBasicExample\"]//tbody//td[3]"));
		System.out.println("Offices are:");
		for(int i=0;i<offices.size();i++)
		{
			
			System.out.println(offices.get(i).getText());
		}
		List<WebElement>details=driver.findElements(By.xpath("//*[@id=\"dtBasicExample\"]//tbody//tr[4]"));
		System.out.println("details of Cedric Kelly are:");
		for(int i=0;i<details.size();i++)
		{
			
			System.out.print(details.get(i).getText());
		}
		
	}

}
