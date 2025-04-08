package steps_definition;


import io.cucumber.java.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver driver;
    public static Actor user;
    @Before
    public void setup(){
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver.quit();
            driver.close();
        }
    }

}
