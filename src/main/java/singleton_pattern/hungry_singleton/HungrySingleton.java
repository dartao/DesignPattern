package main.java.singleton_pattern.hungry_singleton;

/**
 * 使用饿汉单例设计模式实现单例模式
 */

public class HungrySingleton {
    /**
     * 2.在获取对象前，对象就已经准备好了
     */
    public static HungrySingleton instance = new HungrySingleton();


    /**
     * 1.必须把构造器私有化
     */
    private HungrySingleton(){

    }

}
