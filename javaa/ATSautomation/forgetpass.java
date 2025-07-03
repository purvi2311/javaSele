package ATSautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class forgetpass {
    WebDriver driver;

    @Test
	public class Dashboard {
	    private WebDriver driver;
	    private WebDriverWait wait;
	    
	   @BeforeClass
	   public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   }
	   
	   public void testInvalidUsernameOrPassword() throws InterruptedException {
	        driver.get("http://52.205.84.33:4000/");

       
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/header/div/div/div[3]/a/div")));
	        System.out.println(" button clicked successfully...");
	        button.click();
  

	        // Enter invalid username
	        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[3]/input")));
	        System.out.println(" email  filled successfully...");
	        Thread.sleep(3000);
	   
    }

    @AfterTest
    public void tearDown() {
       // driver.quit();
        System.out.println(" Browser closed.");
    }
}

}


