package lesson42;

import lesson42.model.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value=Parameterized.class)
public class TestAreaTriangle {

    @Parameterized.Parameter(3)
    public double expected;
    @Parameterized.Parameter(2)
    public  double valuez;
    @Parameterized.Parameter(1)
    public  double valuey;
    @Parameterized.Parameter
    public  double valuex;


    public Triangle r;

    @Parameterized.Parameters(name="{index}:first side = {0}, second side = {1}, third side = {2}. Area = {3}")
    public static Collection<Object[]> getSides() {
        return Arrays.asList(new Object[][]{
                {3,4,5,6},
                { 0,0,0,0},
                {2,2,2,1.73}
        });
    }


    @Before
    public void init() {
        r = new Triangle(valuex,valuey,valuez,"blue");
    }

    @Test
    public void testArea() {
        double result = r.calcArea();
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.001);
    }



}
