import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class FactoryMethodTest {
    @Test
    public void factoryMethodTest() {
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory circleFactory = new CircleFactory();
        Shape square1 = squareFactory.createShape("square1");
        Shape square2 = squareFactory.createShape("square2");
        Shape circle1 = circleFactory.createShape("circle1");
        Shape circle2 = circleFactory.createShape("circle2");
        square1.draw();
        square2.draw();
        circle1.draw();
        circle2.draw();
    }
}
