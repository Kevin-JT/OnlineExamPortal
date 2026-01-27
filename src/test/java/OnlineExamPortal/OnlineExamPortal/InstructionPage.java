package OnlineExamPortal.OnlineExamPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstructionPage {
        
	WebDriver driver;
	@BeforeTest
	public void BeforeTest() {
		
		//Set The Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the WebPage
		driver.get("http://127.0.0.1:8000/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Get the Window Title
		String GetTitle=driver.getTitle();
		System.out.println("The Title is: "+GetTitle);
	}
	
	@Test(priority=1)
	public void TestCase1() throws InterruptedException {
		
		//Login to the Page
		//Locate the WebElements
  	    WebElement UserName1=driver.findElement(By.xpath("//*[@id=\"username\"]"));
  	    WebElement Password1=driver.findElement(By.xpath("//*[@id=\"password\"]"));
  	    WebElement Button1=driver.findElement(By.xpath("/html/body/div[1]/form/button"));
  	 
  	    //Enter Input Value
  	    UserName1.sendKeys("Kevinn");
  	    Password1.sendKeys("Kevin@123");
  	    Button1.click();
  	 
  	    //Pause the Browser
  	    Thread.sleep(3000);
  	 
  	    //Get the Page title
  	    String GetTitle1=driver.getTitle();
  	    System.out.println("The Title is: "+GetTitle1);
	}
	
	@Test(priority=2)
	public void TestCase2() {
		
		//Open the Instruction Page
		WebElement InstructionPage2=driver.findElement(By.linkText("Instructions"));
		InstructionPage2.click();
		
		//Verify that the page is Opened or Not
		String GetTitle2=driver.getCurrentUrl();
		
		//Print the Result in Console
		if(GetTitle2.equals("http://127.0.0.1:8000/pre/")) {
			System.out.println("TestCase 2 is Passed");
		} else {
			System.out.println("TestCase 2 is Failed");
		}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Verify that the Page Heading visible to Users
		//Pause the Browser
		Thread.sleep(2000);
		
		//Locate the Element
		WebElement PageHeading3=driver.findElement(By.xpath("/html/body/main/h2"));
		boolean TestCase3=PageHeading3.isDisplayed();
		
		//Print the Result in Console
		 if(TestCase3) {
			System.out.println("TestCase 3 is Passed");
		 } else {
			System.out.println("TestCase 3 is Failed");
		 }
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Verify that the General Guideline Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
		
		//Locate the Element
		WebElement GeneralGuide4=driver.findElement(By.xpath("/html/body/main/section[1]/h3"));
		boolean TestCase4=GeneralGuide4.isDisplayed();
		
		//Print the Result in Console
		 if(TestCase4) {
			System.out.println("TestCase 4 is Passed");
		 } else {
			System.out.println("TestCase 4 is Failed");
		 }
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Verify that the Exam  Rules Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
				
		//Locate the Element
		WebElement ExamRules5=driver.findElement(By.xpath("/html/body/main/section[2]/h3"));
		boolean TestCase5=ExamRules5.isDisplayed();
				
		//Print the Result in Console
	    if(TestCase5) {
		     System.out.println("TestCase 5 is Passed");
		} else {
		     System.out.println("TestCase 5 is Failed");
	 }
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException {
		
		//Verify that the Camera And Monitoring Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
						
		//Locate the Element
		WebElement CameraAndMonitor6=driver.findElement(By.xpath("/html/body/main/section[3]/h3"));
		boolean TestCase6=CameraAndMonitor6.isDisplayed();
						
		//Print the Result in Console
		if(TestCase6) {
			System.out.println("TestCase 6 is Passed");
		} else {
			System.out.println("TestCase 6 is Failed");
		}
	}
	
	@Test(priority=7)
	public void TestCase7() throws InterruptedException {
		
		//Verify that the Question Format Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
								
		//Locate the Element
		WebElement QuestionFormat7=driver.findElement(By.xpath("/html/body/main/section[4]/h3"));
		boolean TestCase7=QuestionFormat7.isDisplayed();
								
		//Print the Result in Console
		if(TestCase7) {
			System.out.println("TestCase 7 is Passed");
		} else {
			System.out.println("TestCase 7 is Failed");
		}
	}
	
	@Test(priority=8)
	public void TestCase8() throws InterruptedException {
		
		//Verify that the Not Allowed Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
										
		//Locate the Element
		WebElement NotAllowed8=driver.findElement(By.xpath("/html/body/main/section[5]/h3"));
		boolean TestCase8=NotAllowed8.isDisplayed();
										
		//Print the Result in Console
		if(TestCase8) {
			System.out.println("TestCase 8 is Passed");
		} else {
			System.out.println("TestCase 8 is Failed");
		}
	}
	
	@Test(priority=9)
	public void TestCase9() throws InterruptedException {
		
		//Verify that the Before You Start Portion is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
												
		//Locate the Element
		WebElement BeforeYouStart9=driver.findElement(By.xpath("/html/body/main/section[6]/h3"));
		boolean TestCase9=BeforeYouStart9.isDisplayed();
												
		//Print the Result in Console
		if(TestCase9) {
			System.out.println("TestCase 9 is Passed");
		} else {
			System.out.println("TestCase 9 is Failed");
		}
	}
	
	@Test(priority=10)
	public void TestCase10() throws InterruptedException {
		
		//Verify that the Final Note is Visible or Not
		//Pause the Browser
		Thread.sleep(1000);
		
		//Locate the Element
		WebElement FinalNote10=driver.findElement(By.xpath("/html/body/main/p"));
		boolean TestCase10=FinalNote10.isDisplayed();
														
		//Print the Result in Console
		if(TestCase10) {
			System.out.println("TestCase 10 is Passed");
		} else {
			System.out.println("TestCase 10 is Failed");
		}
	}
	
	@Test(priority=11)
	public void TestCase() {
		
		//Go Back to Home Page
		WebElement HomePage11=driver.findElement(By.linkText("Home"));
		HomePage11.click();
		
		//Verify that the page is Opened or Not
		String GetTitle11=driver.getCurrentUrl();
		
		//Print the Result in Console
		if(GetTitle11.equals("http://127.0.0.1:8000/home/")) {
			System.out.println("TestCase 11 is Passed");
		} else {
			System.out.println("TestCase 11 is Failed");
		}
	}
	
	@AfterTest
	public void CloseWindow() {
		driver.quit();
	}
}
