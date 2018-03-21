package lesson42;

import lesson42.model.Circle;
import lesson42.model.Rectangle;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value=Parameterized.class)
public class TestAreaCircle {

    @Parameterized.Parameter(1)
    public double expected;
    @Parameterized.Parameter
    public  double radius;


    public Circle r;

    @Parameterized.Parameters(name="{index}:radius = {0}. Area = {1}")
    public static Collection<Object[]> getRadius() {
        return Arrays.asList(new Object[][]{
                {2,12.56},
                { 4,50.24},
                {1,3.14}
        });
    }


    @Before
    public void init() {
        r = new Circle(radius,"blue");
    }

    @Test
    public void testArea() {
        double result = r.calcArea();
        Assert.assertEquals("Результат(" + result + ") не равен "+ expected,
                expected, result, 0.01);
    }



}
