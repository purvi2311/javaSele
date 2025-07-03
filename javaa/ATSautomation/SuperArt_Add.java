package ATSautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class SuperArt_Add {
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
        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[3]/div[2]/div/input[1]")));
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
     
        WebElement articleElement = driver.findElement(By.xpath("//*[@id='kt_toolbar']/div[2]/a/button"));
        System.out.println(" Article button clicked successfully...");
        articleElement.click();
        Thread.sleep(3000);
        
        
        WebElement  titlElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/input"));
        System.out.println(" title filled successfully...");
        titlElement.sendKeys("InsightTitle");
        Thread.sleep(3000);
        
        WebElement slugElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/input"));
        System.out.println("slug clicked successfully");
        slugElement.sendKeys("insightful Technology");
        Thread.sleep(3000);
        WebElement fTimagElement = driver.findElement(By.id("upload-featured-image"));
        System.out.println("image uploaded successfully");
        fTimagElement.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\bf1a031f0f65e284e2d500009ab78263.jpg");
        Thread.sleep(3000);
        
        WebElement statusElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/select/option[2]"));
    		System.out.println("status updated successfully");
     statusElement.click();
        
        WebElement descElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/div/div[2]/div[1]/p"));
        System.out.println("desc filled successfully");
        
        descElement.sendKeys("d 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. T\r\n"
        		+ "his book is a treatise on the theory of ethics, very popular during the Renaissance. T\r\n"
        		+ "he first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
      Thread.sleep(3000);
        
        WebElement metaElement = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div/div[4]/div/div[2]/div/input"));
        System.out.println("meta title filled successfully");
        metaElement.sendKeys("MetT");
        Thread.sleep(3000);
        
        WebElement metaKeywordInput = driver.findElement(By.xpath("//input[contains(@placeholder, 'Keywords')]"));
        System.out.println("metakeywrod filled successfully");
        metaKeywordInput.sendKeys("automation, selenium, java");
        Thread.sleep(3000);
        
        WebElement metadescElement = driver.findElement(By.xpath("//*[@id=\"kt_table_users_wrapper\"]/textarea"));
        System.out.println("meta description filled successfully");
        metadescElement.sendKeys("metdesc");
        Thread.sleep(3000);
        
        
        WebElement submitiingElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/div/div[7]/button"));
        submitiingElement.click();
        Thread.sleep(3000);
       
		}
      
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
          //  driver.quit();
            System.out.println("Browser closed.");
        }
    }
}

