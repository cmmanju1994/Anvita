package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LonginFunctionalitySteps {

WebDriver driver;

@Given("user is on home page")
public void user_is_on_home_page() {
   driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}

@When("user enter username as {string} and password as {string} and {string}")
public void user_enter_username_as_and_password_as_and(String username, String password, String expected) {
  
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	
}

@When("user click on login link")
public void user_click_on_login_link() {
   driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
   driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
}
@Then("user navigated to login page")
public void user_navigated_to_login_page() {
   WebElement txt=driver.findElement(By.xpath("//h2[contains(text(),\"New Customer\")]"));
   boolean status=txt.isDisplayed();
   Assert.assertTrue(status);
   
}
//@When("user enter valid username and password")
//public void user_enter_valid_username_and_password() {
//    driver.findElement(By.name("email")).sendKeys("anvita123@gmail.com");
//    driver.findElement(By.name("password")).sendKeys("test@123");
//}
@When("user enter username as {string} and password as {string}")
public void user_enter_username_as_and_password_as(String username, String password) {
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
    
}
@Then("login should not be succeful and warning messeage displayed as {string}")
public void login_should_not_be_succeful_and_warning_messeage_displayed_as(String expectedWarning) {
	String actText=driver.findElement(By.xpath("//*[contains(text(),\" Warning: No match for E-Mail Address and/or Password.\")]")).getText();
   Assert.assertEquals(actText, expectedWarning);
   driver.quit();
   }


@When("click on login button")
public void click_on_login_button() {
  driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
}
@Then("login should be succeful login and text {string} is being displayed")
public void login_should_be_succeful_login_and_text_is_being_displayed(String string) {
    WebElement dd=driver.findElement(By.xpath("//h2[contains(text(),\"My Account\")]"));
    boolean srarus=dd.isDisplayed();
    Assert.assertTrue(srarus);
    driver.quit();
}
}
