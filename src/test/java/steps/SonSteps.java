package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SonSteps {

	@Given("I am given in scenario")
	public void i_am_given_in_scenario() {
		System.out.println("I am given in scenario");

	}

	@Then("I am then in scenario")
	public void i_am_then_in_scenario() {

		System.out.println("I am then in scenario");
	}




}
