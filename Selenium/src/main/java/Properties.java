import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement searchfeild= driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundcolor= searchfeild.getCssValue("background-color");
		String color= searchfeild.getCssValue("color");
		System.out.println(backgroundcolor);
		System.out.println(color);
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement okbutton= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String actualbackgroundcolor= okbutton.getCssValue("background-color");
		System.out.println(actualbackgroundcolor);
		String Expectedcolor= "rgba(251, 121, 43, 1)";
		
		if(Expectedcolor.equals(actualbackgroundcolor))
		{
			System.out.println("background color maatching");
		}
		else
		{
			System.out.println("background color not maatching");
		}
		System.out.println(okbutton.getCssValue("font-size"));
		System.out.println(okbutton.getCssValue("font-family"));
		System.out.println(okbutton.getCssValue("font-weight"));
		System.out.println(okbutton.getCssValue("font-style"));
		
		
		
		
		
		
		
		
		

	}

}
