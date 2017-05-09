/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Paper implements FilePrototype {
    @Override
    public Paper clone() throws CloneNotSupportedException {
        System.out.println("Cloning Paper Object...");
        return (Paper) super.clone();
    }

    public String getInfo() {
        return "Paper Template...";
    }
}
