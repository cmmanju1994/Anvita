package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {


	@Given("Player is good cricket")
	public void player_is_good_cricket() {
		System.out.println("Player is good cricket");
	}

	@Given("he scored more runs in ipl")
	public void he_scored_more_runs_in_ipl() {
		System.out.println("he scored more runs in ipl");

	}

	@When("player played good ipl season in the current year")
	public void player_played_good_ipl_season_in_the_current_year() {
		System.out.println("player played good ipl season in the current year");

	}

	@Then("he will be selected")
	public void he_will_be_selected() {

		System.out.println("he will be selected");
	}

	@Given("he scored more runs in ranaji")
	public void he_scored_more_runs_in_ranaji() {

		System.out.println("he scored more runs in ranaji");
	}

	@When("player played good ranaji season in the current year")
	public void player_played_good_ranaji_season_in_the_current_year() {

		System.out.println("player played good ranaji season in the current year");
	}

}
