package org.stepdefinition;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outline1 extends Baseclass {
	
	@Given("User has to launch the chrome browser and maximise the window.")
	public void user_has_to_launch_the_chrome_browser_and_maximise_the_window() {
		
		launchbrowser();
		windowMaximise();
	   
	}

	@When("User has to launch the Url of the facebook application.")
	public void user_has_to_launch_the_url_of_the_facebook_application() {
		
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("User has to pass the data {string} in email field.")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		
		WebElement email = driver.findElement(By.name("email"));
		passText(em, email);
	    
	}

	@When("User has to pass the data {string} in password field.")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		
		WebElement password = driver.findElement(By.id("pass"));
		passText(pass, password);
	    
	   
	}

	@When("User has to click the login button.")
	public void user_has_to_click_the_login_button() {
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	    
	}

	@Then("Uer has to close the browser.")
	public void uer_has_to_close_the_browser() {
		
		closeEntireBrowser();
	    
	}

}
