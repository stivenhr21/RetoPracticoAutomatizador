package co.com.tata.retopracticoautomatizador.userinterface.formularios;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormulariosUserinterface {

    public static final Target INPUT_CALENDARIO = Target.the("calendario").located(By.xpath("//input[@name = 'date']"));

    public static final Target CHECKBOX = Target.the("Checkbox a seleccionar").locatedBy("//input[@value = '{0}']");

    public static final Target BUTTON_ENVIAR_FORMULARIO = Target.the("Boton para enviar el formulario").located(By.xpath("//button[contains(text(), 'Enviar')]"));

    public static final Target HASH_EXITO = Target.the("Hash de exito").located(By.xpath("//h1[contains(text(), 'Felicidades, has terminado la prueba exitosamente ')]"));

}
