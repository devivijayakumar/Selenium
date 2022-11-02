package AssignmentSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println("url="+url);
		driver.get(driver.getCurrentUrl());
	}

}
