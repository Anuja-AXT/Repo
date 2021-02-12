package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver d1;

	@Given("^open the appln in chrome browser$")
	
	public void open_the_appln_in_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Taywade\\Documents\\Anuja\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.get("file:///C:/Users/Ramesh%20Taywade/Documents/Anuja/Registration_form.html");
	    System.out.println("appln opened in chrome browser");
	}

	@When("^enter firstname , lastname , ok button$")
	public void enter_us_pswd_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d1.findElement(By.id("email")).sendKeys("Anuja");
		d1.findElement(By.id("psw")).sendKeys("123");
		d1.findElement(By.cssSelector("button[class='registerbtn']")).click();
		
	   System.out.println("username , password entered and login button is clicked");
	   
	   
	}
	
	@When("^enter \"(.*?)\" , \"(.*?)\" , ok button$")
	public void enter_ok_button(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d1.findElement(By.id("email")).sendKeys(arg1);
		d1.findElement(By.id("psw")).sendKeys(arg2);
		d1.findElement(By.cssSelector("button[class='registerbtn']")).click();
		
	   System.out.println("username , password entered and login button is clicked for multiple users");
	   
	}
	
	
	@Then("^create an account$")
	public void login_to_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("login to the account");
	}
	
	

}


