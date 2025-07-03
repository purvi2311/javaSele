package companyLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

@Test
public class comAppl_Newadd {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void testInvalidUsernameOrPassword() throws InterruptedException {
        driver.get("http://52.205.84.33:4000/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/li[7]/a")));
        System.out.println(" button clicked successfully...");
        button.click();

        // Enter invalid username
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[2]/input")));
        System.out.println(" email  filled successfully...");
        Thread.sleep(3000);
        emailField.sendKeys("veersharma2860@gmail.com");
        
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[3]/input"));
        System.out.println(" password  filled successfully...");
        passwordField.sendKeys("V@123");

        WebElement loginSubmit = driver.findElement(By.xpath(
            "//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[5]/div/button/span"));
        loginSubmit.click();
        System.out.println("Submitted successfully...");

   WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[2]/div[2]/div/input[1]")));
        otpField.sendKeys("123456");
        System.out.println("OTP filled successfully...");

        WebElement otpSubmit = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[3]/button"));
        otpSubmit.click();
        System.out.println("OTP button clicked successfully...");

        Thread.sleep(5000); // Optional: wait for dashboard
 
       driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[3]/a/span/span")).click();
       System.out.println("Applicant clicked successfully");
    
        driver.findElement(By.xpath("//*[@id=\"kt_toolbar\"]/div[2]/a/button")).click();
        System.out.println("Adding Applicant");
    
        driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[3]/div[2]/div/div/a/div[2]")).click();
        System.out.println("manual creation selected");
        
        WebElement fullN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[1]/div/input"));
        fullN.sendKeys("viasele");
        System.out.println("full name entered");
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div/div/input"));
        email.sendKeys("sele@jhdbs.com");
        System.out.println("email filled");
        
        WebElement phNum = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div/input"));
        phNum.sendKeys("6734632");
        System.out.println("phone number entered");
        
        WebElement AlterphNum = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[4]/div/input"));
        AlterphNum.sendKeys("735723");
        System.out.println("alternate phone num filled");
        
        WebElement jobtitle = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[6]/div/div/input"));
        jobtitle.sendKeys("seleT");
        System.out.println("job title");
        
        WebElement linkedIn = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[7]/div/div/input"));
        linkedIn.sendKeys("https://www.google.co.in/");
        System.out.println("linkedIn filled");
        
        WebElement portfolio = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[8]/div/div/input"));
        portfolio.sendKeys("https://www.google.co.in/");
        System.out.println("portfolio filled");
    
        WebElement Github = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[9]/div/div/input"));
        Github.sendKeys("https://www.google.co.in/");
        System.out.println("github filled");
        
       WebElement xprofile =driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[10]/div/div/input"));
       xprofile.click();
       System.out.println("xprofile filled");
       
       WebElement skills = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[11]/div/input"));
       skills.sendKeys("Seleskills");
    System.out.println("skills filled");
       
    WebElement address = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div/div[2]/div[1]/div/div/input"));
    address.sendKeys("address filled");
    System.out.println("address filled");

    WebElement country = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div/div[2]/div[4]/div/div/select/option[19]"));
    country.click();
    System.out.println("country filled");

    WebElement select = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div/div[2]/div[3]/div/div/select/option[4]"));
    select.click();
    System.out.println("state selected clicked");
    
    WebElement city = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div/div[2]/div[2]/div/div/select/option[2]"));
    city.click();
    System.out.println("city clicked");
    
       
    
    WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div/div[2]/div[5]/div/div/input"));
    zipcode.sendKeys("2222");
    System.out.println("zipcode filled");
    
    WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"kt_account_profile_details_submit\"]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
    System.out.println("personal details created");

    
   WebElement docbutt = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/ul/li[2]/p"));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", docbutt);
     System.out.println("document clicked");
    
     WebElement btn = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[3]/div[1]/div[2]/button"));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
     System.out.println("add new button clicked");
    
//     WebElement selectdoc = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/select/option[3]"));
//     selectdoc.click();
//     System.out.println("Document Name");
//    
//     WebElement fileInput = driver.findElement(By.id("team-image"));
//     fileInput.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\bf1a031f0f65e284e2d500009ab78263.jpg");
//     System.out.println("Image uploaded");

//     WebElement edu = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/ul/li[3]/p"));
//     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", edu);
//     System.out.println("education clicked using JS");
//
//     
//     WebElement eduAddnew = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[4]/div[1]/div[2]/button"));
//     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", eduAddnew);
//     System.out.println("education add new button clicked");

    
    WebElement Edschool = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/input"));
    Edschool.sendKeys("school");
    System.out.println("education filled");
    
    WebElement Eddegree = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[2]/div/input"));
    Eddegree.sendKeys("Degree");
    System.out.println("education degree filled");
    
    WebElement FOS = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[3]/div/input"));
    FOS.sendKeys("study field");
    System.out.println("field of study is filled");
    
    WebElement Grade = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[4]/div/input"));
    Grade.sendKeys("grade");
    System.out.println("Grade filled");
    
    WebElement fromyr = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[5]/div/select/option[8]"));
    fromyr.click();
    System.out.println("from yr clicked");
    
    WebElement toyr = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[6]/div/select/option[4]"));
    toyr.click();
    System.out.println("to yr clicked");
    
    WebElement edcreate = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/div[2]/button"));
    edcreate.click();
    System.out.println("education created");
    
    WebElement workexp = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/ul/li[3]/p"));
    workexp.click();
    System.out.println("workexp clicked");
    
    WebElement workaddnew = driver.findElement(By.xpath("//*[@id='kt_app_main']/div[4]/div[1]/div[2]/button"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", workaddnew);

    WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement titleInput = waitt.until(ExpectedConditions.elementToBeClickable(By.name("title")));
    titleInput.sendKeys("Sales Lead");
    System.out.println("work experience title filled");

    
    WebDriverWait waite = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement empType = waite.until(ExpectedConditions.elementToBeClickable(By.name("employmentType")));
    empType.sendKeys("seleType");


    WebElement companyInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='companyName']")));
    companyInput.clear();
    companyInput.sendKeys("Your Company Name");
    System.out.println("comp filled");
    
    WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement location = waiti.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Location']")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", location);
    location.sendKeys("seleLocation");
    System.out.println("seleLocation filled");
    
    

 
    WebElement dropdown = driver.findElement(By.xpath("//*[@id='kt_account_settings_profile_details']/form/div[1]/div[5]/div/select"));
    Select yearSelect = new Select(dropdown);
    List<WebElement> options = yearSelect.getOptions();

    System.out.println("Dropdown has " + options.size() + " options:");
    for (int i = 0; i < options.size(); i++) {
        System.out.println(i + ": " + options.get(i).getText());
    }




    
    WebDriverWait Towait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement yearDropdown = Towait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select.form-control.form-control-lg.form-control-solid")));

    // Create Select object
    Select selectYear = new Select(yearDropdown);

    // Select by visible text
    selectYear.selectByVisibleText("2021");
    
    
    WebElement wrkexpcreated = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/button[2]"));
    wrkexpcreated.click();
    System.out.println("work exp clicked");
    
//    WebElement emptype = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[2]/div/input"));
//    emptype.sendKeys("")
    
    
    
    
    
    }   
    
      @AfterClass
        public void tearDown() {
            if (driver != null) {
               // driver.quit();
                System.out.println("Browser closed.");
            }
        }
    }
