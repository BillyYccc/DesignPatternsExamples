/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class CircleFactory extends ShapeFactory {
    @Override
    protected Shape createShape(String name) {
        return new Circle(name);
    }
}