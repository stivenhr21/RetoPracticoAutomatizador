package co.com.tata.retopracticoautomatizador.stepdefinitions.formularios;

import co.com.tata.retopracticoautomatizador.questions.formularios.ValidarHashExito;
import co.com.tata.retopracticoautomatizador.tasks.formularios.DiligenciarFormularios;
import co.com.tata.retopracticoautomatizador.util.transversal.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormulariosStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("diligencia todos los formularios")
    public void diligenciaTodosLosFormularios(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                DiligenciarFormularios.diligenciar());
    }

    @Entonces("el usuario visualizara hash de exito")
    public void elUsuarioVisualizaraHashDeExito() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarHashExito.validar(), Matchers.equalTo(true)
        ));
    }
}
