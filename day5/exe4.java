package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exe4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.abhibus.com/bus-ticket-booking");
		
		WebElement frm = driver.findElement(By.id("source"));
		frm.sendKeys("Bangalore",Keys.ENTER);
		WebElement to = driver.findElement(By.id("destination"));
		to.sendKeys("Delhi",Keys.ENTER);
		WebElement date = driver.findElement(By.id("datepicker1"));
		
    	date.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','01/05/2023')", date);
	}
}