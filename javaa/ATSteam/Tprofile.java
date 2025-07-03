package ATSteam;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.time.Duration;

public class Tprofile {
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
        driver.get("http://52.205.84.33:4000/team-login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/input")));
        System.out.println(" email filled successfully...");
        email.click();
        email.sendKeys("purvi@insightfultechno.com");

        // Enter invalid username
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[4]/input")));
        System.out.println(" pass  filled successfully...");
        Thread.sleep(3000);
        pass.sendKeys("Purvi@123");
        
        WebElement subbuttElement =   driver.findElement(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[6]/div/button/span"));
        subbuttElement.click(); 
       
       
       WebElement otpfilledElement = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[3]/div[2]/div/input[1]"));
       otpfilledElement.sendKeys("123456");
       
       WebElement otpsubElement = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[4]/button"));
       otpfilledElement.click();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }}