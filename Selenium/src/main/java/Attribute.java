import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchFeild= driver.findElement(By.id("searchDropdownBox"));
		searchFeild.sendKeys("mobile");
		String attributevalue= searchFeild.getAttribute("id");
		System.out.println(attributevalue);
		String expectedtooltip="search in";
		//WebElement.getAttribute("title");

	}

}
