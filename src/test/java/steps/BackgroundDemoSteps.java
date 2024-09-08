package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {

	@Given("I am not at home")
	public void i_am_not_at_home() {
		System.out.println("Given i am at home");

	}

	@When("i went out")
	public void i_went_out() {

		System.out.println("i went out");
	}

	@Then("i will play")
	public void i_will_play() {

		System.out.println("i will play");
	}




	@Given("I am in home")
	public void i_am_in_home() {

		System.out.println("I am in home given");
		Assert.assertTrue(false);

	}

	@Given("I will be improving")
	public void i_will_be_improving() {

		System.out.println("I will be improving");
	}

	@When("I come outside i will go for walk")
	public void i_come_outside_i_will_go_for_walk() {
		System.out.println("I come outside i will go for walk");

	}

	@Then("I will use cycle")
	public void i_will_use_cycle() {

		System.out.println("I will use cycle");
	}

	@When("I come outside i will go for run")
	public void i_come_outside_i_will_go_for_run() {
		System.out.println("I come outside i will go for run");

	}

	@Then("I will use bike")
	public void i_will_use_bike() {
		System.out.println("I will use bike");

	}




}
