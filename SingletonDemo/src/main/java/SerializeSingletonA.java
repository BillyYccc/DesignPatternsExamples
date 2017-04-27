import java.io.Serializable;

/**
 * Created by Billy Yuan on 2017/4/27.
 * Email: billy112487983@gmail.com
 */

public class SerializeSingletonA implements Serializable{
    //实现序列化接口的类
    private SerializeSingletonA() {
    }

    private static class SingletonHelper {
        private static final SerializeSingletonA instance = new SerializeSingletonA();
    }

    public static SerializeSingletonA getInstance() {
        return SingletonHelper.instance;
    }
}
