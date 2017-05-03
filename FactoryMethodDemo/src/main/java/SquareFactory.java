/**
 * Created by Billy Yuan on 2017/5/3.
 * Email: billy112487983@gmail.com
 */

public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape createShape(String name) {
        return new Square(name);
    }
}
