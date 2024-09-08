package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo1Steps {

	@Given("Cucumbers in a bucket")
	public void cucumbers_in_a_bucket() {

		System.out.println("Cucumbers in a bucket");

	}

	@When("eating one cucumber evreyday")
	public void eating_one_cucumber_evreyday() {
		System.out.println("eating one cucumber evreyday");

	}

	@Then("it is good for health")
	public void it_is_good_for_health() {

		System.out.println("it is good for health");
	}

	@Given("Lot of cucumbers in bucket")
	public void lot_of_cucumbers_in_bucket() {

		System.out.println("Lot of cucumbers in bucket");
	}

	@When("eating few cucumbers monthly")
	public void eating_few_cucumbers_monthly() {

		System.out.println("eating few cucumbers monthly");
	}

	@Then("it will be good for health")
	public void it_will_be_good_for_health() {

		System.out.println("it will be good for health");
	}




}
