package ATSautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.time.Duration;

import javax.swing.DesktopManager;

public class superArt_Edit {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void testInvalidUsernameOrPassword() throws InterruptedException {
        driver.get("http://52.205.84.33:4000/");

        // Click on login button
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id='root']/div/header/div/div/div[3]/a/div")));
        System.out.println("Button clicked successfully...");
        button.click();

        // Enter invalid username
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[3]/input")));
        System.out.println("Email filled successfully...");
        Thread.sleep(3000); // Consider replacing this with WebDriverWait if loading
        emailField.sendKeys("spurvi8077@gmail.com");

        // Enter invalid password
        WebElement passwordField = driver.findElement(
            By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[4]/input"));
        System.out.println("Password filled successfully...");
        passwordField.sendKeys("Spurvi@123");

        // Click Login button
        WebElement loginSubmitButton = driver.findElement(
            By.xpath("//*[@id='kt_app_root']/div/div[1]/div/div/form/div[6]/div/button/span"));
        System.out.println("Login submitted successfully...");
        loginSubmitButton.click();

        // Enter OTP
        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[3]/div[2]/div/input[1]")));
        System.out.println("OTP filled successfully...");
        otpField.sendKeys("123456");

        // Click OTP Submit button
        WebElement otpSubmitButton = driver.findElement(
            By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[4]/button"));
        System.out.println("OTP button clicked successfully...");
        otpSubmitButton.click();

        Thread.sleep(5000); // Wait for navigation

        // Click on Article menu
        WebElement article = driver.findElement( By.xpath("//*[@id='kt_app_header_menu']/div[5]/a/span/span"));
        System.out.println("Article menu clicked successfully...");
        article.click();
        Thread.sleep(3000);
        
        WebElement articleEDit = driver.findElement( By.xpath("//*[@id=\"kt_table_users\"]/tbody/tr[4]/td[6]/div/div/a"));
        System.out.println("articleEDit clicked successfully...");
        articleEDit.click();
        Thread.sleep(3000);  
        
        
        WebElement artEDTitle = driver.findElement( By.xpath("//*[@id=\"kt_table_users_wrapper\"]/input"));
        artEDTitle.clear();
        artEDTitle.sendKeys("title updating");
        System.out.println("artEDTitle updated successfully...");
        artEDTitle.click();
        Thread.sleep(3000);
        
        WebElement descElementED = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/div/div[2]/div[1]/p"));
        System.out.println("desc updated successfully");
        //descElementED.clear();
        descElementED.sendKeys("d 1ics, very popular during the Renaissance. T\r\n"
        		+ "he first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
      Thread.sleep(3000);
       
      WebElement metaTElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div[4]/div/div[2]/div/input"));
      metaTElement.clear();
      System.out.println("metaTitle filled successfully");
      metaTElement.sendKeys("updating keyword");
      Thread.sleep(3000);
        
        WebElement articledescElementED = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div[5]/div/div[2]/div/input"));
        articledescElementED.clear();
        System.out.println("Article desc updated successfully");
        articledescElementED.sendKeys("metdesc");
        Thread.sleep(3000);
        
        WebElement submittingElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/div/div[7]/button"));
        submittingElement.click();
        
    }
        @AfterClass
        public void tearDown() {
            if (driver != null) {
              //  driver.quit();
                System.out.println("Browser closed.");
            }
        
        
        
        
        
        
        
    }}

