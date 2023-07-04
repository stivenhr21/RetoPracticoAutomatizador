package co.com.tata.retopracticoautomatizador.tasks.iniciarsesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tata.retopracticoautomatizador.models.DatosPrueba.obtener;
import static co.com.tata.retopracticoautomatizador.userinterface.iniciarsesion.IniciarSesionUserinterface.*;

public class IniciarSesion implements Task {

    public static IniciarSesion login() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("usuario")).into(INPUT_USUARIO),
                Enter.theValue(obtener("clave")).into(INPUT_CLAVE),
                Click.on(BUTTON_ENVIAR_LOGIN)
        );
    }
}
