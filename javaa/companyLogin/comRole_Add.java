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

public class comRole_Add {

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
	        
	        
	       driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[2]/div/div/div[1]/div[2]/div/a/button")).click();
	       System.out.println("clicked on add role button");
	        
	        WebElement roleNameElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/div/div/input"));
	        roleNameElement.sendKeys("UI/UX");
	        System.out.println("role name filled successfully");
	        
	        WebElement statusElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/div/div/input"));
	        statusElement.click();
	        System.out.println("status changed successfully");
	        
	        WebElement rolestatusCheckbox = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_notifications\"]/div/table/tbody/tr[3]/td[1]/label/input"));
	        rolestatusCheckbox.click();
	        System.out.println("new team member clicked successfully");
	        
	
	        WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_notifications\"]/div/table/tbody/tr[5]/td[1]/label/input"));
	        newsletter.click();
	        System.out.println("newsletter clicked successfully");
	
	        WebElement button1 = driver.findElement(By.xpath("//button[text()='Create']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button1);
	        System.out.println("role created successfully");
	        Thread.sleep(10000);
	        
	        
	driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[5]/div/ul/li[1]/p")).click();
	System.out.println("clicked on team button ");
	
	         driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div[1]/button")).click();
	         System.out.println("added a team");
	
	         WebElement fnamElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[1]/div/div/div[1]/input"));
	         fnamElement.sendKeys("tso");
	         System.out.println("filled first name");
	
	         WebElement lnamElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[1]/div/div/div[2]/input"));
	         lnamElement.sendKeys("yum");
	         System.out.println("filled last name");
	    
	         WebElement imageElement = driver.findElement(By.id("team-image"));
	         imageElement.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\girl.webp");
	         System.out.println("image uploaded");
	         Thread.sleep(3000);
	         
	         WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[3]/div/input"));
	         emailElement.sendKeys("tsoso@djdf.com");
	         System.out.println("email filled successfully");
	
	         WebElement rolElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[4]/div/select/option[2]"));
	         rolElement.click();
	         System.out.println("role selected successfully");
	         
	         WebElement phonElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[5]/div/input"));
	         phonElement.sendKeys("5555555");
	         System.out.println("phone number filled successfully");
	
	         WebElement statusElement2 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[2]/form/div/div/div[2]/div[1]/div[6]/div/div/input"));
	         statusElement2.click();
	         System.out.println("status selected successfully");
	    
	         WebElement creatElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div/div[1]/div/div[2]/form/div/div/div[2]/div[2]/button[2]"));
	         creatElement.click();
	         System.out.println("Team created successfully ");
	    }
	        
		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		           
		            System.out.println("Browser closed.");
		        }
	
	
	
	
	
}}}
