package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;

public class NavigateTo implements Task {

    private final String url;

    public NavigateTo(String url) {
        this.url = url;
    }

    @Step("{0} opens the browser and navigates to #url")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static NavigateTo theLogInPage() {
        return new NavigateTo("https://www.linkedin.com/login");
    }
}