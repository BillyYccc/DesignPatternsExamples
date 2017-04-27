import java.io.Serializable;

/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public enum EnumSingleton implements Serializable {
    INSTANCE;

    public void doSomething() {
        System.out.println("enum单例方法...");
    }
}
