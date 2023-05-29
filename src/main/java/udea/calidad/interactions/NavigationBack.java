package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static udea.calidad.userinterfaces.UsuarioPage.*;

public class NavigationBack implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(API));
        actor.attemptsTo(Click.on(BOTONTRY));

    }

    public static NavigationBack go(){
        return Tasks.instrumented(NavigationBack.class);
    }
}
