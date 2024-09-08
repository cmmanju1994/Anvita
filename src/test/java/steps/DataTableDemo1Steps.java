package steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableDemo1Steps {
WebDriver driver;
	@Given("user in on the login page")
	public void user_in_on_the_login_page() {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@When("user enter password and username as below")
	public void user_enter_password_and_username_as_below(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> li=dataTable.asList(String.class);
		driver.findElement(By.name("email")).sendKeys(li.get(0));
		driver.findElement(By.name("password")).sendKeys(li.get(1));

	}
	@When("hit login button")
	public void hit_login_button() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

	}
	@Then("login should be successful")
	public void login_should_be_successful() {
		
//   boolean status=driver.findElement(By.xpath("(//a[contains(text(),\"Logout\")])[1]")).isDisplayed();
//   Assert.assertTrue(status);
	}
}
