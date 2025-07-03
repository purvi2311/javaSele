package companyLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class comAppl_ADD {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
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
        passwordField.sendKeys("Veer@123");

        WebElement loginSubmit = driver.findElement(By.xpath(
            "//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[5]/div/button/span"));
        loginSubmit.click();
        System.out.println("Submitted successfully...");

        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id='kt_sing_in_two_factor_form']/div[3]/div[2]/div/input[1]")));
        otpField.sendKeys("123456");
        System.out.println("OTP filled successfully...");

        WebElement otpSubmit = driver.findElement(By.xpath(
            "//*[@id=\"kt_sing_in_two_factor_form\"]/div[4]/button"));
        otpSubmit.click();
        System.out.println("OTP button clicked successfully...");

        Thread.sleep(5000); // Optional: wait for dashboard
 
       driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[3]/a/span/span")).click();
       System.out.println("Applicant clicked successfully");
    
        driver.findElement(By.xpath("//*[@id=\"kt_toolbar\"]/div[2]/a/button")).click();
        System.out.println("Adding Applicant");
    
        driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[3]/div[2]/div/div/a/div[2]")).click();
        System.out.println("manual creation selected");
      
        WebElement firstNElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[2]/div[1]/div/input"));
        firstNElement.sendKeys("selenium");
        System.out.println("frst name filled");
       
    
    WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[2]/div[2]/div/div/input"));
    emailElement.sendKeys("sele@sjds.com");
    System.out.println("email filled ");
    
    WebElement mobnumElement = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[3]/div[1]/div/input"));
    mobnumElement.sendKeys("34567435");
    System.out.println("mobile Number clicked successfully");
    
    WebElement lastNamElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[3]/div[2]/div/input"));
    lastNamElement.sendKeys("10000000");
    System.out.println("alternate number filled");
    
    WebElement jobTElement = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[4]/div[2]/div/div/input"));
    jobTElement.sendKeys("title job");
    System.out.println("job title filled");
    
//    WebElement checkboxElement = driver.findElement(By.xpath("//input[@name='communication[]' and @type='checkbox']"));
//
// // Scroll into view
// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkboxElement);
//
// // Optional: short pause for smooth scrolling effect
// Thread.sleep(500);
//
// checkboxElement.click();
// System.out.println("Checkbox clicked");

    
//    WebElement cityElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[7]/div[1]/div/div/select/option[3]"));
//    cityElement.click();
//    System.out.println("city is selected");
//    
//    WebElement statElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[8]/div[1]/div/div/select/option[2]"));
//    statElement.click();
//    System.out.println("state clicked");
//    
//    WebElement sourcElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[1]/div/div/select/option[2]"));
//    sourcElement.click();
//    System.out.println("source clicked");
    
//    WebElement refferedElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[10]/div[1]/div/div/input"));
//    refferedElement.sendKeys("reefferedbycollege");
//    System.out.println("reffered filled");
//    
//    WebElement applgroupElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[11]/div[1]/div/div/select/option[2]"));
//    applgroupElement.click();
//    System.out.println("appl group clicked");
//    
//    WebElement taxElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[1]/div/div/select/option[3]"));
//    taxElement.click();
//    System.out.println("tax clicked");
//    
//    WebElement addcommElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[13]/div[1]/div/div/textarea"));
//    addcommElement.sendKeys("additional comment");
//    System.out.println("adding comment");
//    
//    WebElement skillsElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[1]/div/div/select/option[3]"));
//    skillsElement.click();
//    System.out.println("skills clicked");
//    
//    WebElement techElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[3]/div/div/div/select/option[3]"));
//    techElement.click();
//    System.out.println("Technology clicked");
//    
//    WebElement genderElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/select/option[2]"));
//    genderElement.click();
//    System.out.println("gender selected");
//    
//    WebElement veteranElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[1]/div/div/select/option[2]"));
//    veteranElement.click();
//    System.out.println("veteran clicked");
//    
//    WebElement universityElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div[1]/div[2]/div/div/div/div/input"));
//    universityElement.sendKeys("noida university");
//    System.out.println("university filled");
//    
//    WebElement uniplacementElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div/input"));
//    uniplacementElement.sendKeys("university placement");
//    System.out.println("university placement filled");
//    
//    WebElement optCheckbox = driver.findElement(By.xpath("//span[text()='OPT Hiring']/preceding-sibling::input[@type='checkbox']"));
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optCheckbox);
//    optCheckbox.click();
//    System.out.println("OTP Hiring checkbox clicked");
//
//    
//    WebElement phonenumElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[2]/div[2]/div/input"));
//    phonenumElement.sendKeys("3546724356");
//    System.out.println("phone num filled");
    
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement dateofbirthElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='calendar_event_start_date']")));
//    dateofbirthElement.click();
//    System.out.println("date of birth clicked");

 // Click to open the date picker
 // Open the calendar popup
