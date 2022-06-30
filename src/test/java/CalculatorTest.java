import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30, "Looks like method have some issues");
    }
    @Test
    public void testSubtractMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(20, 10), 10);
    }
    @Test
    public void testDivideMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(20, 10), 2);
    }
    @Test
    public void testMultiplyMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(10, 2), 20);
    }
}
