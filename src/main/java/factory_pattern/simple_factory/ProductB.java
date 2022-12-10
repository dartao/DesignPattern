package main.java.factory_pattern.simple_factory;

/**
 * 继承抽象类Product, 并重写父类的方法 print(), 完成多态
 */

public class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("生产了一个产品B");
    }
}
