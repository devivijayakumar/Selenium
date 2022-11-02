import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class ElementBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println("url="+url);
		driver.get(driver.getCurrentUrl());
	}

}
