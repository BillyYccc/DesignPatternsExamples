/**
 * Created by Billy Yuan on 2017/5/5.
 * Email: billy112487983@gmail.com
 */

public class SimpleFactory {
    public static Shape createShape(String type, String name) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle(name);
        } else if (type.equalsIgnoreCase("square")) {
            return new Square(name);
        } else {
            System.out.println("无法生产这种类型的产品");
            return null;
        }
    }
}
