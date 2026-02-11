package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.BaseTest;


public class LoginSteps extends BaseTest {


LoginPage loginPage;


@Given("User is on login page")
public void user_on_login_page() {
setUp();
loginPage = new LoginPage(getDriver());
loginPage.openSite();
}


@When("User enters valid credentials")
public void user_enters_credentials() {
loginPage.login("standard_user", "secret_sauce");
}


@Then("User should be logged in")
public void user_logged_in() {
tearDown();
}
}