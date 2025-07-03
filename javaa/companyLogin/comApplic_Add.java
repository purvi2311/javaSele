package companyLogin;

import java.sql.Driver;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ctc.wstx.shaded.msv_core.grammar.xmlschema.XPath;
import com.twilio.twiml.voice.Gather.Language;

public class comApplic_Add {

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
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/header/div/div/div[3]/div[1]/div")));
	        System.out.println(" button clicked successfully...");
	        button.click();
	             
	        WebElement loginbuttElement = driver.findElement(By.xpath("/html/body/div/div/header/div/nav/div/div/div[1]/ul/li[7]/a"));
            loginbuttElement.click();
	        System.out.println("login button clicked successfully");


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
	        WebElement otpSubmitButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/form/div[4]/button"));
	        System.out.println(" otpbutton  clicked successfully...");
	        otpSubmitButton.click();
	        Thread.sleep(5000); 
	        
           driver.findElement(By.xpath("//*[@id=\"kt_app_header_menu\"]/div[3]/a/span/span")).click();
           System.out.println("Applicant clicked successfully");
           
           driver.findElement(By.xpath("//button[contains(text(),'Add Applicant')]")).click();
           System.out.println("applicant button clicked");
           
           driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[3]/div[2]/div/div/a/div[2]")).click();
           System.out.println("manual button clicked");
           
           
           WebElement firstN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[1]/div[1]/div/input"));
           firstN.sendKeys("seleniumEv");
           System.out.println("first name filled");
           
           WebElement lastN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[1]/div[2]/div/input"));
           lastN.sendKeys("java");
           System.out.println("last name filled");
           
           WebElement Email = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[2]/div[1]/div/div/input"));
           Email.sendKeys("sele@form.com");
           System.out.println("email filled");
           
           WebElement phoneN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[2]/div[2]/div/input"));
           phoneN.sendKeys("7654345");
           System.out.println("Phone num filled");
           
           WebElement MobileN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[3]/div[1]/div/div/input"));
           MobileN.sendKeys("7654367");
           System.out.println("mobile num filled");
	       
           
        // 1. Open the calendar
//           WebElement dateInput = driver.findElement(By.id("kt_calendar_datepicker_start_date"));
//           dateInput.click();
//           System.out.println("Datepicker opened");
//
//           // 2. Wait until calendar appears
//           WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
//           waitt.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
//           
//           String amonth = driver.findElement(By.className("flatpickr-monthDropdown-month")).getText();
//           String ayear = driver.findElement(By.className("numInput cur-year")).getText();
//          
//           
//           while (!(amonth.equals ("june")   &&   ayear.equals ("2023"))) {
//        	   
//        	   driver.findElement(By.className("arrowUp")).click();
//        	   amonth = driver.findElement(By.className("flatpickr-monthDropdown-month")).getText();
//        	   ayear = driver.findElement(By.className("numInput cur-year")).getText();
//        	   
//        	   
//        	   
//           }
//           
//           
//           while (true) {
//               String visibleMonthYear = driver.findElement(By.cssSelector(".flatpickr-current-month")).getText(); 
//               if (visibleMonthYear.contains("June") && visibleMonthYear.contains("2025")) {
//                   break;
//               }
//               driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
//               Thread.sleep(500); // slight delay for animation
//           }
//
//           // 4. Click on 12th day
//           WebElement day12 = waitt.until(ExpectedConditions.elementToBeClickable(
//               By.xpath("//span[contains(@class, 'flatpickr-day') and text()='12' and not(contains(@class, 'disabled'))]")));
//           day12.click();
//           System.out.println("Clicked on 12 June 2025");



           
           
           WebElement JobT = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[4]/div[1]/div/div/input"));
           JobT.sendKeys("TitleJ");
           System.out.println("Job title filled");
           
           WebElement facebook = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[5]/div[1]/div/div/input"));
           facebook.sendKeys("https://www.google.com/");
           System.out.println("FB URL filled ");
           
