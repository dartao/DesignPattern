package main.java.singleton_pattern.lazy_singleton;
/**
 * 使用懒汉单例设计模式实现单例模式
 */
public class LazySingleton {
    /**
     * 2定义一个静态变量存储一个对象，此时并不为对象分配空间
     * note:如果将其声明为 public变量，在其他类中可以直接调用，那么可能会出现 null的情况
     */
    private static LazySingleton instance;


    /**
     * 3.声明一个方法，对外返回单例对象
     */
    public static LazySingleton getInstance(){
        if(instance == null){
            //如果第一次使用对象，先为其分配空间，避免为 null
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 1.将构造器私有化
     */
    private LazySingleton(){

    }
}
