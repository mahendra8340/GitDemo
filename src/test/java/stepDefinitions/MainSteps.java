package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {

		System.out.println("In netbanking landing page");
	}


	@Then("Home page is displayed  And card are displayed")
	public void home_page_is_displayed_and_card_are_displayed() {

		System.out.println("Cards are displayed");
	}
	@When("User loign into application with {string} and {string}")
	public void user_loign_into_application_with_and_password(String username, String Password) {

		System.out.println("Login into application : "+username+"  "+Password);
	}
	
	@When("^User loign into application with (.+) and (.+) combination$")
	public void user_loign_into_application_with_and_password_combincation(String username, String Password) 
	{
		System.out.println("Login into application : "+username+"  "+Password);
	}
	
	@Given("User is on singup page")
	public void user_is_on_singup_page() {
	    System.out.println("user is on default signup page");
	    }
	@When("user signup in the application")
	public void user_signup_in_the_application(List<String> logininputs) {
	    System.out.println(logininputs.get(0));
	    System.out.println(logininputs.get(1));
	    System.out.println(logininputs.get(2));
	    System.out.println(logininputs.get(3));
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page displayed");
	}
	
	@Given("setup the entries")
	public void setup_the_entries()
	{
		System.out.println("-------------------------------------");
	}
	
	
	@When("launch the browser")
	public void launch_browser()
	{
		System.out.println("-------------------------------------");
	}
	
	@Then("failedcase")
	public void failedCase()
	{
		Assert.assertTrue(true);
	}
	
}
