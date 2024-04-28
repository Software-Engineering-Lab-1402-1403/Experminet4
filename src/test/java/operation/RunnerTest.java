package operation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/operationFeatures")
@RunWith(Cucumber.class)
public class RunnerTest {
}
