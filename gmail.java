import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Email  {
    public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
        try{
		String baseUrl = "https://accounts.google.com";
		
		driver.get(baseUrl);
	       	WebElement email = driver.findElement(By.id("Email"));
	       	email.sendKeys("chandan.1si13is016@gmail.com");
	       	email.submit();
	       	
	       	WebDriverWait wait = new WebDriverWait(driver, 10);		
	       	WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("Passwd")));
	       	pass.sendKeys("2345");
	       	pass.submit();
	       	
	       	wait = new WebDriverWait(driver, 10);		
	       	WebElement GoogleApps = wait.until(ExpectedConditions.elementToBeClickable(By.id("gbwa")));
	       	GoogleApps.click();
	       	
		wait = new WebDriverWait(driver, 10);		
	       	WebElement Gmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("gb23")));
	       	Gmail.click();
	       	
	       	wait = new WebDriverWait(driver, 10);		
	       	WebElement Compose = wait.until(ExpectedConditions.elementToBeClickable(By.id(":hh")));
	       	Compose.click();
	       	
		wait = new WebDriverWait(driver, 20);		
	       	WebElement To = wait.until(ExpectedConditions.elementToBeClickable(By.id(":nb")));
	       	To.sendKeys("dish@gmail.com");
	       			
	       	WebElement Subject = wait.until(ExpectedConditions.elementToBeClickable(By.id(":mv")));
	       	Subject.sendKeys("This message was created automaticaly");
	       	WebElement Content = wait.until(ExpectedConditions.elementToBeClickable(By.id(":o0")));
	       	Content.sendKeys("Message from ST lab.... Program is working correctly");
	       	
	       	WebElement Send = wait.until(ExpectedConditions.elementToBeClickable(By.id(":ml")));
	       	Send.click();
		for(long i=0;i<10000;i++)
		for(long j=0;j<1000000;j++)
		{
	
		}
		System.out.println("Done!");
		driver.get("https://mail.google.com/mail/logout?hl=en");
		driver.close();
		System.exit(0);
	}
	catch(Exception e)
	{
		System.out.println("Error occured!!!");
		driver.close();
	}
        
    }
}
