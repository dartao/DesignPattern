package main.java.factory_pattern.abstract_factory;

/**
 * 抽象工厂模式:
 * 一共有4类, 抽象工厂、抽象产品、具体工厂、具体产品
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new HuaWeiFactory();
        Phone phone = factory.createPhone();

        phone.print();
    }
}
