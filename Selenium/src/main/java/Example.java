import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchFeild= driver.findElement(By.id("twotabsearchtextbox"));
		searchFeild.sendKeys("mobile");
		List<WebElement>suggestions= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction]"));
		for(WebElement s:suggestions)
		{
			System.out.println(s.getText());
		}

	}

}
