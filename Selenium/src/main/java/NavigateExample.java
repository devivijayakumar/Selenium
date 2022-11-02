import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}