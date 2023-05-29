package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import udea.calidad.interactions.ActividadGrupo;

public class EnterInfo implements Task {

    private final PageObject page;

    public EnterInfo(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ActividadGrupo.infoGo());
    }

    public static EnterInfo info(PageObject page){
        return Tasks.instrumented(EnterInfo.class,page);
    }
}
