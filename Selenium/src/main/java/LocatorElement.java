import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		//WebElement forgotLink=driver.findElement(By.linkText("Forgotten account?"));
		//forgotLink.click();
		//WebElement forgotLink=driver.findElement(By.tagName("a"));
		//forgotLink.click();
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
		
		System.out.println(loginbutton.getSize());
		Dimension s= loginbutton.getSize();
		System.out.println(s.height);
		System.out.println(s.width);
		System.out.println("x cordinate"+loginbutton.getLocation().x);
		
		System.out.println("y cordinate"+loginbutton.getLocation().y);
		
		System.out.println(loginbutton.getLocation());
		String html=driver.getPageSource();
		System.out.println(html);
		
		
		
	}

}
