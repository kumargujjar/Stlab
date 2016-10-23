import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
public class gcd  {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "file:///home/ise/Downloads/hhh.html";
        
        driver.get(baseUrl);
       	WebElement email1 = driver.findElement(By.id("num1"));
       	email1.sendKeys("67854");
       	WebElement email2 = driver.findElement(By.id("num2"));
       	email2.sendKeys("12345632");
       	WebElement element = driver.findElement(By.id("calc"));
       	element.click();
	
        System.exit(0);
    }
}
