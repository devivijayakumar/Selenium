package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://fast.com");
		driver.manage().window().maximize();
		WebElement logo= driver.findElement(By.xpath("//div[@class='logo centered']"));
		boolean logostatus;
		logostatus=logo.isDisplayed();
		 //System.out.println("Status of logo:"+logostatus);
		 if(logostatus=true)
		 {
			 System.out.println("logo is displayed"); 
			 
		 }
		 else
		 {
			 System.out.println("logo is not displayed");
		 }
			WebElement speed= driver.findElement(By.xpath("//div[@id='speed-value']"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String internet=speed.getText();
			 System.out.println("speed of internet:"+internet); 

			

		 
		 


	}

}
