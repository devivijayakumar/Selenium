import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]//tbody//tr[3]//td[1]"));
		String data= table.getText();
		System.out.println(data);
		List<WebElement>namelements=driver.findElements(By.xpath("//tbody//tr[1]//td"));
		for(int i=0;i<namelements.size();i++)
		{
			String name= namelements.get(i).getText();
			System.out.println("the names are"+name);
		}
		for(WebElement s:namelements)
		{
			System.out.println(s.getText());
		}
	}

}
