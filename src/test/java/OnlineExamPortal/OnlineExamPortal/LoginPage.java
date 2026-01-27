package OnlineExamPortal.OnlineExamPortal;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class LoginPage {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	    
		//Print the Title in Console
		String TestCase0=driver.getTitle();
		System.out.println("Page Title is: "+TestCase0);
		
		//Check whether the TestCase is fail or Pass in console
		if (TestCase0.equals("Login - Online Exam")) {
		    System.out.println(" Test Passed");
		} else {
		    System.out.println(" Test Failed");
		}
	}

	@Test(priority=1)
	public void TestCase1() {
		
		//Verify that the UserName Field is visible 
		WebElement UserName1=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		boolean TestCase1=UserName1.isDisplayed();
		if(TestCase1) {
			System.out.println("TestCase 1 is Passed");
		} else {
			System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() {
		
		//Verify that the UsrName Field is Enabled
		WebElement UserName2=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		boolean TestCase2=UserName2.isEnabled();
		if(TestCase2) {
			System.out.println("TestCase 2 is Passed");
		}else {
			System.out.println("TestCase 2 is Failed");
		}
	}
	
	@Test(priority=3)
	public void TestCase3() {
		
		//Verify that the Password Field is visible
		WebElement Password3=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		boolean TestCase3=Password3.isDisplayed();
		if(TestCase3) {
			System.out.println("TestCase 3 is Passed");
		} else {
			System.out.println("TestCase 3 is Failed");
		}
	}
	
	@Test(priority=4)
	public void TestCase4() {
		
		//Verify that the Password field is Enabled
		WebElement Password4=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		boolean TestCase4=Password4.isEnabled();
		if(TestCase4) {
			System.out.println("TestCase 4 is Passed");
		} else {
			System.out.println("TestCase 4 is Failed");
		}
	}
	
	@Test(priority=5)
	public void TestCase5() {
		
		//Verify that the SignUp Page Loading Properly
		WebElement SignUp5=driver.findElement(By.xpath("/html/body/div/p/a"));
		SignUp5.click();
		
		//Wait for the Browser to React
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Check whether the SignUp page is Loaded or not
		boolean TestCase5=driver.getCurrentUrl().equals("http://127.0.0.1:8000/signup/");
		
		//Print the Result in Console
		if(TestCase5) {
			System.out.println("TestCase 5 is Passed");
		} else {
			System.out.println("TestCase 5 is Failed");
		}
		
		// Go back to previous page
		driver.navigate().back();
	}
    
    @Test(priority=6)
    public void TestCase6() throws InterruptedException {
    	
    	//Pause the Browser
    	Thread.sleep(3000);
    	
    	//Give Invalid Input to UserName Field
    	WebElement UserName6=driver.findElement(By.xpath("//*[@id=\"username\"]"));
    	UserName6.sendKeys("kevin123");
        
    	//Give valid Password
    	WebElement Password6=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	Password6.sendKeys("Kevin@123");
    	
    	//Click the Login Button
    	WebElement LoginButton6=driver.findElement(By.xpath("/html/body/div/form/button"));
    	LoginButton6.click();
    	
    	//Wait to Answer
    	WebDriverWait wait6=new WebDriverWait(driver, Duration.ofSeconds(3));
    	
    	//Check whether the Input field accept valid input or not
    	boolean TestCase6=wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/p[1]"))).isDisplayed();
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase6) {
    			System.out.println("TestCase 6 is Passed");
    	} else {
    			    System.out.println("TestCase 6 is Failed");
    	}
    }
    @Test(priority=7)
    public void TestCase7() {
    	
    	//Give Valid UserName
    	WebElement UserName7=driver.findElement(By.xpath("//*[@id=\"username\"]"));
    	UserName7.sendKeys("Kevinn");
    	
    	//Give Invalid Password
    	WebElement Password7=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	Password7.sendKeys("Kevin");
    	
    	//Click the LoginButton
    	WebElement LoginButton7=driver.findElement(By.xpath("/html/body/div/form/button"));
    	LoginButton7.click();
    	
    	//Wait to Answer
    	WebDriverWait wait7=new WebDriverWait(driver, Duration.ofSeconds(3));
    	
    	//Check whether the Input field accept valid input or not
    	boolean TestCase7=wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/p[1]"))).isDisplayed();
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase7) {
    			System.out.println("TestCase 7 is Passed");
    	} else {
    			    System.out.println("TestCase 7 is Failed");
    	}
    }
    @Test(priority=8)
    public void TestCase8() throws InterruptedException {
    	
    	//Verify that the UserName field is showing alert message when the field is left blank
    	//Left the UserName field blank
    	WebElement UserName8=driver.findElement(By.xpath("//*[@id=\"username\"]"));
    	UserName8.sendKeys("");
    	
    	//Enter valid Password
    	WebElement Password8=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	Password8.sendKeys("Kevin@123");
    	
    	//Click the Login Button
    	WebElement LoginButton8=driver.findElement(By.xpath("/html/body/div/form/button"));
    	LoginButton8.click();
    	
    	//Locate the error message
    	WebElement UserNameError=driver.findElement(By.xpath("//*[@id=\"username\"]"));
    	boolean isRequired=UserNameError.getAttribute("required") != null;
    	
    	//Print the Result
    	if(isRequired) {
    		System.out.println("TestCase 8 is Passed");
    	} else {
    		System.out.println("TestCase 8 is Failed");
    	}
    	
    }
    @Test(priority=9)
    public void TestCase9() throws InterruptedException {
    	
    	//Verify that the Password field is showing error message when the user left the field blank
    	//Give Valid Input to UserName Field
    	WebElement UserName9=driver.findElement(By.xpath("//*[@id=\"username\"]"));
    	UserName9.sendKeys("Kevinn");
    	
    	//Left the Password Field Blank
    	WebElement Password9=driver.findElement(By.id("password"));
    	Password9.sendKeys("");
    	
    	//Click the Login Button
    	WebElement LoginButton9=driver.findElement(By.xpath("/html/body/div/form/button"));
    	LoginButton9.click();
    	
    	//Locate the error message
    	WebElement PasswordError=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	boolean isRequired=PasswordError.getAttribute("required") != null;
    	
    	//Print the Result in Console
    	if(isRequired) {
    		System.out.println("TestCase 9 is Passed");
    	} else {
    		System.out.println("TestCase 9 is Failed");
    	}
    }
    
    @Test(priority=10)
    public void TestCase10() throws InterruptedException {
    	
    	//Give the Input to UserName Field
    	WebElement UserName10=driver.findElement(By.id("username"));
    	UserName10.sendKeys("Kevinn");
    	
    	//Give the Input to Password field
    	WebElement Password10=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	Password10.sendKeys("Kevin@123");
    	
        //Click the Login Button
    	WebElement LoginButton10=driver.findElement(By.xpath("/html/body/div/form/button"));
    	LoginButton10.click();

    	//Check whether the Input field accept valid input or not
    	boolean TestCase10=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase10) {
    			System.out.println("TestCase 10 is Passed");
    	} else {
    			    System.out.println("TestCase 10 is Failed");
    	}
    }
    
    @AfterTest
    public void CloseWindow() {
    	driver.close();
    }
}

