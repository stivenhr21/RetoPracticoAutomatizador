package co.com.tata.retopracticoautomatizador.stepdefinitions.iniciarsesion;

import co.com.tata.retopracticoautomatizador.questions.iniciarsesion.ValidarInicioSesion;
import co.com.tata.retopracticoautomatizador.tasks.comunes.OpenUrl;
import co.com.tata.retopracticoautomatizador.tasks.iniciarsesion.IniciarSesion;
import co.com.tata.retopracticoautomatizador.util.transversal.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("El actor").wasAbleTo(OpenUrl.thePage());
    }

    @Cuando("ingresa las credencioales de acceso")
    public void ingresaLasCredencioalesDeAcceso(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                IniciarSesion.login());
    }

    @Entonces("el usuario se visualizara logueado en el sitio web")
    public void elUsuarioSeVisualizaraLogueadoEnElSitioWeb() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarInicioSesion.exitoso(), Matchers.equalTo(true)
        ));
    }
}
