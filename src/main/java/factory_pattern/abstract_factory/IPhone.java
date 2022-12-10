package main.java.factory_pattern.abstract_factory;

/**
 * 声明具体的产品类 实现大类产品
 */
public class IPhone implements Phone{
    @Override
    public void print() {
        System.out.println("iPhone");
    }
}
