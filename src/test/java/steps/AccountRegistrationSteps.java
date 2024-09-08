package steps;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountRegistrationSteps {
	WebDriver driver;

	@Given("user is on registration page")
	public void user_is_on_registration_page() {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("user enters details as below")
	public void user_enters_details_as_below(io.cucumber.datatable.DataTable dataTable) {

		Map<String,String> mp=dataTable.asMap(String.class,String.class);

		driver.findElement(By.name("firstname")).sendKeys(mp.get("FirstName"));
		driver.findElement(By.name("lastname")).sendKeys(mp.get("LastName"));
		driver.findElement(By.name("email")).sendKeys(mp.get("Email"));
		driver.findElement(By.name("telephone")).sendKeys(mp.get("telephone"));
		driver.findElement(By.name("password")).sendKeys(mp.get("Password"));
		driver.findElement(By.name("confirm")).sendKeys(mp.get("Password"));

	}

	@When("user select privacy policy checkbox")
	public void user_select_privacy_policy_checkbox() {
		driver.findElement(By.name("agree")).click();

	}

	@When("user hit continue button")
	public void user_hit_continue_button() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();

	}

	@Then("account registration must be successful with msg {string}")
	public void account_registration_must_be_successful_with_msg(String Messeage) {

		String actText=driver.findElement(By.xpath("//div[@id=\"content\"]/h1")).getText();
		Assert.assertEquals(actText, Messeage);


	}




}
