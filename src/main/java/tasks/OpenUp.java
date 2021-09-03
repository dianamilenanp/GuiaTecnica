package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.ChoucairsacademyPage;

public class OpenUp implements Task {
    private ChoucairsacademyPage choucairsacademyPage;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(choucairsacademyPage));
    }
}