           WebElement yesCheckbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div[1]/div[6]/div[1]/div/div/div/div[1]/label[1]/input"));

           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].scrollIntoView(true);", yesCheckbox);
           Thread.sleep(300); // optional: small wait after scroll

           // Click using JavaScript to avoid interception
           js.executeScript("arguments[0].click();", yesCheckbox);

           
           WebElement City = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[7]/div[1]/div/div/select/option[2]"));
           City.click();
           System.out.println("city clicked ");
           
           WebElement State = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[8]/div[1]/div/div/select/option[2]"));
           State.click();
           System.out.println("state clicked");
            
           WebElement Source = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[1]/div/div/select/option[2]"));
           Source.click();
           System.out.println("souces selected");
           
           WebElement referred = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[10]/div[1]/div/div/input"));
           referred.sendKeys("referring");
           System.out.println("referred filled");
           
           WebElement applicant = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[11]/div[1]/div/div/select/option[2]"));
           applicant.click();
           System.out.println("applicant clicked");
           
           WebElement TaxTerm = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[1]/div/div/select/option[3]"));
           TaxTerm.click();
           System.out.println("TaxTerm filled ");
           
           WebElement additional = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[13]/div[1]/div/div/textarea"));
           additional.sendKeys("additional area");
           System.out.println("additional area filled");
           
           WebElement skills = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[1]/div/div/select/option[2]"));
           skills.click();
           System.out.println("skills filled");
           
           WebElement Technology = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[3]/div/div/div/select/option[2]"));
           Technology.click();
           System.out.println("Technology filled");
           
           WebElement gender = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[1]/div/div/select/option[2]"));
           gender.click();
           System.out.println("gender clicked");
           
           WebElement veteranStatus = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[1]/div/div/select/option[2]"));
           veteranStatus.click();
           System.out.println("veteran status clicked");
           
           WebElement UniversityN = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div[1]/div[2]/div/div/div/div/input"));
           UniversityN.sendKeys("Amity");
           System.out.println("university ");
	   
	       WebElement Placement = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div/input"));
	       Placement.sendKeys("placementtt");
	       System.out.println("placement filled");
	    
	       

	    // Step 1: Scroll to top FIRST
	    // Step 1: Click on the date input
	    // Step 1: Click on the date input
	    // 1. Scroll up slightly to bring DOB into center view
//	       WebElement DOB = driver.findElement(By.xpath("//*[@id='kt_calendar_datepicker_start_date']"));
//	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", DOB);
//	       Thread.sleep(500);
//
//	       // 2. Click using JS to avoid interception
//	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DOB);
//
//	       // 3. Wait for calendar
//	       WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
//	       waitt.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
//
//	       // 4. Set year
//	       WebElement yearInput = driver.findElement(By.className("numInput"));
//	       yearInput.clear();
//	       yearInput.sendKeys("2025");
//
//	       // 5. Select June
//	       WebElement monthDropdown = driver.findElement(By.className("flatpickr-monthDropdown-months"));
//	       Select selectMonth = new Select(monthDropdown);
//	       selectMonth.selectByValue("5"); // June
//
//	       Thread.sleep(1000);
//
//
//	       // Step 5: Select 12th day (not disabled)
//	       WebElement day12 = wait.until(ExpectedConditions.elementToBeClickable(
//	           By.xpath("//span[contains(@class, 'flatpickr-day') and not(contains(@class,'disabled')) and text()='12']")));
//	       day12.click();
//
//	       System.out.println("Clicked on 12 June 2025");




	    
	       WebElement linkedIn = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[4]/div[2]/div/div/input"));
	       linkedIn.sendKeys("https://www.google.com/");
	       System.out.println("linkedin filled ");
	    
	       WebElement XProfile = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[5]/div[2]/div/div/input"));
	       XProfile.sendKeys("https://www.google.com/");
	       System.out.println("xprofile filled ");
	    
	       WebElement Address = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[6]/div[2]/div/div/input"));
	       Address.sendKeys("here is Address");
	       System.out.println("Address filled");
	    
	       WebElement country = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[7]/div[2]/div/div/select/option[3]"));
	       country.click();
	       System.out.println("Country Login");
	    
	       WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[8]/div[2]/div/div/input"));
	       Zipcode.sendKeys("76565");
	       System.out.println("Zipcode filled");
	    
	       WebElement Experience = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/select/option[2]"));
	       Experience.click();
	       System.out.println("Experience filled");
	    
	       WebElement ExselectMonth = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[9]/div[2]/div/div[2]/select/option[4]"));
	       ExselectMonth.click();
	       System.out.println("month selected");
	    
	       WebElement ApplStatus = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[10]/div[2]/div/div/select/option[3]"));
	       ApplStatus.click();
	       System.out.println("Application is selected");
	    
	       WebElement Ownership = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[11]/div[2]/div/div/select/option[3]"));
	       Ownership.click();
	       System.out.println("Ownership clicked");
	    
	       WebElement expectedPay = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[2]/div/div[1]/select/option[3]"));
	       expectedPay.click();
	       System.out.println("expected Pay clecked ");
	    
	       WebElement expectedpayNUM = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[12]/div[2]/div/div[2]/input"));
	       expectedpayNUM.sendKeys("67000");
	       System.out.println("expected pay in num filled");
	    
	       WebElement Relocation = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[13]/div[2]/div/div/div/div[1]/label[1]/span"));

	    // Scroll into view *before* clicking
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Relocation);

	    // Optional: wait a moment to ensure it's in view
	    Thread.sleep(500); // Replace with WebDriverWait if possible

	    // Now click
	    Relocation.click();

	    System.out.println("Relocation is clicked");

	     
	       WebElement primarySkills = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[1]/div[14]/div[2]/div/div/input"));
	       primarySkills.sendKeys("primary skills ");
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", primarySkills);
	       System.out.println("primary skills is filled");
	    
	       WebElement Nationality = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[2]/div[2]/div/div/select/option[2]"));
	       Nationality.click();
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Nationality);
	       System.out.println("nationality clicked");
	      
	       WebElement Disability = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/select/option[3]"));
	       Disability.click();
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Disability);
	       System.out.println("disability clicked");
	    
	       //Last Calender
