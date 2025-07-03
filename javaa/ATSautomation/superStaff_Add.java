package ATSautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.awt.SplashScreen;
import java.time.Duration;

@Test
public class superStaff_Add {
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
 
        // Click on login button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/header/div/div/div[3]/div[1]/div")));
        System.out.println(" button clicked successfully...");
        button.click();
             
        WebElement loginbuttElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div/div[3]/div[1]/div[2]/a[1]"));
        loginbuttElement.click();
        System.out.println("login button clicked successfully");
        
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
        WebElement loginSubmitButton = driver.findElement(By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[6]/div/button/span"));
        System.out.println(" submitted  successfully...");
        loginSubmitButton.click();

        // Enter OTP
        WebElement otpField = driver.findElement(By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[3]/div[2]/div/input[1]"));
        System.out.println(" otp  filled successfully...");
        otpField.sendKeys("123456");

        // Click OTP Submit button
        WebElement otpSubmitButton = driver.findElement(By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[4]/button"));
        System.out.println(" otpbutton  clicked successfully...");
        otpSubmitButton.click();
        Thread.sleep(5000); 
    

        WebElement comp = driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[3]/a/span/span"));
        System.out.println("jobPostLink1 Is enabled: ");
         comp.click();
        
        WebElement staffbuttElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[6]/div/div[1]/button/i"));
        staffbuttElement.click();
        System.out.println("staff button clicked successfully");
        
        
        WebElement SnamElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[2]/div/div/input"));
        SnamElement.sendKeys("Staffname");
        System.out.println("staff name filled successfully");
    
        WebElement semailElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[3]/div/div/input"));
        semailElement.sendKeys("kuchbhi@djfs.com");
        System.out.println("email filled in staff successfully");
    
        WebElement sphnumElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[4]/div/div/input"));
        sphnumElement.sendKeys("657583");
        System.out.println("staff phone number filled successfully");
       
    
        WebElement rolenamElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[6]/div/div/input"));
        rolenamElement.sendKeys("rolename");
        System.out.println("role name filled successfully");
        
        WebElement roleemail = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[7]/div/div/input"));
        roleemail.sendKeys("henry@dbhj.com");
        System.out.println("role email filled successfully");
        
        WebElement rolephnumElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[8]/div/div/input"));
        rolephnumElement.sendKeys("456789");
        System.out.println();
        
        WebElement assignElement = driver.findElement(By.xpath("/html/body/div/div/div/div[6]/form/div/div/div[2]/div[2]/button[2]"));
        assignElement.click();
        System.out.println("staff assigned succefully");
        Thread.sleep(3000);
        
        WebElement closebuttElement = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[6]/form/div/div/div[1]/div/i"));
        closebuttElement.click();
        
        
        
        
    }  @AfterClass
    public void tearDown() {
        if (driver != null) {
           
            System.out.println("Browser closed.");
        }
    }
}
