package operation;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OperationSteps {
    private OperationCalculator calculator;
    private int value1;
    private int value2;
    private float result;

    @Before
    public void before() {
        calculator = new OperationCalculator();
    }

    @Given("^two integers, (-?\\d+) and (-?\\d+)$")
    public void twoInputValues(Integer arg0, Integer arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^applying operation, ([\\*\\/\\^]) to them$")
    public void applyOperation(String op) {
        result = calculator.applyOperator(value1, value2, op);
        System.out.println(result);
    }
    @Then("^I want result (-?\\d*(?:[.,]\\d+)?)$")
    public void iExpectTheResult(float arg0) {
        Assert.assertEquals(arg0, result, 0);
    }
}
