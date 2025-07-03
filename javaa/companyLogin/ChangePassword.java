package companyLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangePassword {

	public class Dashboard {
	    private WebDriver driver;
	    @BeforeClass
	    
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        new WebDriverWait(driver, Duration.ofSeconds(15));
	   }
	    
	    @Test
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
	        emailField.sendKeys("veersharma2860@gmail.com");
	        
	        WebElement passwordField = driver.findElement(By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[4]/input"));
	        System.out.println(" password  filled successfully...");
	        passwordField.sendKeys("Veer@123");

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
	        
	        driver.findElement(By.xpath("//*[@id=\"kt_header_user_menu_toggle\"]/div[1]/div[2]")).click();
	        System.out.println("dashboard opened successfully");
	        
	        driver.findElement(By.xpath("//*[@id=\"kt_header_user_menu_toggle\"]/div[2]/div[6]/a")).click();
	        System.out.println("changepass clicked successfully");
	        
	        WebElement currpassElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/input"));
	        currpassElement.sendKeys("Nikh@123");
	        System.out.println("currenpass filled successfully");
	        
	        WebElement newpassElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[2]/div/input"));
	        newpassElement.sendKeys("Nikhi@123");
	        System.out.println("newpass filled successfully");
	        
	        WebElement confirmpassElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[3]/div/input"));
	        confirmpassElement.sendKeys("Nikhi@123");
	        System.out.println("confirm pass successfully");
	         
	         driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/button")).click();
	        
	        
	        
	        
	        
	        
	        
	        
	 	    }
	 		    @AfterClass
	 		    public void tearDown() {
	 		        if (driver != null) {
	 		           
	 		            System.out.println("Browser closed.");
	 		        }
	 	
	 	
	 	
	 		    }}}
	        
