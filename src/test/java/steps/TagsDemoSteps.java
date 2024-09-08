package steps;

import io.cucumber.java.en.Given;

public class TagsDemoSteps {

	@Given("This is scenario {int}")
	public void this_is_scenario(Integer int1) {

		System.out.println("This is scenario "+int1);
	}

	@Given("It is also tags validation")
	public void it_is_also_tags_validation() {
		System.out.println("It is also tags validation");

	}
	@Given("tags behaviour")
	public void tags_behaviour() {

		System.out.println("tags behaviour");
	}

	@Given("I am {string}  and {string}")
	public void i_am_and(String name, String surname) {

		System.out.println("name is "+name+" and "+"surname is "+surname);
	}





}
