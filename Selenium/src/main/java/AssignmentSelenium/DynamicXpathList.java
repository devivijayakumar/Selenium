package AssignmentSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();  
		list.add("Colorado");
		list.add("Arizona");
		list.add("New Mexico");
		list.add("Florida");
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement Multiplevalues= driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		Multiplevalues.click();
		for(String states:list)
		{
			WebElement Searchfeild= driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
			Searchfeild.sendKeys(states);
			WebElement Searchfeilds= driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']"));
			Searchfeilds.click();
		}

	}

}
