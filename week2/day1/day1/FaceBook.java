package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
				// Step 2: Launch the chromebrowser
				// Step 3: Load the URL https://en-gb.facebook.com/
				// Step 4: Maximise the window
				// Step 5: Add implicit wait
				// Step 6: Click on Create New Account button
				// Step 7: Enter the first name
				// Step 8: Enter the last name
				// Step 9: Enter the mobile number
				// Step 10: Enterthe password
				// Step 11: Handle all the three drop downs
				// Step 12: Select the radio button "Female" 
				//( A normal click will do for this step) 
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver=new ChromeDriver(); 
				
				driver.get("https://en-gb.facebook.com");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.linkText("Create New Account")).click();
				
				driver.findElement(By.name("firstname")).sendKeys("Raji");
				
				driver.findElement(By.name("lastname")).sendKeys("Sarath");
				
				driver.findElement(By.name("reg_email__")).sendKeys("55555");
				
				driver.findElement(By.id("password_step_input")).sendKeys("rrrr");
				
				 WebElement select1 = driver.findElement(By.id("day"));
				 Select obj =new Select(select1);
					obj.selectByValue("11");
					
					
					WebElement select2 = driver.findElement(By.id("month"));
					Select obj1= new Select(select2);
					obj1.selectByVisibleText("Sep");
					

					WebElement select3 = driver.findElement(By.id("year"));
					Select obj2= new Select(select3);
					obj2.selectByIndex(1);
					
					driver.findElement(By.name("sex")).click();
		

	}

}
