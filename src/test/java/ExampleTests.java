import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class ExampleTests {

    @Test
    public void testAdd() {
        int a = 1;
        int b = 1;
        int expected = 2;
        int actual = Calculator.add(a, b);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 2;
        int expected = 3;
        int actual = Calculator.subtract(a, b);
    }

}
