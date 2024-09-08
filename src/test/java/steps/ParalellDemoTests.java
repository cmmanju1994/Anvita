package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParalellDemoTests {

	WebDriver driver;
	
	@Given("user is on google page")
	public void user_is_on_google_page() {
		driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("user enter mobile brand as {string}")
	public void user_enter_mobile_brand_as(String Brand1) {

      driver.findElement(By.id("APjFqb")).sendKeys(Brand1);
	}

	@Then("oppo appears")
	public void oppo_appears() {

 System.out.println("oppo");
	}

	@Then("apple appears")
	public void apple_appears() {
  System.out.println("apple");

	}



}
