package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDelete {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//	Click create leads
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//enter your company name 
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TestLeaf");
		
		//enter your first name
		//String Name="Raji";
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Raji");
		
		// enter your last name
		driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("Sarath");
		
		// click on create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		System.out.println("Deleted successfully");
		

	}

}
