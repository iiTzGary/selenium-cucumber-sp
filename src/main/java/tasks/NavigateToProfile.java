package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import user_interfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToProfile implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PROFILE_ICON),
                Click.on(HomePage.VIEW_PROFILE)
        );
    }

    public static NavigateToProfile page() {
        return instrumented(NavigateToProfile.class);
    }
}