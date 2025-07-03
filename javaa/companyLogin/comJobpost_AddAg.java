package companyLogin;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class comJobpost_AddAg {

	@Test
	public class Dashboard {
	    private WebDriver driver;
	    @BeforeClass
	    
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        new WebDriverWait(driver, Duration.ofSeconds(15));
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

	        // Click Login button
	        WebElement loginSubmitButton = driver.findElement(By.xpath("//*[@id=\"kt_app_root\"]/div/div[1]/div/div/form/div[5]/div/button/span"));
	        System.out.println(" submitted  successfully...");
	        loginSubmitButton.click();

	        // Enter OTP
	        WebElement otpField = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[2]/div[2]/div/input[1]"));
	        System.out.println(" otp  filled successfully...");
	        otpField.sendKeys("123456");

	        // Click OTP Submit button
	        WebElement otpSubmitButton = driver.findElement(By.xpath("//*[@id=\"kt_sing_in_two_factor_form\"]/div[3]/button"));
	        System.out.println(" otpbutton  clicked successfully...");
	        otpSubmitButton.click();
	        Thread.sleep(5000); 
	        
           driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[2]/a/span/span")).click();
           System.out.println("job posting clicked successfully");
	        
        driver.findElement(By.xpath("//*[@id=\"kt_toolbar\"]/div[2]/a/button")).click();
        System.out.println("add to jobpost button clicked");
           
           
	       WebElement jobcodElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[1]/div/div/div/input"));
	       jobcodElement.sendKeys("34567");
	       System.out.println("jobcode filled successfully");
	        
	        WebElement jobTitlElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[2]/div/div/div/input"));
	        jobTitlElement.sendKeys("testing");
	        System.out.println("jobtitle filled successfully");
	        
	        WebElement jobdescripElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[3]/div[1]/div/div[2]/div[1]"));
	        jobdescripElement.sendKeys("selenium description here");
	        System.out.println("jobdesc is filled successfully");

	        
	     // START DATE PICKER
	        WebElement dateInput = driver.findElement(By.name("calendar_event_start_date"));
	        dateInput.click();
	        System.out.println("Start datepicker clicked");

	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
	        System.out.println("Visible month: " + driver.findElement(By.cssSelector(".flatpickr-current-month")).getText());

	        // Navigate to May 2025 (example)
	        while (true) {
	            String visibleMonth = driver.findElement(By.cssSelector(".flatpickr-current-month")).getText();
	            if (visibleMonth.contains("June")) {
	                break;
	            } else {
	                driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
	            }
	        }
	     // Start Date Selection
	        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement startDate = wait11.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//span[contains(@class, 'flatpickr-day') and not(contains(@class, 'disabled')) and text()='19']")));
	        startDate.click();
	        System.out.println("Start date selected");

	        
	        WebElement endDateInput = driver.findElement(By.id("kt_calendar_datepicker_start_date"));
	        endDateInput.click();

	        // 2. Wait for the calendar to be visible
	        WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement calendar = wait111.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector(".flatpickr-calendar.open")));

	        // 3. Select month: May (index 4, since January = 0)
	        Select monthDropdown = new Select(calendar.findElement(By.className("flatpickr-monthDropdown-months")));
	        monthDropdown.selectByVisibleText("May");

	        // 4. Enter year: 2025
	        WebElement yearInput = calendar.findElement(By.cssSelector("input.cur-year"));
	        yearInput.clear();
	        yearInput.sendKeys("2025");
	        Thread.sleep(500); // Allow calendar to update

	        // 5. Click the 7th day (avoid prev/next month days)
	        WebElement day = calendar.findElement(By.xpath(
	            ".//span[contains(@class, 'flatpickr-day') and " +
	            "not(contains(@class, 'disabled')) and " +
	            "not(contains(@class, 'prevMonthDay')) and " +
	            "not(contains(@class, 'nextMonthDay')) and text()='7']"
	        ));

	        // 6. Click using JavaScript in case normal click fails
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", day);
	        System.out.println("Successfully picked 7 May 2025");

	        WebElement cityElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[5]/div[1]/div/div/div/select/option[3]"));
	        cityElement.click();
	        System.out.println("city selected");
	        
	        WebElement jobTypElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[6]/div[1]/div/div/select/option[2]"));
	        jobTypElement.click();
	        System.out.println("jobtype selected");
	        
	        WebElement clientjobElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[7]/div[1]/div/div/div/input"));
	        clientjobElement.sendKeys("243243");
	        System.out.println("client id is filled");
	    
	        WebElement clientcategElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[8]/div[1]/div/div/select/option[4]"));
	        clientcategElement.click();
	        System.out.println("client category selected");
	    
	        WebElement areacode = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[9]/div[1]/div/div/div/input"));
	        areacode.sendKeys("45678");
	        System.out.println("area code selected");
	    
	        WebElement interviewmodElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[10]/div[1]/div/div/div/input"));
	        interviewmodElement.sendKeys("codeinterview");
	        System.out.println("interview code is here");
	    
	       WebElement addElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[11]/div[1]/div/div/div/input"));
	       addElement.sendKeys("addressingg");
	       System.out.println("address filled");
	    
	       WebElement documentElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[12]/div/div/div/select/option[3]"));
	       documentElement.click();
	       System.out.println("document selected");
	       
	       
	       
	    
	       WebElement countryElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[4]/div[2]/div/div/select/option[2]"));
	       countryElement.click();
	       System.out.println("country selected");
	    
	       WebElement zipcodElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[5]/div[2]/div/div/div/input"));
	       zipcodElement.sendKeys("4321");
	       System.out.println("zipcode filled");
	    
	       WebElement clientsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[6]/div[2]/div/div/select/option[3]"));
	       clientsElement.click();
	       System.out.println("clients selected");
	    
	       WebElement priorityElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[7]/div[2]/div/div/select/option[3]"));
	       priorityElement.click();
	       System.out.println("priority selected");
	    
	       WebElement appformElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[8]/div[2]/div/div/select/option[2]"));
	       appformElement.click();
	       System.out.println("appform selected");
	    
	       WebElement durationElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[9]/div[2]/div/div/div/input"));
	       durationElement.sendKeys("3456");
	       System.out.println("duration filled");
	    
	      WebElement workauthElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[10]/div[2]/div/div/select/option[4]"));
	      workauthElement.click();
	      System.out.println("work auth filled successfully");
	    
	     WebElement HourworkauthElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[11]/div[2]/div/div/div/input"));
	     HourworkauthElement.sendKeys("76543");
	     System.out.println("hourwork filled successfully");
	    
	     
	     
	     
	     
	    WebElement clientbillElement= driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[3]/div/div[1]/select/option[3]"));
	    clientbillElement.click();
	    System.out.println("clientbill filled");
	     
	    WebElement clbillratElemente = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[3]/div/div[2]/input"));
	    clbillratElemente.sendKeys("76543");
	    System.out.println("client bill filled in numbers");
	    
	    WebElement clbillraElement1 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[3]/div/div[3]/select/option[2]"));
	    clbillraElement1.click();
	    System.out.println("client bill 3rd ");
	    
	    WebElement clbillraElement2 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[2]/div[3]/div/div[4]/select/option[3]"));
	    clbillraElement2.click();
	    System.out.println("client bill3rd D filled");
	    
	    WebElement payratElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[3]/div[2]/div[1]/div[1]/input"));
	    payratElement.sendKeys("3456");
	    System.out.println("payrate filled");
	    
	    WebElement payrate1 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[3]/div[2]/div[1]/div[2]/select/option[2]"));
	    payrate1.click();
	    System.out.println("pay rate filled ");
	    
	    WebElement payrate2Element= driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[3]/div[2]/div[1]/div[3]/select/option[2]"));
	    payrate2Element.click();
	    System.out.println("pay rate2 clicked");
	    
	   
	    
	    
	    
	  
	  
	    WebElement respondElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[3]/div[2]/div[3]/div/select/option[3]"));
	    respondElement.click();
	    System.out.println("respond filled successfully");
	     
	    WebElement checkbox = driver.findElement(By.cssSelector("input[name='remoteJob']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
	    Thread.sleep(500); // wait if needed
	    checkbox.click(); // or use JS click

	    
	    WebElement statesElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[4]/div[3]/div/div/select/option[2]"));
	    statesElement.click();
	    System.out.println("states selected");
	    
	    WebElement jobstatusElement =driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[5]/div[3]/div/div/select/option[3]"));
	    jobstatusElement.click();
	    
	    WebElement clientMang = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[6]/div[3]/div/div/select/option[3]"));
	    clientMang.click();
	    System.out.println("client manager clicked");
	    
	    WebElement  salaryElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[7]/div[3]/div/div[1]/select/option[2]"));
	    salaryElement.click();
	    System.out.println("salary clicked");
	    
	    WebElement salarynumElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[7]/div[3]/div/div[2]/input"));
	    salarynumElement.sendKeys("3245354");
	    System.out.println("salary filled in num ");
	    
	    WebElement salary2 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[7]/div[3]/div/div[3]/select/option[3]"));
	    salary2.click();
	    System.out.println("salary2 clicked");
	    
	    WebElement addDetailsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[8]/div[3]/div/div/select/option[2]"));
	    addDetailsElement.click();
	    System.out.println("addDetails filled");
	    
	    WebElement axelATsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[9]/div[3]/div/div/select/option[3]"));
	    axelATsElement.click();
	    System.out.println("axelats filled successfull");
	    
	    WebElement clearenceElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[10]/div[3]/div/div/div/div/label[1]/input"));
	    clearenceElement.click();
	    System.out.println("clearence cliked");
	    
	    WebElement EndClient = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[11]/div[3]/div/div/div/input"));
	    EndClient.sendKeys("sdfsefd");
	    System.out.println("endclient  filled successfully");
//	    
//	    WebElement jobstatusElement2 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[5]/div[3]/div/div/select/option[3]"));
//	    jobstatusElement2.click();
//	    System.out.println("job status 2 clicked");
//	    
//	     WebElement statesElement2 = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[4]/div[3]/div/div/select/option[3]"));
//	     statesElement2.click();
//	     System.out.println("states2 clicked");
//	    
//	    WebElement jobstatusElement3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/form/div[5]/div[3]/div/div/select/option[2]"));
//	    jobstatusElement3.click();
//	    System.out.println("job status3 clicked");
//	    
//	    WebElement clientmangElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/form/div[6]/div[3]/div/div/select/option[2]"));
//	    clientmangElement.click();
//	    System.out.println("client manager clecked");
//	    
//	    WebElement payratesalaryElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/form/div[7]/div[3]/div/div[1]/select/option[3]"));
//	    payratesalaryElement.click();
//	    System.out.println("pay rate salary clicked");
	    

	    
	    //SKILLS
	    WebElement industryElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[14]/div[1]/div/div/select/option[3]"));
	    industryElement.click();
	    System.out.println("industry clicked");
	    
	    WebElement primaryskillsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[15]/div[1]/div/div/div/input"));
	    primaryskillsElement.sendKeys("skillsP");
	    System.out.println("primary skills filled");
	    
	    WebElement experiencElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[14]/div[2]/div/div/div/input"));
	    experiencElement.sendKeys("35646");
	    System.out.println("experience filled");
	    
	    WebElement secondaryskillsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[15]/div[2]/div/div/div/input"));
	    secondaryskillsElement.sendKeys("skillsSEC");
	    System.out.println("secondary skills filled");
	    
	    WebElement lang1Element = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[14]/div[3]/div/div/select/option[3]"));
	    lang1Element.click();
	    System.out.println("language selected");
	    
	    
	    WebElement numofpositionsElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[17]/div[1]/div/div/div/input"));
	    numofpositionsElement.sendKeys("55");
	    System.out.println("numPosition selected");
	    
	    WebElement salesmangElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[18]/div[1]/div/div/select/option[3]"));
	    salesmangElement.click();
	    System.out.println("salaes mang filled");
	    
	    WebElement assignedElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[19]/div[1]/div/div/div/input"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", assignedElement);
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait2.until(ExpectedConditions.elementToBeClickable(assignedElement));
	    assignedElement.sendKeys("hr");
	    System.out.println("assigned successfully");
    
	    
	    
	 // 1. Open the datepicker
//	    WebElement LdateInput = driver.findElement(By.id("kt_calendar_datepicker_start_date"));
//	   
//	    LdateInput.click();
//
//	    // 2. Wait until the calendar is visible
//	    WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait12.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
//
//	    // 3. Navigate to June 2025
//	    while (true) {
//	        WebElement monthYearElement = driver.findElement(By.cssSelector(".flatpickr-current-month"));
//	        
//	        String visibleMonthYear = monthYearElement.getText(); // Example: "June 2025"
//	        
//	        if (visibleMonthYear.contains("June") && visibleMonthYear.contains("2025")) {
//	            break;
//	        } else {
//	            WebElement nextMonthBtn = driver.findElement(By.cssSelector(".flatpickr-next-month"));
//	            nextMonthBtn.click();
//	            Thread.sleep(500); // Optional: small pause to allow rendering
//	        }
//	    }
//
//	    // 4. Select day 12 (ensure it's a valid date cell)
//	    WebElement day12 = wait.until(ExpectedConditions.elementToBeClickable(
//	        By.xpath("//span[contains(@class,'flatpickr-day') and not(contains(@class, 'disabled')) and text()='12']")));
//	    day12.click();

	    
	    
//	    WebElement careerPORTElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/form/div[20]/div/div/div/input"));
//	    careerPORTElement.click();
//    System.out.println("careerDate selected");
	    
	    WebElement submissionElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[17]/div[2]/div/div/div/input"));
	    submissionElement.sendKeys("6666");
	    System.out.println("submission completed");
	    
	    WebElement departElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[18]/div[2]/div/div/select/option[3]"));
	    departElement.click();
	    System.out.println("department selected");
	    
	    WebElement commentElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[19]/div[2]/div/div/div/input"));
	    commentElement.sendKeys("commentingg.......");
	    System.out.println("commented ");
	    
	    WebElement taxTermElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[17]/div[3]/div/div/select/option[2]"));
	    taxTermElement.click();
	    System.out.println("tax term clicked");
	    
	    WebElement reqmangElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[18]/div[3]/div/div/select/option[3]"));
	    reqmangElement.click();
	    System.out.println("requirement mang selected");
	    
	    WebElement addnotifElement = driver.findElement(By.xpath("//*[@id=\"kt_app_content\"]/form/div[19]/div[3]/div/div/select/option[3]"));
	    addnotifElement.click();
	    System.out.println("additional element filled");
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    
//	    //LastCalender
//	    WebElement LdateInput = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/form/div[20]/div/div/div/input"));
//        LdateInput.click();
//        System.out.println("lastcalender datepicker clicked");
//
//
//        // 2. Wait for the calendar to be visible
//        WebDriverWait wait1113 = new WebDriverWait(driver, Duration.ofSeconds(10));
//  WebElement calendar1 = wait1113.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flatpickr-calendar.open")));
//calendar1.click();
//        // 3. Select month: May (index 4, since January = 0)
//        Select monthDropdown1 = new Select(calendar1.findElement(By.className("flatpickr-monthDropdown-months")));
//        monthDropdown1.selectByVisibleText("May");
//
//        // 4. Enter year: 2025
//        WebElement yearInput1 = calendar1.findElement(By.cssSelector("input.cur-year"));
//        yearInput1.clear();
//        yearInput1.sendKeys("2025");
//        Thread.sleep(500); // Allow calendar to update
//
//        // 5. Click the 7th day (avoid prev/next month days)
//        WebElement day1 = calendar1.findElement(By.xpath(
//            ".//span[contains(@class, 'flatpickr-day') and " +
//            "not(contains(@class, 'disabled')) and " +
//            "not(contains(@class, 'prevMonthDay')) and " +
//            "not(contains(@class, 'nextMonthDay')) and text()='17']"
//        ));
//
//        // 6. Click using JavaScript in case normal click fails
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", day1);
//        System.out.println("Successfully picked 17 May 2025");

	    WebElement createButton = driver.findElement(By.xpath("//button[text()='Create']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", createButton); // optional but good
	    Thread.sleep(300); // optional small delay
	    js.executeScript("arguments[0].click();", createButton);
	    System.out.println("Create button clicked with JS.");
	    
Thread.sleep(3000);    
    }
        
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	           
	            System.out.println("Browser closed.");
	        }

}}}

