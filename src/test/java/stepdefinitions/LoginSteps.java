package stepdefinitions;


import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;


public class LoginSteps {


LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


@When("User logs in with valid credentials")
public void login() {
loginPage.login("wrong_user", "wrong_pass");
}
}