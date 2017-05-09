/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Report implements FilePrototype {
    @Override
    public Report clone() throws CloneNotSupportedException {
        System.out.println("Cloning Report Object...");
        return (Report) super.clone();
    }

    public String getInfo() {
        return "Report Template...";
    }
}
