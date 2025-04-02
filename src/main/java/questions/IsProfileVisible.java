package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IsProfileVisible implements Question<Boolean> {

    private static final Target PROFILE_SECTION = Target.the("profile section")
            .located(By.xpath("//div[@id='profile-sticky-header-toggle']/parent::section"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return PROFILE_SECTION.resolveFor(actor).isVisible();
    }

    public static IsProfileVisible displayed() {
        return new IsProfileVisible();
    }
}