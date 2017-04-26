/**
 * Created by Billy Yuan on 2017/4/26.
 * Email: billy112487983@gmail.com
 */

public class LazyInitializationSingletonA {
    //延迟初始化
    private static LazyInitializationSingletonA instance;

    //私有构造方法
    private LazyInitializationSingletonA() {

    }

    //获取单例，如果没有创建，就在这里创建
    public static LazyInitializationSingletonA getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingletonA();
        }
        return instance;
    }
}
