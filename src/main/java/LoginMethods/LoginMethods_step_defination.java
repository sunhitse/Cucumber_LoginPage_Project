package LoginMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginMethods_step_defination {
	
	WebDriver driver;
	
		
	@Given("Launch the Swag labs page")
	public void launch_the_swag_labs_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Enter the username")
	public void enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}

	@When("Enter the Password")
	public void enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("Logout of the application")
	public void logout_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
