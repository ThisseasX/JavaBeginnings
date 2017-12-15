package thisseasx.december2017.experiments.TestingTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class MathClassTest {

    private MathClass mathClass;

    @Before
    public void setUp() throws Exception {
        mathClass = new MathClass();
    }

    @Test
    public void checkSign() throws Exception {
        Assert.assertEquals("positive", mathClass.checkSign(1));
        Assert.assertEquals("positive", mathClass.checkSign(0));
        Assert.assertEquals("negative", mathClass.checkSign(-1));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(2, mathClass.divide(4, 2));
        assertEquals(2, mathClass.divide(5, 2));
        assertEquals(1, mathClass.divide(3, 2));
        assertEquals(0, mathClass.divide(2, 3));
        assertEquals(0, mathClass.divide(0, 3));
        try {
            mathClass.divide(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("DIVIDED BY ZERO");
        }
    }

    @After
    public void tearDown() throws Exception {
        mathClass = null;
        assertNull(mathClass);
    }
}