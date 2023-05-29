package co.edu.udea.calidad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import udea.calidad.questions.Validacion;
import udea.calidad.tasks.EnterInfo;
import udea.calidad.tasks.NavigationInThe;
import udea.calidad.userinterfaces.UsuarioPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class SimulationPageStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor usuario = Actor.named("Anderson");

    @Before
    public void preStage() {
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }


    @Given("dado que estoy en la home")
    public void queMeEncuentroEnHome(){

        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("navego en busca de opciones")
    public void  navegacionHome(){
        usuario.attemptsTo(NavigationInThe.browser(new UsuarioPage()));
    }

    @And("ingreso la informacion requerida")
    public void  ingresoInfo(){
        usuario.attemptsTo(EnterInfo.info(new UsuarioPage()));
    }
    @Then("me muestra la informacion")
    public void seMuestra(){
        usuario.should(seeThat(Validacion.theHomePage(),equalTo(true)));
    }

}
