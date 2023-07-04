package co.com.tata.retopracticoautomatizador.questions.iniciarsesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tata.retopracticoautomatizador.userinterface.iniciarsesion.IniciarSesionUserinterface.TEXT_LOGIN;

public class ValidarInicioSesion implements Question {

    public static ValidarInicioSesion exitoso() {
        return new ValidarInicioSesion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return TEXT_LOGIN.resolveFor(actor).isVisible();
    }
}
