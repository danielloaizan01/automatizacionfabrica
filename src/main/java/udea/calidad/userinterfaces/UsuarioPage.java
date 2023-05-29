package udea.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target API = Target.the("API").locatedBy("//*[@id='operations-actividad-api-getActividadesDeGrupo']/div");

    public static final Target BOTONTRY = Target.the("BOTTONTRY").locatedBy("//*[@id='operations-actividad-api-getActividadesDeGrupo']/div[2]/div/div[1]/div[1]/div[2]/button");

    public static final Target TEXTINPUT = Target.the("INPUT").locatedBy("//*[@id='operations-actividad-api-getActividadesDeGrupo']/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input");

    public static final Target EJECUTAR = Target.the("EJECUTAR").locatedBy("//*[@id='operations-actividad-api-getActividadesDeGrupo']/div[2]/div/div[2]/button");
    public static final Target VALIDAR = Target.the("VALIDACION").locatedBy("//*[@id='operations-actividad-api-getActividadesDeGrupo']/div[2]/div/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div[1]/div/pre/code/span[23]");


    //public static final Target CAMBIAR = Target.the("CAMBIAR").locatedBy("");
    //public static final Target CAMBIAR = Target.the("CAMBIAR").locatedBy("");


}