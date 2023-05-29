package udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static udea.calidad.userinterfaces.UsuarioPage.VALIDAR;


public class Validacion implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        String stringTemporal = Text.of(VALIDAR).viewedBy(actor).asString();
        if(stringTemporal.contains("actividadId")){
            return true;
        }else {
            return false;
        }
    }

    public static Validacion theHomePage(){return new Validacion();}
}
