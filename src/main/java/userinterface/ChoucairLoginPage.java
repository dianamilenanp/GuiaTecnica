package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target  LOGUIN_BUTTON= Target.the("button that shows us the form to login").located(By.xpath("//div[@class=´d-non d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target  INPUT_USER=Target.the("where do we write the user").located(By.id("username"));
    public static final Target  INPUT_PASSWORD=Target.the("where do we write the user").located(By.id("password"));
    public static final Target  ENTER_BUTTON= Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

}
