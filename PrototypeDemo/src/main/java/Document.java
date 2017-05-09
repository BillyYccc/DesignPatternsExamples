/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Document implements FilePrototype {
    @Override
    public Document clone() throws CloneNotSupportedException {
        System.out.println("Cloning Document Object...");
        return (Document) super.clone();
    }

    public String getInfo() {
        return "Document Template...";
    }
}
