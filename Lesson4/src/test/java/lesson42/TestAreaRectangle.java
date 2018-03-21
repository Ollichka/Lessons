package lesson42;

import lesson42.model.Rectangle;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value=Parameterized.class)
public class TestAreaRectangle {

    @Parameterized.Parameter(2)
    public double expected;
    @Parameterized.Parameter(1)
    public  double valuey;
    @Parameterized.Parameter
    public  double valuex;


    public Rectangle r;

    @Parameterized.Parameters(name="{index}:first side = {0}, second side = {1}. Area = {3}")
    public static Collection<Object[]> getSides() {
        return Arrays.asList(new Object[][]{
                {2,5,10},
                { 0,0,0},
                {7,3,21},
                { 2,65,122}
        });
    }


    @Before
    public void init() {
        r = new Rectangle(valuex,valuey,"blue");
    }

    @Test
    public void testArea() {
        double result = r.calcArea();
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }



}
