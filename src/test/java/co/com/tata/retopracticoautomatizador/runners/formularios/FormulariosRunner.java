package co.com.tata.retopracticoautomatizador.runners.formularios;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/formularios/formularios.feature",
        glue = "co.com.tata.retopracticoautomatizador.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@DiligenciarFormulariosExitosamente"
)
public class FormulariosRunner {
}
