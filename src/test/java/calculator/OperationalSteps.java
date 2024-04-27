package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OperationalSteps {
    private OperationalCalculator calculator;
    private int value1;
    private int value2;
    private String operation;
    private float result;

    @Before
    public void before() {
        calculator = new OperationalCalculator();
    }

    @When("Applying operation, ([\\*\\^\\/])")
    public void applyingOperationOperation(String operation_here) {
        operation = String.valueOf(operation_here.charAt(0));
        result = calculator.applyOperator(value1, value2, operation);
    }

    @Then("The result is {float}")
    public void theResultIsResult(float result_here) {
        Assert.assertEquals(result_here, result);
    }

    @Given("Two input values op, (-?\\d+) and (-?\\d+)")
    public void twoInputValuesOpFirstAndSecond(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
}
