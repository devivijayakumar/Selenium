import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		String State="New York";
		WebElement States= driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		States.click();
		WebElement StateSearchfeild= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		StateSearchfeild.sendKeys(State);
		driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='"+State+"']")).click();
		//System.out.println("//ul[@class='select2-results__options']//li[text()='"+State+"']");
		
		
	}

}
