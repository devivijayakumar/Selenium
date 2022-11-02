package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement Multiplevalues= driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		Multiplevalues.click();
		WebElement Searchfeild= driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		Searchfeild.sendKeys("Colorado");
		WebElement Searchfeilds= driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
		Searchfeilds.click();
		Searchfeild.sendKeys("Arizona");
		WebElement Searchfeilds1= driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
		Searchfeilds1.click();
		Searchfeild.sendKeys("New Mexico");
		WebElement Searchfeilds2= driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
		Searchfeilds2.click();
		Searchfeild.sendKeys("Florida");
		WebElement Searchfeilds3= driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
		Searchfeilds3.click();
		
		
		
		
		
		
		

	}

}
