package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TestLeaf");
		
		String Name="Raji";
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(Name);
		
		driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("Sarath");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(6000);
		
		
		String firstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(firstname);
		
		if(Name.equals(firstname)) {
			System.out.println("lead is created");
			
		}else {
			System.out.println("lead is not created");
		}
		
		
		
		
		
		

	}

}
