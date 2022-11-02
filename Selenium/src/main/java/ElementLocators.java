import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchFeild= driver.findElement(By.id("twotabsearchtextbox"));
		searchFeild.sendKeys();
		WebElement csssearchFeild= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		csssearchFeild.sendKeys("mobile");
		csssearchFeild.clear();
		WebElement csssearchButton= driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		//WebElement searchButton= driver.findElement(By.className("nav-input nav-progressive-attribute"));
		//searchButton.click();
	WebElement searchfeild= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchfeild.sendKeys("watch");
	//WebElement searchbutton= driver.findElement(By.xpath("//span[text()='Returns']"));
	//searchbutton.click();
	WebElement searchButton= driver.findElement(By.xpath("//a[contain(text(),'Best Sellers')]"));
			searchButton.click();


	}

}

