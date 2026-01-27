package OnlineExamPortal.OnlineExamPortal;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminPage {
      WebDriver driver;
      @BeforeTest
      public void BeforeTest() throws InterruptedException {
    	  
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
     public void TestCase2() {
    	 
    	 //Open the AdminPage
    	 WebElement AdminPage2=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul/li[3]/a"));
    	 AdminPage2.click();
    	 
    	 //Get the Page Title
    	 String GetTitle2=driver.getTitle();
    	 System.out.println("The Title is: "+GetTitle2);
     }
     
     @Test(priority=3)
     public void TestCase3() {
    	 
    	 //Verify that the Question Input field is visible
    	 WebElement Questionfield3=driver.findElement(By.xpath("/html/body/main/section/form/input[2]"));
 		 boolean TestCase3=Questionfield3.isDisplayed();
 		 if(TestCase3) {
 			System.out.println("TestCase 3 is Passed");
 		 } else {
 			System.out.println("TestCase 3 is Failed");
 		 }
     }
     
     @Test(priority=4)
     public void TestCase4() {
    	 
    	 //Verify that the Question field is enabled
    	 WebElement Questionfield4=driver.findElement(By.xpath("/html/body/main/section/form/input[2]"));
 		 boolean TestCase4=Questionfield4.isEnabled();
 		 if(TestCase4) {
 			System.out.println("TestCase 4 is Passed");
 		 }else {
 			System.out.println("TestCase 4 is Failed");
 		 }
     }
     
     @Test(priority=5)
     public void TestCase5() {
    	 
    	 //Verify that the Question field is accepting valid input
    	 //Locate the Field
    	 WebElement QuestionField5=driver.findElement(By.xpath("/html/body/main/section/form/input[2]"));
    	 QuestionField5.sendKeys("What is the capital of France?");
    	 
    	 //Get the Given Input
    	 String inputvalue=QuestionField5.getAttribute("value");
    	 
    	 //Print the Result in Console
    	 if(inputvalue.equals("What is the capital of France?")) {
    		 System.out.println("TestCase 5 is Passed");
    	 } else {
    		 System.out.println("TestCase 6 is Failed");
    	 }
    }
     
     @Test(priority=6)
     public void TestCase6() throws InterruptedException {
    	 
    	 //Verify that the Question field is not accepting invalid input
    	 //locate the Field
    	 WebElement QuestionField6=driver.findElement(By.xpath("/html/body/main/section/form/input[2]"));
    	 QuestionField6.clear();
    	 QuestionField6.sendKeys("@#$%^&*()");
    	 
    	 //Click the Enter Field the Field
    	 QuestionField6.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 6 is Failed");
    	 } else {
    	     System.out.println("TestCase 6 is Passed");
    	 }
    }
     
     @Test(priority=7)
     public void TestCase7() {
    	 
    	 //Verify that the Question Field is Error Message When the field is left blank
    	 //Locate the Field
    	 WebElement QuestionField7=driver.findElement(By.xpath("/html/body/main/section/form/input[2]"));
    	 QuestionField7.clear();
    	 
    	 //Switch to Next Field
    	 QuestionField7.sendKeys(Keys.ENTER);
    	 
    	 //Check whether the Question Field is showing error message
    	 String AlertMsg=QuestionField7.getAttribute("required");
    	 
    	 //Print the Result in Console
    	 if(AlertMsg !=null) {
    		 System.out.println("TestCase 7 is Passed");
    	 } else {
    		 System.out.println("TestCase 7 is Failed");
    	 }
    	 
    	 //Give Valid input Again
    	 QuestionField7.sendKeys("What is the capital of France?");
     }
     
     @Test(priority=8)
     public void TestCase8() throws InterruptedException {
    	 
    	 //Verify that the Option A field accept valid input
    	 //locate the Field
    	 WebElement OptionA8=driver.findElement(By.xpath("/html/body/main/section/form/input[3]"));
    	 OptionA8.sendKeys("a");
    	 
    	 //Click the Enter Field the Field
    	 OptionA8.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 8 is Passed");
    	 } else {
    	     System.out.println("TestCase 8 is Failed");
    	 }
     }
     
     @Test(priority=9)
     public void TestCase9() throws InterruptedException {
    	 
    	 //Verify that the Option A Field is not accepting invalid input
    	 //locate the Field
    	 WebElement OptionA9=driver.findElement(By.xpath("/html/body/main/section/form/input[3]"));
    	 OptionA9.clear();
    	 OptionA9.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	 
    	 //Click the Enter Field the Field
    	 OptionA9.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 9 is Failed");
    	 } else {
    	     System.out.println("TestCase 9 is Passed");
    	 }
     }
     
     @Test(priority=10)
     public void TestCase10() {
    	 
    	 //Verify that the Option A field is displaying error message when the field left blank
    	 //Locate the Field
    	 WebElement OptionA10=driver.findElement(By.xpath("/html/body/main/section/form/input[3]"));
    	 OptionA10.clear();
    	 
    	 //Switch to Next Field
    	 OptionA10.sendKeys(Keys.ENTER);
    	 
    	 //Check whether the Question Field is showing error message
    	 String AlertMsg=OptionA10.getAttribute("required");
    	 
    	 //Print the Result in Console
    	 if(AlertMsg !=null) {
    		 System.out.println("TestCase 10 is Passed");
    	 } else {
    		 System.out.println("TestCase 10 is Failed");
    	 }
    	 
    	 //Give Valid input Again
    	 OptionA10.sendKeys("Berlin");
     }
     
     @Test(priority=11)
     public void TestCase11() throws InterruptedException {
    	 
    	 //Verify that the Option B field is accepting valid input
    	 //locate the Field
    	 WebElement OptionB11=driver.findElement(By.xpath("/html/body/main/section/form/input[4]"));
    	 OptionB11.sendKeys("b");
    	 
    	 //Click the Enter Field the Field
    	 OptionB11.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 11 is Passed");
    	 } else {
    	     System.out.println("TestCase 11 is Failed");
    	 }
     }
     
     @Test(priority=12)
     public void TestCase12() throws InterruptedException {
    	 
    	 //Verify that the Option B Field is not accepting invalid input
    	 //locate the Field
    	 WebElement OptionB12=driver.findElement(By.xpath("/html/body/main/section/form/input[4]"));
    	 OptionB12.clear();
    	 OptionB12.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	 
    	 //Click the Enter Field the Field
    	 OptionB12.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 12 is Failed");
    	 } else {
    	     System.out.println("TestCase 12 is Passed");
    	 }
     }
     
     @Test(priority=13)
     public void TestCase13() {
    	 
    	 //Verify that the Option B field is displaying error message when the field left blank
    	 //Locate the Field
    	 WebElement OptionB13=driver.findElement(By.xpath("/html/body/main/section/form/input[4]"));
    	 OptionB13.clear();
    	 
    	 //Switch to Next Field
    	 OptionB13.sendKeys(Keys.ENTER);
    	 
    	 //Check whether the Question Field is showing error message
    	 String AlertMsg=OptionB13.getAttribute("required");
    	 
    	 //Print the Result in Console
    	 if(AlertMsg !=null) {
    		 System.out.println("TestCase 13 is Passed");
    	 } else {
    		 System.out.println("TestCase 13 is Failed");
    	 }
    	 
    	 //Give Valid input Again
    	 OptionB13.sendKeys("Madrid");
     }
     
     @Test(priority=14)
     public void TesTCase14() throws InterruptedException {
    	 
    	 //Verify that the Option C field is accepting valid input
    	 //locate the Field
    	 WebElement OptionC14=driver.findElement(By.xpath("/html/body/main/section/form/input[5]"));
    	 OptionC14.sendKeys("Paris");
    	 
    	 //Click the Enter Field the Field
    	 OptionC14.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 14 is Passed");
    	 } else {
    	     System.out.println("TestCase 14 is Failed");
    	 }
     }
     
     @Test(priority=15)
     public void TestCase15() throws InterruptedException {
    	 
    	 //Verify that the Option C Field is not accepting invalid input
    	 //locate the Field
    	 WebElement OptionC15=driver.findElement(By.xpath("/html/body/main/section/form/input[5]"));
    	 OptionC15.clear();
    	 OptionC15.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	 
    	 //Click the Enter Field the Field
    	 OptionC15.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 15 is Failed");
    	 } else {
    	     System.out.println("TestCase 15 is Passed");
    	 }
     }
     
     @Test(priority=16)
     public void TestCas16() {
    	 
    	 //Verify that the Option C field is displaying error message when the field left blank
    	 //Locate the Field
    	 WebElement OptionC16=driver.findElement(By.xpath("/html/body/main/section/form/input[5]"));
    	 OptionC16.clear();
    	 
    	 //Switch to Next Field
    	 OptionC16.sendKeys(Keys.ENTER);
    	 
    	 //Check whether the Question Field is showing error message
    	 String AlertMsg=OptionC16.getAttribute("required");
    	 
    	 //Print the Result in Console
    	 if(AlertMsg !=null) {
    		 System.out.println("TestCase 16 is Passed");
    	 } else {
    		 System.out.println("TestCase 16 is Failed");
    	 }
    	 
    	 //Give Valid input Again
    	 OptionC16.sendKeys("Paris");
     }
     
     @Test(priority=17)
     public void TestCase17() throws InterruptedException {
    	 
    	 //Verify that the Option D field is accepting valid input
    	 //locate the Field
    	 WebElement OptionD17=driver.findElement(By.xpath("/html/body/main/section/form/input[6]"));
    	 OptionD17.sendKeys("Rome");
    	 
    	 //Click the Enter Field the Field
    	 OptionD17.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 17 is Passed");
    	 } else {
    	     System.out.println("TestCase 17 is Failed");
    	 }
     }
     
     @Test(priority=18)
     public void TestCase18() throws InterruptedException {
    	 
    	 //Verify that the Option D Field is not accepting invalid input
    	 //locate the Field
    	 WebElement OptionD18=driver.findElement(By.xpath("/html/body/main/section/form/input[6]"));
    	 OptionD18.clear();
    	 OptionD18.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	 
    	 //Click the Enter Field the Field
    	 OptionD18.sendKeys(Keys.ENTER);
    	 
    	 //Pause the browser
    	 Thread.sleep(1000);
    	 
    	 //Check if the next field is now active
         WebElement activeElement=driver.switchTo().activeElement();
         
         //Print the Result in Console
    	 if (activeElement.equals(activeElement)) {
    	     System.out.println("TestCase 18 is Failed");
    	 } else {
    	     System.out.println("TestCase 18 is Passed");
    	 }
     }
     
     @Test(priority=19)
     public void TestCase19() {
    	 
    	 //Verify that the Option D field is displaying error message when the field left blank
    	 //Locate the Field
    	 WebElement OptionD19=driver.findElement(By.xpath("/html/body/main/section/form/input[6]"));
    	 OptionD19.clear();
    	 
    	 //Switch to Next Field
    	 OptionD19.sendKeys(Keys.ENTER);
    	 
    	 //Check whether the Question Field is showing error message
    	 String AlertMsg=OptionD19.getAttribute("required");
    	 
    	 //Print the Result in Console
    	 if(AlertMsg !=null) {
    		 System.out.println("TestCase 19 is Passed");
    	 } else {
    		 System.out.println("TestCase 19 is Failed");
    	 }
    	 
    	 //Give Valid input Again
    	 OptionD19.sendKeys("Rome");
     }
     
     /*@Test(priority=20)
     public void TestCase20() throws InterruptedException {
    	 
    	 //Verify that the Correct Answer field is not accepting invalid input
    	 //locate the Field
    	 WebElement CorrectAns20=driver.findElement(By.xpath("/html/body/main/section/form/input[7]"));
    	 CorrectAns20.sendKeys("e");
    	 
    	 //Verify that the Submit button is working Properly
    	 WebElement SubmitButton20=driver.findElement(By.xpath("/html/body/main/section/form/button"));
    	 SubmitButton20.click();
    	 
    	 //Pause the browser
    	 Thread.sleep(3000);
    	 
    	 //Get the Current URL
    	 boolean CurrentUrl=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
         
         //Print the Result in Console
    	 if (CurrentUrl) {
    	     System.out.println("TestCase 20 is Passed");
    	 } else {
    	     System.out.println("TestCase 20 is Failed");
    	 }
     }*/
     
     /*@Test(priority=21)
     public void TestCase21() throws InterruptedException {
    	 
    	 //Verify that the Correct Answer field is not accepting when the user left the field blank
    	 //locate the Field
    	 WebElement CorrectAns21=driver.findElement(By.xpath("/html/body/main/section/form/input[7]"));
    	 CorrectAns21.sendKeys("");
    	 
    	 //Verify that the Submit button is working Properly
    	 WebElement SubmitButton21=driver.findElement(By.xpath("/html/body/main/section/form/button"));
    	 SubmitButton21.click();
    	 
    	 //Pause the browser
    	 Thread.sleep(3000);
    	 
    	 //Get the Current URL
    	 boolean CurrentUrl=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
         
         //Print the Result in Console
    	 if (CurrentUrl) {
    	     System.out.println("TestCase 21 is Passed");
    	 } else {
    	     System.out.println("TestCase 21 is Failed");
    	 }
     }*/
     
     @Test(priority=22)
     public void TestCase22() throws InterruptedException {
    	 
    	 //Verify that the Correct Answer field is accepting valid input
    	 //locate the Field
    	 WebElement CorrectAns22=driver.findElement(By.xpath("/html/body/main/section/form/input[7]"));
    	 CorrectAns22.sendKeys("a");
    	 
    	 //Verify that the Submit button is working Properly
    	 WebElement SubmitButton21=driver.findElement(By.xpath("/html/body/main/section/form/button"));
    	 SubmitButton21.click();
    	 
    	 //Pause the browser
    	 Thread.sleep(3000);
    	 
    	 //Get the Current URL
    	 boolean CurrentUrl=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
         
         //Print the Result in Console
    	 if (CurrentUrl) {
    	     System.out.println("TestCase 22 is Passed");
    	 } else {
    	     System.out.println("TestCase 22 is Failed");
    	 }
     }
     
     @AfterTest
     public void CloseWindow() {
     driver.close();
     }
}
