package user_interfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LoginPage {
    public static final Target EMAIL_FIELD = Target.the("email field")
            .located(By.id("username"));
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.id("password"));
    public static final Target SIGN_IN_BUTTON = Target.the("sign in button")
            .located(By.xpath("//button[@type='submit']"));
}
