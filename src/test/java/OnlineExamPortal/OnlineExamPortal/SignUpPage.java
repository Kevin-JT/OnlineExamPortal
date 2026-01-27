package OnlineExamPortal.OnlineExamPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpPage {
       WebDriver driver;
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
    		    System.out.println("Test Passed");
    		} else {
    		    System.out.println("Test Failed");
    		}
       }
       
    @Test(priority=1)
    public void TestCase1() {
    	   
    	//Open the SignUp Page
    	WebElement SignUpPage=driver.findElement(By.xpath("/html/body/div/p/a"));
    	SignUpPage.click();
    	  
    	//Print the Title in Console
  		String TestCase1=driver.getTitle();
  		System.out.println("Page Title is: "+TestCase1);
  		
  		//Check whether the TestCase is fail or Pass in console
  		if (TestCase1.equals("Sign Up")) {
  		    System.out.println("TestCase 1 Passed");
  		} else {
  		    System.out.println("TestCase 1 Failed");
  		}
    }
    
    @Test(priority=2)
    public void TestCase2() {
    	
    	//Verify that the UserName Field is visible 
		WebElement UserName2=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		boolean TestCase2=UserName2.isDisplayed();
		if(TestCase2) {
			System.out.println("TestCase 2 is Passed");
		} else {
			System.out.println("TestCase 2 is Failed");
		}
	}
    
    @Test(priority=3)
    public void TestCase3() {
    	
    	//Verify that the UsrName Field is Enabled
    	WebElement UserName3=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
    	boolean TestCase3=UserName3.isEnabled();
    	if(TestCase3) {
    		System.out.println("TestCase 3 is Passed");
    	}else {
    		System.out.println("TestCase 3 is Failed");
    	}
   	}
    
    @Test(priority=4)
    public void TestCase4() {
    	
    	//Verify that the Password Field is visible
    	WebElement Password3=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
   		boolean TestCase3=Password3.isDisplayed();
  		if(TestCase3) {
    		System.out.println("TestCase 4 is Passed");
    	} else {
    		System.out.println("TestCase 4 is Failed");
    	}
    }
    
    @Test(priority=5)
    public void TestCase5() {
    	
		//Verify that the Password field is Enabled
		WebElement Password4=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		boolean TestCase4=Password4.isEnabled();
		if(TestCase4) {
			System.out.println("TestCase 5 is Passed");
		} else {
			System.out.println("TestCase 5 is Failed");
		}
    }
    
    @Test(priority=6)
    public void TestCase6() throws InterruptedException {
    	
    	//Go to SignUp Page from Current Page and come back to Current Page and then Go to SignUp Page
    	//Open the Login Page
    	driver.get("http://127.0.0.1:8000/");
        
    	//Go to SignUp Page
    	WebElement SignUp6=driver.findElement(By.xpath("/html/body/div/p/a"));
    	SignUp6.click();
    	
    	//Wait for 2 Seconds
    	Thread.sleep(2000);
    	
    	//Check whether the SignUp page is loaded or not
        boolean TestCase5=driver.getCurrentUrl().equals("http://127.0.0.1:8000/signup/");
		
		//Print the Result in Console
		if(TestCase5) {
			System.out.println("The  SignUp Page is Loaded Successfully");
		} else {
			System.out.println("The Test is Failed");
		}
    	
    	//Go Back to Current page
    	driver.navigate().back();
    	
    	//Pause the Browser for 2 Seconds
    	Thread.sleep(2000);
    	
        //Check whether the Page loads Previous page or not
    	boolean testCase5=driver.getCurrentUrl().equals("http://127.0.0.1:8000/");
		
		//Print the Result in Console
		if(testCase5) {
			System.out.println("The Previous page is Loaded Successfully");
		} else {
			System.out.println("The Test is Failed");
		}
    	
    	//Go To SignUp Page
    	driver.navigate().forward();
    	
    	//Print The Final Result
    	boolean Testcase5=driver.getCurrentUrl().equals("http://127.0.0.1:8000/signup/");
		
		//Print the Result in Console
		if(Testcase5) {
			System.out.println("TestCase 6 is Passed");
		} else {
			System.out.println("TestCase 6 is Failed");
		}
    }
    
    @Test(priority=7)
    public void TestCase7() throws InterruptedException {
    	
    	//Verify that the input fields are accepting valid inputs
    	//Locate the Fields 
    	WebElement UserName7=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
    	WebElement Password7=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
    	WebElement LoginButton7=driver.findElement(By.xpath("/html/body/div/form/button"));
    	
    	//Enter Inputs and Click Button
    	UserName7.sendKeys("Kevinnn");
    	Password7.sendKeys("Kevin@123");
    	LoginButton7.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase7=driver.getCurrentUrl().equals("http://127.0.0.1:8000/");
    	
    	//Print the Result in Console
    	if(TestCase7) {
    		System.out.println("TestCase 7 is Pased");
    	} else {
    		System.out.println("TestCase 7 is Failed");
    	}
    }
    
    @Test(priority=8)
    public void TestCase8() throws InterruptedException {
    	
    	//Verify that the Input field is not accepting invalid input
    	//Locate the Input fields
    	WebElement UserName8=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
    	WebElement Password8=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
    	WebElement LoginButton8=driver.findElement(By.xpath("/html/body/div/form/button"));
    	
    	//Enter Invalid input
    	UserName8.sendKeys("kev");
        Password8.sendKeys("kevin");
        LoginButton8.click();
        
        //Pause the Browser
        Thread.sleep(2000);
        
        //Verify the browser is not accepting invalid input
        WebElement Error8=driver.findElement(By.xpath("/html/body/div/form/p"));
        
        //Print the Result in Console
        if(Error8.isDisplayed()) {
        	System.out.println("TestCase 8 is Passed");
        } else {
        	System.out.println("TestCase 8 is Failed");
        }
    }
    
    @Test(priority=9)
    public void TestCase9() {
    	
    	//Verify that the UserName field is Showing error message when the user left the blank
    	//Locate the Field
    	WebElement UserName9=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
    	WebElement Password9=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
    	WebElement Button9=driver.findElement(By.xpath("/html/body/div/form/button"));
    	
    	//Execute the Test
    	UserName9.sendKeys("");
    	Password9.sendKeys("Kevin@123");
    	Button9.click();
    	
    	//Check the error message displays or not
    	String isRequired = UserName9.getAttribute("required");
    	
    	//Print the Result in Console
    	if(isRequired != null) {
    		System.out.println("TestCase 9 is Passed");
    	} else {
    		System.out.println("TestCase 9 is Failed");
    	}
    }
    
    @Test(priority=10)
    public void TestCase10() {
    	
    	//Verify that the Password field is displaying error message when the user left the field blank
    	//Locate the Field
    	WebElement UserName10=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
    	WebElement Password10=driver.findElement(By.xpath("/html/body/div/form/input[3]"));
    	WebElement Button10=driver.findElement(By.xpath("/html/body/div/form/button"));
    	
    	//Execute the Test
    	UserName10.sendKeys("Kevin");
    	Password10.sendKeys("");
    	Button10.click();
    	
    	//Check the error message displays or not
    	String isRequired10=Password10.getAttribute("required");
    	
    	//Print the Result in Console
    	if(isRequired10 != null) {
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
