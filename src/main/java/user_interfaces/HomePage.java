package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target PROFILE_ICON = Target.the("profile icon")
            .located(By.cssSelector(".global-nav__primary-link-me-menu-trigger"));
    public static final Target VIEW_PROFILE = Target.the("view profile link")
            .located(By.xpath("//header[@class='p2']/child::a"));
    public static final Target HOME_FEED = Target.the("home feed")
            .located(By.cssSelector(".profile-card-member-details"));
}