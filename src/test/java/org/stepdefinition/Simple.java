package org.stepdefinition;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Simple  extends Baseclass{
	
	@Given("To launch the chrome browser and maximise window.")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchbrowser();
		windowMaximise();
	    
	}

	@When("To launch the Url of the facebook application.")
	public void to_launch_the_url_of_the_facebook_application() {
		
		launchUrl("https://www.facebook.com/");
	  
	}


	@When("To pass the valid username in email field.")
	public void to_pass_the_valid_username_in_email_field() {
		WebElement e = driver.findElement(By.name("email"));
		passText("sunil@gmail.com", e);
	    
	}

	@When("To pass the invalid password in password field.")
	public void to_pass_the_invalid_password_in_password_field() {
		
		WebElement p = driver.findElement(By.id("pass"));
		passText("incorrectpass", p);
	    
	}

	@When("To click login button.")
	public void to_click_login_button() {
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	    
	}

	@When("To check wheather it navigate home page or not.")
	public void to_check_wheather_it_navigate_home_page_or_not() {
		
		System.out.println("Check your login credentials");
	    
	}

	@Then("To Close the browser.")
	public void to_close_the_browser() {
		
		closeEntireBrowser();
	}

}
