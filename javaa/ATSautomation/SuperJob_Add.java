package ATSautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.time.Duration;

@Test
public class SuperJob_Add {
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
 Thread.sleep(7000);
        // Click on login button
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/li[7]/a")));
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
        
        
      

        WebElement jobPostLink1 = driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[2]/a/span/span"));
        System.out.println("jobPostLink1 Is enabled: ");
         jobPostLink1.click();
         

//        
   driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/div/div[1]/div[2]/div/button")).click();
 System.out.println("added a new jobP");
        Thread.sleep(5000); 
        
        WebElement Jobportname = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[1]/div/div/input"));
        System.out.println("clicked on job portal");
        Jobportname.click();
        Thread.sleep(5000);
        WebElement namePor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[1]/div/div/input")));
        System.out.println(" name  filled successfully...");
        Thread.sleep(3000);
        namePor.sendKeys("purvi");
     
        WebElement statusPor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[2]/div/select")));
        driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[2]/div/select/option[2]")).click();
        statusPor.click();
        if (!statusPor.isSelected()) {
        	statusPor.click();
        Thread.sleep(3000);
        }
        
        WebElement imagePor = driver.findElement(By.id("job-portal-image"));
     		imagePor.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\bf1a031f0f65e284e2d500009ab78263.jpg");
        Thread.sleep(3000);
       
     WebElement checkboxnPor = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[4]/div/div/input"));
     checkboxnPor.click();
     if (!checkboxnPor.isSelected()) {
    	 checkboxnPor.click();
     }

     // Optional: verify it's selected
     System.out.println("Checkbox selected: " + checkboxnPor.isSelected());

        Thread.sleep(3000);
      

        
        WebElement clientPor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[5]/div[2]/input")));
        System.out.println(" client id  filled successfully...");
        Thread.sleep(3000);
        clientPor.sendKeys("2123");
        
        WebElement keyPor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[1]/div[5]/div[3]/input")));
        System.out.println(" key  filled successfully...");
        Thread.sleep(3000);
        keyPor.sendKeys("211123");
        
        WebElement creatElement = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/div[2]/button[2]"));
        creatElement.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
           
            System.out.println("Browser closed.");
        }
    }
}

