package OnlineExamPortal.OnlineExamPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoutPage {
       
	WebDriver driver;
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Set the path
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
	public void TestCase2() throws InterruptedException {
		
		//Logout from the WebSite
		WebElement Logout2=driver.findElement(By.linkText("Logout"));
		Logout2.click();
		
		//Verify that the page is Opened or Not
		String GetTitle2=driver.getCurrentUrl();
		
		//Pause the Browser
		Thread.sleep(2000);
		
		//Print the Result in Console
		if(GetTitle2.equals("http://127.0.0.1:8000/")) {
			System.out.println("TestCase 2 is Passed - The WebPage is Successfully Logouts");
		} else {
			System.out.println("TestCase 2 is Failed");
		}
	}
	
	@AfterTest
	public void CloseWindow() {
		driver.quit();
	}
}
