package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features = "C:/ProjetosGit/Projeto_Correios/src/test/features/")
        plugin = { "html:target/cucumberHtmlReport" },
        features = "C:/DesafioWooza/src/test/Features/",
        tags = { "@smoketest" },
        glue = { "StepsDefinition" }
)

public class Runner {
}
