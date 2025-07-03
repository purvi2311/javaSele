package ATSautomation;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class superJob_Edit {
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
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/header/div/div/div[3]/a/div")));
	        System.out.println(" button clicked successfully...");
	        button.click();


	        // Enter invalid username
	        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[3]/input")));
	        System.out.println(" email  filled successfully...");
	        Thread.sleep(3000);
	        emailField.sendKeys("spurvi8077@gmail.com");

	        // Enter invalid password
	        WebElement passwordField = driver.findElement(By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[4]/input"));
	        System.out.println(" password  filled successfully...");
	        passwordField.sendKeys("Spurvi@123");

	        // Click Login button
	        WebElement loginSubmitButton = driver.findElement(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[6]/div/button/span"));
	        System.out.println(" submitted  successfully...");
	        loginSubmitButton.click();

	        // Enter OTP
	        WebElement otpField = driver.findElement(By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[3]/div[2]/div/input[1]"));
	        System.out.println(" otp  filled successfully...");
	        otpField.sendKeys("123456");

	        // Click OTP Submit button
	        WebElement otpSubmitButton = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[4]/button"));
	        System.out.println(" otpbutton  clicked successfully...");
	        otpSubmitButton.click();
	        Thread.sleep(5000); 
	        
	        
	        
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[2]/a/span/span")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button[2]/i")).click();
	    WebElement upnameElement =driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div/div/div[4]/div[2]/form/div/div/div[2]/div[1]/div[1]/div/div/input"));
	    System.out.println(" updated Name   successfully...");
	    upnameElement.sendKeys("career");
	    upnameElement.click();
	    
//	    
//	     WebElement upstatusElement = driver.findElement(By.className("In-Active"));
//	     System.out.println(" status  updated successfully...");
//	     upstatusElement.click();
//	     Thread.sleep(5000); 
//	     
	     
	     WebElement upClientNElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div/div/div[4]/div[2]/form/div/div/div[2]/div[1]/div[5]/div[2]/input"));
	     System.out.println("client id updated successfully...");
	     upClientNElement.click();
	     upClientNElement.sendKeys("d");
	     Thread.sleep(5000); 
	     
	     driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div/div/div[4]/div[2]/form/div/div/div[2]/div[2]/button[2]"));
	   }
	    
	    
	    
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	           
	            System.out.println("Browser closed.");
	        }
	    
	    
	    
		
	}
	
	
	
	
	
	
	
	
	}
	
}

