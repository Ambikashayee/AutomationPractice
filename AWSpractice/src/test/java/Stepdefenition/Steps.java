package Stepdefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	
	
	public static WebDriver driver;
	
	
	
	@Given("user is  on loginpage")
	public void user_is_on_loginpage() {
	    

		System.out.println("Test");
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Welcome\\Downloads\\geckodriver-v0.35.0-win32\\geckodriver.exe");
		driver =new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}


@When("^user navigates to Login Page$")

public void user_navigates_to_Login_Page()throws Throwable {
       // driver.findElement(By.id("username")).click();
}

    
    
@When("^user enters username and Password$")

public void user_enters_username_and_Password()throws Throwable {

    	driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
   
}

@Then("^success message is displayed$")
    
public void success_message_is_displayed()throws Throwable {
	
    	String exp_message="Congratulations student. You successfully logged in!";
    	String actual =driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/p[1]/strong")).getText();
        Assert.assertEquals(exp_message,actual);
        driver.quit();
      
}
}