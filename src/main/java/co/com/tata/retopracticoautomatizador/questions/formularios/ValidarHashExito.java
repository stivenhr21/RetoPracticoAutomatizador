package co.com.tata.retopracticoautomatizador.questions.formularios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tata.retopracticoautomatizador.userinterface.formularios.FormulariosUserinterface.HASH_EXITO;

public class ValidarHashExito implements Question {

    public static ValidarHashExito validar() {
        return new ValidarHashExito();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return HASH_EXITO.resolveFor(actor).isVisible();
    }
}
