package co.com.tata.retopracticoautomatizador.tasks.formularios;

import co.com.tata.retopracticoautomatizador.util.transversal.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tata.retopracticoautomatizador.models.DatosPrueba.obtener;
import static co.com.tata.retopracticoautomatizador.userinterface.formularios.FormulariosUserinterface.*;

public class DiligenciarFormularios implements Task {

    public static DiligenciarFormularios diligenciar() {
        return Tasks.instrumented(DiligenciarFormularios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("fecha1")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio1"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha2")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio2"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha3")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio3"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha4")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio4"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha5")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio5"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha6")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio6"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha7")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio7"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha8")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio8"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha9")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio9"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),

                Enter.theValue(obtener("fecha10")).into(INPUT_CALENDARIO),
                Click.on(CHECKBOX.of(obtener("radio10"))),
                Click.on(BUTTON_ENVIAR_FORMULARIO),
                Esperar.unTiempo(5000)
        );
    }
}
