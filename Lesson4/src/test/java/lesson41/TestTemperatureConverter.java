package lesson41;

import lesson41.TemperatureConverter;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value=Parameterized.class)
public class TestTemperatureConverter {

    @Parameterized.Parameter(1)
    public double expected;
    @Parameterized.Parameter
    public  double value;

    public static TemperatureConverter tc;

    @Parameterized.Parameters(name="{index}:CaToK({0})={1}")
    public static Collection<Object[]> getTestDataCtoK() {
        return Arrays.asList(new Object[][]{
                {0,273.2},
                { -273.2,46},
                {100,373.2},
                { -100, 173.2}
        });
    }


    @BeforeClass
    public static void init() {
        tc = new TemperatureConverter();
    }

    @Test
    public void testConvertCtoK() {
        double result = tc.convertCtoK(value);
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }


    @Test
    public  void testConvertFtoC() {
        double value = 122;
        double expected = 100;
        double result = tc.convertFtoC(value);
        Assert.assertNotEquals("Результат(" + result + ")  равен "+ expected,
                expected, result, 0.001);
    }


    @Test
    public  void testConvertCtoF() {

        double value = 100;
        double expected = 212;
        double result = tc.convertCtoF(value);
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }





    @Test
    public void testConvertKtoC(){
        double value = 1273.2;
        double expected = 1000;
        double result = tc.convertKtoC(value);
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,expected, result, 0.001);
    }


    @Test
    public void testConvertKtoF(){
        double value = 99;
        double expected = -281.5;
        double result = tc.convertKtoF(value);
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }


    @Test
    public void testConvertFtoK() {

        double value = 310.389;
        double expected = 427.8272;
        double result = tc.convertFtoK(value);
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }

}
