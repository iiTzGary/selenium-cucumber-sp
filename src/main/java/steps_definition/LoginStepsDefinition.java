package steps_definition;

import io.cucumber.java.StepDefinitionAnnotations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.IsHomePageVisible;
import questions.IsProfileVisible;
import tasks.Login;
import tasks.NavigateTo;
import tasks.NavigateToProfile;
import utils.Base64Util;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class LoginStepsDefinition {
    @Managed
    WebDriver driver;

    @Given("the user is on the LinkedIn login page")
    public void userIsOnLoginPage() {
       Hooks.user.attemptsTo(NavigateTo.theLogInPage());
    }
    @When("enters valid credentials")
    public void enters_valid_credentials() {
        Hooks.user.attemptsTo(Login.withCredentials(Base64Util.decodeText("encodedEmail"), Base64Util.decodeText("EncodedPwd")));
    }
    @Then("it should see the homepage")
    public void it_should_see_the_homepage() {
        Hooks.user.should(seeThat(IsHomePageVisible.displayed(), is(true)));

    }
    @When("navigates to the profile")
    public void navigates_to_the_profile() {
        Hooks.user.attemptsTo(NavigateToProfile.page());
    }
    @Then("the profile page should be displayed")
    public void the_profile_page_should_be_displayed() {
        Hooks.user.should(seeThat(IsProfileVisible.displayed(), is(true)));
    }
}
