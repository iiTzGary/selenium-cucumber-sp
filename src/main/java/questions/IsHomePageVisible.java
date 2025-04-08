package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import user_interfaces.HomePage;


public class IsHomePageVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.HOME_FEED.resolveFor(actor).isVisible();
    }

    public static IsHomePageVisible displayed() {
        return new IsHomePageVisible();
    }
}
