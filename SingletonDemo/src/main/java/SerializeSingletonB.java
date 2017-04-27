import java.io.Serializable;

/**
 * Created by Billy Yuan on 2017/4/27.
 * Email: billy112487983@gmail.com
 */

public class SerializeSingletonB implements Serializable{
    //实现序列化接口的类，并且提供了readResolve方法的实现
    private SerializeSingletonB() {
    }

    private static class SingletonHelper {
        private static final SerializeSingletonB instance = new SerializeSingletonB();
    }

    public static SerializeSingletonB getInstance() {
        return SerializeSingletonB.SingletonHelper.instance;
    }

    public Object readResolve(){
        return getInstance();
    }
}
