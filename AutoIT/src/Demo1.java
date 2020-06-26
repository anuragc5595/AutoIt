import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.sodapdf.com/word-to-pdf/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//label[@class='choose-label']")).click();
		 
		 Runtime.getRuntime().exec("C:\\Users\\Hp\\Desktop\\Autoit\\document.exe");
		
		

	}

}
