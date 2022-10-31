package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {

	public static void main(String[] args) {
		//set path for browser
		 
		 WebDriverManager.chromedriver().setup();
		 /*//to lanuch the chrome
		  * 
*/		 ChromeDriver driver=new ChromeDriver();

//returntype of get: void
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 //maximize the screen
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativesubmit")).click();
		 

	}

}
