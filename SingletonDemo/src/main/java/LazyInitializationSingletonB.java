/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class LazyInitializationSingletonB {
    //延迟初始化
    private static LazyInitializationSingletonB instance;

    //私有构造方法
    private LazyInitializationSingletonB() {

    }

    //获取单例，如果没有创建，就在这里创建
    public static synchronized LazyInitializationSingletonB getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingletonB();
        }
        return instance;
    }
}
