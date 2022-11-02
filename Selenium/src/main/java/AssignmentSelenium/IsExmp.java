package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
				 driver.manage().window().maximize();
				 WebElement logo=driver.findElement(By.xpath("//a[@href='index.php']//img[@src='images/logo.png']"));
				
				
				 boolean statuslogo;
				statuslogo=logo.isDisplayed();
				 System.out.println("Status of logo:"+statuslogo);
				 if(statuslogo=true)
				 {
				 System.out.println("Logo is displayed");
				
				 }
				 else
				 {
				 System.out.println("Logo is not displayed");
				 }
				

				 //WebElement radiobutton=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));

				// radiobutton.click();
				
				 //WebElement maleradiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
				
				
				 boolean statusmaleradiobutton = false;
				 statusmaleradiobutton=maleradiobutton.isEnabled();
				 System.out.println("EnabledStatus of maleradiobutton:"+statusmaleradiobutton);
				 if(statusmaleradiobutton=true)
				 {
				 System.out.println("MaleRadiobutton is enabled");
				
				 }
				 else
				 {
				 System.out.println("MaleRadiobutton is not enabled");
				 }
				
				 WebElement statusradiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
				 statusradiobutton.click();

	}

}
