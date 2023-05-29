package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static udea.calidad.userinterfaces.UsuarioPage.*;

//prueba final
public class ActividadGrupo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(String.valueOf("4")).into(TEXTINPUT));
        actor.attemptsTo(Click.on(EJECUTAR));
    }

    public static ActividadGrupo infoGo() {
        return Tasks.instrumented(ActividadGrupo.class);
    }
}


