package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class exe3 {
		public static void main(String [] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			WebElement cusid=driver.findElement(By.name("cusid"));
		       cusid.sendKeys("401");
		       WebElement submit=driver.findElement(By.name("submit"));
		       submit.click();
		       driver.switchTo().alert().dismiss();
		       cusid.clear();
		       cusid.sendKeys("402");
		       submit.click();
		       driver.switchTo().alert().accept();  
			}
		}
