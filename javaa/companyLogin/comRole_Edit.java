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

public class comRole_Edit {

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
	        driver.findElement(By.xpath("//*[@id=\"kt_header_user_menu_toggle\"]/div[2]/div[5]/a")).click();
	        System.out.println("profile clicked successfully");
	        driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[5]/div/ul/li[2]/p")).click();
	        System.out.println("superadmin clicked successfully");
	        driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/ul/li[2]/p")).click();
	        System.out.println("role clicked successfully");
	        
	        driver.findElement(By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[5]/div/div[2]/a/button")).click();
	        System.out.println("name edited successfully");
	        Thread.sleep(10000);
	        
	        WebElement nameEditElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/div/div/input"));
	        nameEditElement.clear();
	        nameEditElement.sendKeys("graphics");
	        System.out.println("name Edited successfully");
	        Thread.sleep(3000);
	        
	        WebElement savechngsbutton1 = driver.findElement(By.xpath("//button[text()='Save Changes']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", savechngsbutton1);
	        System.out.println("role created successfully");
	        Thread.sleep(10000);
	                
	    	
	        driver.findElement(By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[7]/div/div[2]/button/i")).click();
	        System.out.println("clicked on edit");
	        Thread.sleep(6000);
	        
	        WebElement renamElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[1]/div[1]/div/div/div[1]/input"));

	        renamElement.clear();
	        renamElement.sendKeys("tsooo");
	        System.out.println("renamed successfully");
	        Thread.sleep(3000);
	        
	        
	        WebElement lnamElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[1]/div[1]/div/div/div[2]/input"));
	        lnamElement.clear();
	        lnamElement.sendKeys("yummmm");
	        System.out.println("lname renamed");
	        Thread.sleep(12000);
	        
	        WebElement  emailchange = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[1]/div[3]/div/input"));
	       // imagchange.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\girl.webp");
	        emailchange.sendKeys("hey@hvg.com");
	        System.out.println("email changed successfully");
	        Thread.sleep(3000);
	        
	         driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[1]/div[4]/div/select")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[1]/div[4]/div/select/option[2]")).click();
            System.out.println("role selected successfully");
            Thread.sleep(3000);
	        
	        WebElement saveElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[4]/form/div/div/div[2]/div[2]/button[2]"));
	         saveElement.click();
	         System.out.println("Team created successfully ");
	        
	        
	        
	    }
		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		           
		            System.out.println("Browser closed.");
		        }
	
	
	
		    }}}