//    WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement dateInput = driver.findElement(By.id("kt_calendar_datepicker_start_date"));
//    dateInput.click();
//
//    // Wait for calendar to be visible
//    waiit.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
//
//    // Navigate to June 2024
//    while (true) {
//        // Always refetch after DOM update
//        WebElement monthElement = driver.findElement(By.cssSelector(".flatpickr-month .cur-month"));
//        WebElement yearElement = driver.findElement(By.cssSelector(".flatpickr-month .numInput"));
//        String month = monthElement.getText();  // e.g., "May"
//        String year = yearElement.getAttribute("value");  // e.g., "2024"
//
//        if (month.equalsIgnoreCase("June") && year.equals("2024")) {
//            break;
//        } else {
//            WebElement nextButton = driver.findElement(By.className("flatpickr-next-month"));
//            nextButton.click();
//            Thread.sleep(500);  // Let calendar update before retrying
//        }
//    }
//
//    // Select the 15th — use aria-label for precise match if available
//    List<WebElement> dayElements = driver.findElements(By.xpath("//span[@class='flatpickr-day' and @aria-label='June 15, 2024']"));
//
//    if (dayElements.size() == 0) {
//        // Fallback if aria-label is not present
//        dayElements = driver.findElements(By.xpath("//span[contains(@class, 'flatpickr-day') and text()='15']"));
//    }
//
//    for (WebElement day : dayElements) {
//        if (day.isDisplayed() && day.isEnabled()) {
//            day.click();
//            break;
//        }
//    }



    
    
    WebElement linkedINport = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[5]/div[1]/div/div/input"));
    linkedINport.sendKeys("https://www.google.co.in/");
    System.out.println("linkedIn filled");
    
    WebElement port = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[5]/div[2]/div/div/input"));
    port.sendKeys("https://www.google.co.in/");
    System.out.println("port filled");
    
    WebElement GitHub = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[6]/div[1]/div/div/input"));
    GitHub.sendKeys("https://www.google.co.in/");
    System.out.println("github filled");
    
    WebElement Xprof = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[6]/div[2]/div/div/input"));
    Xprof.sendKeys("xprof is filled");
    System.out.println("Xprof is filled");
    
    WebElement skills = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[7]/div/div/div/select/option[3]"));
    skills.click();
    System.out.println("skills is filled");
    
    WebDriverWait waiit1111 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement addressElement = waiit1111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/input")));
    addressElement.sendKeys("address filling");
    System.out.println("address filled");

    WebElement state = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[1]/div/div/select/option[3]"));
    state.click();
    System.out.println("state clicked");
    
    WebElement city = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[2]/div/div/select/option[2]"));
    city.click();
    System.out.println("city selected");
    
    WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[4]/div/div/div/input"));
    zipcode.sendKeys("465445");
    System.out.println("zipcode is filled");
    
    WebElement countryElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/select/option[3]"));
    countryElement.click();
    System.out.println("country filled");
