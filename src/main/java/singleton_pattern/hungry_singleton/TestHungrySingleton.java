package main.java.singleton_pattern.hungry_singleton;

public class TestHungrySingleton {
    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.instance;
        HungrySingleton s2 = HungrySingleton.instance;

        System.out.println(s1 == s2);  //是同一个对象

    }
}
