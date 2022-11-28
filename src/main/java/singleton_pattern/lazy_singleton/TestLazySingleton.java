package main.java.singleton_pattern.lazy_singleton;

public class TestLazySingleton {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}