//    
//    WebElement zipcodElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[8]/div[2]/div/div/input"));
//    zipcodElement.sendKeys("3456");
//    System.out.println("zipcode filled");
//    
//    WebElement experiencElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/select/option[3]"));
//    experiencElement.click();
//    System.out.println("experience filled ");
//    
//    WebElement expmonthElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[2]/div/div[2]/select/option[3]"));
//    expmonthElement.click();
//    System.out.println("experience month clicked");
//    
//    WebElement applstatusElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[10]/div[2]/div/div/select/option[3]"));
//    applstatusElement.click();
//    System.out.println("applicant status selected");
//    
//    WebElement ownershipElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[11]/div[2]/div/div/select/option[2]"));
//    ownershipElement.click();
//    System.out.println("ownership clicked");
//    
//    WebElement expectedPayElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[2]/div/div[1]/select/option[3]"));
//    expectedPayElement.click();
//    System.out.println("expected payment submitted");
//    
//    WebElement expPayElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[2]/div/div[2]/input"));
//    expPayElement.sendKeys("3334546t54");
//    System.out.println("exp pay submitted");
//    
//    WebElement relocatonElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[13]/div[2]/div/div/div/div[1]/label[1]/span"));
//    relocatonElement.click();
//    System.out.println("relocation filled");
//    
//    WebElement primaryskillsElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[2]/div/div/input"));
//    primaryskillsElement.sendKeys("skills primary");
//    System.out.println("primary skiils filled");
//    
//    WebElement nationalityElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[2]/div/div/select/option[2]"));
//    nationalityElement.click();
//    System.out.println("nationality choosed");
//    
//    
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0, 300);");  
//    WebElement disabilityElement= driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/select/option[2]"));
//    disabilityElement.click();
//    System.out.println("disability clicked");
    WebElement updateBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div[3]/button"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", updateBtn);
    Thread.sleep(500); // small pause for scroll animation
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", updateBtn);
    System.out.println("Update button force-clicked with JS");
    Thread.sleep(300);
   
    WebDriverWait doc = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement document = doc.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[2]/p")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", document);
    Thread.sleep(500);
    document.click();
    System.out.println("document clicked");

    WebDriverWait addD = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement addnewDoc = addD.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id='kt_app_main']/div[2]/div/div[4]/div[1]/div[2]/div/button")));
    addnewDoc.click();
    System.out.println("Add New Doc clicked");

   WebElement docN = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/select/option[4]"));
   docN.click();
   System.out.println("document selected");
   
   WebDriverWait docimg = new WebDriverWait(driver, Duration.ofSeconds(10));
   WebElement fileInput = docimg.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
  fileInput.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\pexels.jpg");
   System.out.println("doc img uploaded");

    
    
      driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/button[2]")).click();
      System.out.println("document form created");
      
      WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));

   // Wait until the modal disappears
   waiit.until(ExpectedConditions.invisibilityOfElementLocated(
       By.cssSelector("div.modalBox.fade.show")
   ));

   // Now click the Education tab
   WebElement educationTab = wait.until(ExpectedConditions.elementToBeClickable(
       By.xpath("//*[@id='kt_app_main']/div[2]/div/div[2]/div/ul/li[3]/p")
   ));
   educationTab.click();
   System.out.println("education clicked");

   
      WebElement educt = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[5]/div[1]/div[2]/div/button"));
      educt.click();
      System.out.println("education add new");
      
      WebElement edadd = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[5]/div[1]/div[2]/div/button/text()"));
      edadd.click();
      System.out.println("education add new clicked");

      WebElement Edschool = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/input"));
      Edschool.sendKeys("school");
      System.out.println("school filled");
    
     WebElement Eddegree = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[2]/div/input"));
     Eddegree.sendKeys("degree");
     System.out.println("eddegree clicked");
    
    WebElement Edfos = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[3]/div/input"));
    Edfos.sendKeys("education");
    System.out.println("education field filled");
    
    WebElement grade = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[4]/div/input"));
    grade.sendKeys("grade");
    System.out.println("Edgrade is filled");
    
    WebElement EdFrom = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[5]/div/select/option[9]"));
    EdFrom.click();
    System.out.println("form year clicked");
    
    WebElement EdTo = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[6]/div/select/option[4]"));
    EdTo.click();
    System.out.println("to year filled");
   
    driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/div[2]/button")).click();
    System.out.println("education created");
    
    driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[4]/p")).click();
    System.out.println("certificate clicked");
    
    WebElement uploadInput = driver.findElement(By.xpath("//label//input[@type='file']"));
    uploadInput.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\download.jpg");
    System.out.println("mern doc uploaded");

    WebDriverWait docc = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement uploadButton = docc.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_app_main\"]/div/div[3]/button")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadButton);
    Thread.sleep(500);  // optional, let animations finish
    uploadButton.click();
    System.out.println("document uploaded");

    
    WebElement EDlanguageElement = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[5]/p"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EDlanguageElement);
    System.out.println("language selected");

    
    WebElement Edbengali = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_email_preferences\"]/form/div[1]/label[3]/input"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Edbengali);
    System.out.println("bengali lang choosen");

    
    WebElement EdworkExp = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[6]/p"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EdworkExp);
    System.out.println("work exp clicked");

    WebElement EdAddtowork = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[1]/div[2]/button"));

    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EdAddtowork);
    Thread.sleep(300); // wait for scroll
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EdAddtowork);

    System.out.println("education add to work clicked");


      
    WebDriverWait add = new WebDriverWait(driver, Duration.ofSeconds(10));
 add.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".Toastify__toast")));

 WebElement EdTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
     By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[8]/div[1]/div[2]/button")));

 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EdTitle);
 wait.until(ExpectedConditions.elementToBeClickable(EdTitle));

 EdTitle.clear();
 EdTitle.sendKeys("title filled");
 System.out.println("Edu work filled");


    
    WebElement EdType = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[3]/div/input"));
    EdType.sendKeys("permanent");
    System.out.println("education type filled");
    
    WebElement comp = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[4]/div/input"));
    comp.sendKeys("insight");
    System.out.println("comp filled");
    
    WebElement Location = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[5]/div/input"));
    Location.sendKeys("Noida");
    System.out.println("location filled");
    
    WebElement fromyr = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[6]/div/select/option[4]"));
    fromyr.click();
    System.out.println("from year clicked");
    
    WebElement Toyr = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[7]/div/select/option[2]"));
    Toyr.click();
    System.out.println("to yr clicked");
    
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
            System.out.println("Browser closed.");
        }
    }
}

