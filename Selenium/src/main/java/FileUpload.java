import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fileupload= driver.findElement(By.xpath("//input[@id='file-upload']"));
		//fileupload.sendKeys("C:\\Users\\lenovo\\Desktop\\Doc.docx");
		File fileDOC= new File("C:\\Users\\lenovo\\Desktop\\Doc.docx");
		fileupload.sendKeys(fileDOC.getAbsolutePath());

	}

}
