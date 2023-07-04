package co.com.tata.retopracticoautomatizador.userinterface.iniciarsesion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")
public class IniciarSesionUserinterface extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Input para diligenciar el usuario").located(By.xpath("(//input[@class = 'p-2 rounded-md'])[1]"));

    public static final Target INPUT_CLAVE = Target.the("Input para diligenciar la clave").located(By.xpath("(//input[@class = 'p-2 rounded-md'])[2]"));

    public static final Target BUTTON_ENVIAR_LOGIN = Target.the("Boton para iniciar sesion").located(By.xpath("//button[contains(text(), 'Enviar')]"));

    public static final Target TEXT_LOGIN = Target.the("Texto con el cual validaremos si el usuario se logueo correctamente").located(By.xpath("//p[contains(text(), 'Se encuentra en el ciclo 1 de 10  ')]"));
}
