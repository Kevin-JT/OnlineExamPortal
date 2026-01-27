package OnlineExamPortal.OnlineExamPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		
		//Open the WebPage
  	    driver.get("http://127.0.0.1:8000/");
  	  
  	    //Maximize the Window
  	    driver.manage().window().maximize();
  	  
  	    //Get the Title
  	    String GetTitle0=driver.getTitle();
  	    System.out.println("The Title is: "+GetTitle0);
     }
    
     @Test(priority=1)
     public void TestCase1() throws InterruptedException {
  	 
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
    	 
    	 //Verify that the Heading is Displayed or not
    	 //Locate the Element
    	 WebElement Heading2=driver.findElement(By.xpath("/html/body/div[1]/header/div/h1"));
    	 
    	 //Print the Result in Console
    	 if(Heading2.isDisplayed()) {
    		 System.out.println("TestCase 2 is Passed");
    	 } else {
    		 System.out.println("TestCase 2 is Failed");
    	 }
     }
     
     @Test(priority=3)
     public void TestCase3() {
    	 
    	 //Verify that the Char Box is visible for user
    	 //Locate the Chat Box
    	 WebElement ChatBox3=driver.findElement(By.xpath("//*[@id=\"chatContainer\"]"));
    	 
    	 //Print the Result in Console
    	 if(ChatBox3.isDisplayed()) {
    		 System.out.println("TestCase 3 is Passed");
    	 } else {
    		 System.out.println("TestCase 3 is Failed");
    	 }
     }
     
     @Test(priority=4)
     public void TestCase4() throws InterruptedException {
    	 
    	 //Verify that the User is able to Chat and the ChatBot is Replaying or not
    	 //Locate the Chat Field
    	 WebElement ChatField4=driver.findElement(By.xpath("//*[@id=\"chatInput\"]"));
    	 ChatField4.sendKeys("Hi");
    	 
    	 //Click the Send Button
    	 WebElement ChatSend4=driver.findElement(By.xpath("//*[@id=\"sendChatBtn\"]"));
    	 ChatSend4.click();
    	 
    	 //Pause the Browser
    	 Thread.sleep(1000);
    	 
    	 //Check the ChatBot is Replayed or not
    	 WebElement SupportElement=driver.findElement(By.xpath("//*[@id=\"chatMessages\"]/div[2]/strong"));
    	 String ChatReplay4=SupportElement.getText();
    	 
    	 //Print the Result in Console
    	 if(ChatReplay4.equals("Support:")) {
    		 System.out.println("TestCase 4 is Passed");
    	 } else {
    		 System.out.println("TestCase 4 is Failed");
    	 }
    }
     
     @Test(priority=5)
     public void TestCase5() {
    	 
    	 //Verify that the Start Button is visible to user
    	 //Locate the Button
    	 WebElement StartButton=driver.findElement(By.xpath("//*[@id=\"start-btn\"]"));
    	 
    	 //Print the Result in console
    	 if(StartButton.isDisplayed()) {
    		 System.out.println("TestCase 5 is Passed");
    	 } else {
    		 System.out.println("TestCase 5 is Failed");
    	 }
     }
     
     @Test(priority=6)
     public void TestCase6() throws InterruptedException {
    	 
    	 //Verify that the Exam is start when the user click the start Button
    	 //Locate the Start Button
    	 WebElement StartExam6=driver.findElement(By.xpath("//*[@id=\"start-btn\"]"));
    	 StartExam6.click();
    	 
    	 //Pause the Browser
    	 Thread.sleep(1000);
    	 
    	 //Verify the the Exam Page is Opened or not
    	 WebElement Timer=driver.findElement(By.xpath("//*[@id=\"timer\"]/div/h2"));
    	 String Exam6=Timer.getText();
    	 
    	 //Print the Result in Console
    	 if(Exam6.equals("Exam Questions")) {
    		 System.out.println("TestCase 6 is Passed");
    	 } else {
    		 System.out.println("TestCase 6 is Failed");
    	 }
     }
     
     @Test(priority=7)
     public void TestCase7() {
    	 
    	 //Verify that the Camera Area is Visible
    	 WebElement Camera7=driver.findElement(By.xpath("//*[@id=\"cameraArea\"]"));
    	 
    	 //Print the Result in Console
    	 if(Camera7.isDisplayed()) {
    		 System.out.println("TestCase 7 is Passed");
    	 } else {
    		 System.out.println("TestCase 7 is Failed");
    	 }
     }
     
     @Test(priority=8)
     public void TestCase8() {
    	 
    	 //Verify The Timer is Visible or not
    	 //Locate the Element
    	 WebElement Timer=driver.findElement(By.xpath("//*[@id=\"time\"]"));
    	 
    	 //Verify the timer is working or not
    	 boolean TimerWorking=Timer.isDisplayed();
    	 
    	 if(TimerWorking) {
    		 System.out.println("TestCase 8 is Passed");
    	 } else {
    		 System.out.println("TestCase 8 is Failed");
    	 }
     }
     
     @Test(priority=9)
     public void TestCase9() {
    	 
    	 //Verify that the Timer is Working Properly
    	 WebElement TimerDecrease9=driver.findElement(By.xpath("//*[@id=\"time\"]"));
    	 
    	 //Get the Current Time
    	 String PreviousTime=TimerDecrease9.getText();
    	 
    	 //Print the Result in console
    	 if(PreviousTime != null && !PreviousTime.isEmpty()) {
    		 System.out.println("TestCase 9 is Passed");
    	 } else {
    		 System.out.println("TestCase 9 is Failed");
    	 }
     }
     
     @Test(priority=10)
     public void TestCase10() {
    	 
    	 //Verify that the Exam Concludes when the Timer Goes 0
    	 //Locate the Timer
    	 WebElement TimerFinishes=driver.findElement(By.xpath("//*[@id=\"time\"]"));
    	 
    	 //Check the timer
    	 String CurrentTime=TimerFinishes.getText();
    	 
    	 //print the Result in Console
    	 if(CurrentTime.equals("00:00")) {
    		 System.out.println("TestCase 10 is Passed");
    	 } else {
    		 System.out.println("TestCase 10 is Failed");
    	 }
     }
     
     @Test(priority=11)
     public void TestCase11() throws InterruptedException {
    	 
    	 //Verify that the user is able to click the Answer
    	 //Locate the Answer Radio Button
    	 WebElement FirstAns=driver.findElement(By.xpath("//*[@id=\"timer\"]/div/div[1]/div[3]/label/input"));
    	 FirstAns.click();
    	 
     }
     
     @Test(priority=12)
     public void TestCase12() throws InterruptedException {
    	 
    	 //Verify that the Previous and Next button is working properly
    	 //Locate the Next Button
    	 WebElement NextButton=driver.findElement(By.xpath("//*[@id=\"nextBtn\"]"));
    	 NextButton.click();
    	 
    	 //Print the Change in Console
    	 WebElement NextQuestion=driver.findElement(By.xpath("//*[@id=\"timer\"]/div/div[2]"));
    	 boolean CurrentQuestion=NextQuestion.isDisplayed();
    	 if(CurrentQuestion) {
    		 System.out.println("The Next Button is Working Properly");
    	 } else {
    		 System.out.println("The Result is Not as Expected");
    	 }
    	 
    	 //Pause the Browser
    	 Thread.sleep(2000);
    	 
    	 //Locate the Previous Button
    	 WebElement PreviousButton=driver.findElement(By.xpath("//*[@id=\"prevBtn\"]"));
    	 PreviousButton.click();
    	 
    	 //Print the Result in Console
    	 WebElement PreviousQuestion12=driver.findElement(By.xpath("//*[@id=\"timer\"]/div/div[1]"));
    	 boolean FirstQuestion12=PreviousQuestion12.isDisplayed();
    	 if(FirstQuestion12) {
    		 System.out.println("TestCase 12 is Passed");
    	 } else {
    		 System.out.println("TestCase 12 is Failed");
    	 }
     }
     
     @Test(priority=13)
     public void TestCase13() {
    	 
    	 //Verify that that the Previous button is Disabled in first Question or not
    	 //Locate the Button
    	 WebElement PreviousButton13=driver.findElement(By.xpath("//*[@id=\"prevBtn\"]"));
    	 
    	 //print the Result in Console
    	 if(PreviousButton13.isEnabled()) {
    		 System.out.println("TestCase 13 is Failed");
    	 } else {
    		 System.out.println("TestCase 13 is Passed");
    	 }
     }
     
     @Test(priority=14)
     public void TestCase14() throws InterruptedException {
    	 
    	 //Verify that the Next Button is disabled in the Last Question or not
    	 //Locate the Button
    	 WebElement NextButton14=driver.findElement(By.xpath("//*[@id=\"nextBtn\"]"));
    	 
    	 //Enter Number of times to be clicked
    	 int clickTimes=30;
    	 
    	 for(int i=1;i<=clickTimes;i++) {
    		 if(NextButton14.isEnabled()) {
    			 NextButton14.click();
    		 }	 
    	 }
    	 
    		 if(NextButton14.isEnabled()) {
    			 System.out.println("TestCase 14 is Failed");
    		 } else {
    			 System.out.println("TestCase 14 is Passed");
    		 }    	
    	 }
     
     @AfterTest
     public void TestCase() {
    	
     driver.close();
     }
}