//	       WebElement ExpectedGraduationDate = driver.findElement(By.xpath("//*[@id=\"kt_calendar_datepicker_start_date\"]"));
//	       ExpectedGraduationDate.click();
//	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ExpectedGraduationDate);
//	       System.out.println("Expected date filled");
	        
	       
	       
	       
//	       WebElement dateInput = driver.findElement(By.xpath("//*[@id=\"kt_calendar_datepicker_start_date\"]"));
//           dateInput.click();
//           System.out.println("Datepicker opened");
//
//           // 2. Wait until calendar appears
//           WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
//           waitt.until(ExpectedConditions.visibilityOfElementLocated(By.className("flatpickr-calendar")));
//           
//           String amonth = driver.findElement(By.className("flatpickr-monthDropdown-month")).getText();
//           String ayear = driver.findElement(By.className("numInput cur-year")).getText();
//          
//           
//           while (!(amonth.equals ("june")   &&   ayear.equals ("2023"))) {
//        	   
//        	   driver.findElement(By.className("arrowUp")).click();
//        	   amonth = driver.findElement(By.className("flatpickr-monthDropdown-month")).getText();
//        	   ayear = driver.findElement(By.className("numInput cur-year")).getText();
//        	   
//        	   
//        	   
//           }
//           
//           
//           while (true) {
//               String visibleMonthYear = driver.findElement(By.cssSelector(".flatpickr-current-month")).getText(); 
//               if (visibleMonthYear.contains("June") && visibleMonthYear.contains("2025")) {
//                   break;
//               }
//               driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
//               Thread.sleep(500); // slight delay for animation
//           }
//
//           // 4. Click on 12th day
//           WebElement day12 = waitt.until(ExpectedConditions.elementToBeClickable(
//               By.xpath("//span[contains(@class, 'flatpickr-day') and text()='12' and not(contains(@class, 'disabled'))]")));
//           day12.click();
//           System.out.println("Clicked on 12 June 2025");
	       
	      
	    		
	       WebElement createButton = driver.findElement(By.id("kt_account_profile_details_submit"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createButton);
	       Thread.sleep(500); // optional
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", createButton);
	       System.out.println("Create button clicked");

  
  
	    // Wait for 10 seconds
	       Thread.sleep(5000);

	       // Locate the "Documents" <p> tag using XPath by visible text
	       WebElement documents = driver.findElement(By.xpath("//p[normalize-space()='Documents']"));

	       // Scroll into view (bottom to top)
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", documents);

	       // Wait shortly after scroll (optional)
	       Thread.sleep(500);

	       // Click
	       documents.click();

	       System.out.println("Documents clicked after 10s and scroll from bottom to top.");

	     //  WebElement drivingL = driver.findElement(By.cssSelector("label[for='driving-licence-upload']"));
	     //  drivingL.click(); 
	       WebElement drivingLic= driver.findElement(By.id("driving-licence-upload"));
	       drivingLic.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\parrot.jpg");
	       System.out.println("drivimg lic uploaded");
  
	       WebElement licbutton = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[4]/div[2]/div/form/div[2]/button"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", licbutton);
	       Thread.sleep(1000); // Optional: allow UI to settle
	       licbutton.click();
	       System.out.println("driving lic created");

	       
	       
	    // Click "Education"
	       WebElement Education = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[3]/p"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", Education);
	       Thread.sleep(1000); // Let scroll/animations finish
	       Education.click();
	       System.out.println("education clicked");

	       Thread.sleep(10000); 
	       // Wait for the dropdown button (avoid using /text() in XPath!)
	       WebElement addNewBtn = driver.findElement(By.xpath("//button[contains(text(),'Add new')]"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", addNewBtn);
	       Thread.sleep(1000); // Let scroll complete
	       addNewBtn.click();
 // Replace with actual classes if available
           
           System.out.println("In Edu. clicked on add new");

	    WebElement SchoolN = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[1]/div/input"));
	    SchoolN.sendKeys("insight school");
	    System.out.println("school field filled");
	    
	    WebElement Degree = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[2]/div/input"));
	    Degree.sendKeys("DegreeIn");
	    System.out.println("Degree filled");
	    
	    WebElement FOS = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[3]/div/input"));
	    FOS.sendKeys("insightF");
	    System.out.println("studyF");
	    
	    WebElement Grade = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[4]/div/input"));
	    Grade.sendKeys("GradeI");
	    System.out.println("Grade filled ");
	    
	    WebElement FromY = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[5]/div/select/option[3]"));
	    FromY.click();
	    System.out.println("From year filled");
	    
	    WebElement ToY = driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[1]/div[6]/div/select/option[2]"));
	    ToY.click();
	    
	    driver.findElement(By.xpath("//*[@id=\"kt_account_settings_profile_details\"]/form/div[2]/div[2]/button")).click();
	    System.out.println("created EducAtion");
	    Thread.sleep(300);
	    
	    
	 WebElement certif =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[2]/div/ul/li[4]/p"));
	 certif.click();
	 WebElement fileInput = driver.findElement(By.id("file-accounting-upload"));
	 fileInput.sendKeys("C:\\Users\\Insightful\\OneDrive\\Pictures\\New folder\\girl.webp");
	 System.out.println("Certificate uploaded");


	 WebElement updateBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[6]/div/div/div/div/div[3]/button"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(updateBtn).click();
System.out.println("button clicked");

	 
	 
WebElement Lang = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[5]/p"));

	 Lang.click();
	 System.out.println("Language clicked");
   
driver.findElement(By.xpath("//*[@id=\"kt_account_settings_email_preferences\"]/form/div[1]/label[2]/span/span")).click();
driver.findElement(By.xpath("//*[@id=\"kt_account_settings_email_preferences\"]/form/div[1]/label[3]/span/span")).click();
System.out.println("lang selected");
   

	    WebElement workexp = driver.findElement(By.xpath("//*[@id=\"kt_app_main\"]/div[2]/div/div[2]/div/ul/li[6]/p"));
	    workexp.click();
	    System.out.println("workexp clicked");
	    
	 WebElement titlElement =   driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[2]/div/form/div[1]/div[1]/div/input"));
	 titlElement.sendKeys("Title");
	 System.out.println("Title filled");
	 
	 WebElement empTypElement =    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[2]/div/form/div[1]/div[2]/div/input"));
	 empTypElement.sendKeys("EMPTYPE");
	 System.out.println("emptype filled");
	 
	 WebElement Comp  =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[2]/div/form/div[1]/div[3]/div/input"));
	 Comp.sendKeys("EMp");
	 System.out.println("location filled");
	 
	  WebElement locat  = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[2]/div/form/div[1]/div[4]/div/input"));
	  locat.sendKeys("LOCATION");
	  System.out.println("location filled");
	    
	  WebElement updateBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[2]/div/div[8]/div[2]/div/form/div[2]/button"));
		 Actions actions1 = new Actions(driver);
		 actions1.moveToElement(updateBtn1).click();
	    System.out.println("Applicant has been created");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	           
	            System.out.println("Browser closed.");
	        }

}}}