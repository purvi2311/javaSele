package ATSautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class superCom_Edit {
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
//
//	      
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/header/div/div/div[3]/a/div")));
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
	  
           //DASHBOARD

	        WebElement jobPostLink1 = driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[3]/a/span/span"));
	        System.out.println("comp Is enabled: ");
	         jobPostLink1.click();
	         
	         
	         driver.findElement(By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[6]/div/div[3]/a/button/i")).click();
	         
	         
	  	   WebElement comName = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/form/div[1]/div[1]/div/input"));
	  	   comName.clear();
	         System.out.println(" comName  filled successfully...");
	         comName.sendKeys("seleniumiee");
	         
	         WebElement Cemail = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/form/div[1]/div[2]/div/div/div[1]/input"));
	         Cemail.clear();
	         System.out.println(" Cemail  filled successfully...");
	         Cemail.sendKeys("seleiee@insight.com");
	         
	         WebElement desc = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/form/div[1]/div[4]/div/div/div/textarea"));
	         desc.clear();
	         System.out.println(" desc  filled successfully...");
	         desc.sendKeys("123456789");
	         Thread.sleep(3000);
	         
	         WebElement Altph = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/form/div[1]/div[5]/div/input"));
	         Altph.clear();
	         System.out.println(" Altph  filled successfully...");
	         Altph.sendKeys("123456");
	         Thread.sleep(3000);
	         
	         
//	         WebElement imageupl =  driver.findElement(By.id("company-image"));
//	         System.out.println(" image uploaded successfully...");
//	         imageupl.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\girl.jpg");
//	         Thread.sleep(3000);  
	         
	         
	         
	         WebElement phnumElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/form/div[1]/div[14]/div[3]/div/div/div[2]/input"));
	         phnumElement.clear();
	         System.out.println("phune num filled successfully");
	         phnumElement.sendKeys("999954321");
	         
	         
	         
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div/form/div[2]/a")).click();
	  	   System.out.println("Company edited successfully");
	  	 Thread.sleep(3000);
	         
	         
	         
	         
	         
	         
	   }
	  	   @AfterClass
	  	    public void tearDown() {
	  	        if (driver != null) {
	  	           
	  	            System.out.println("Browser closed.");
	  	        
	  	   }}
	}
	}