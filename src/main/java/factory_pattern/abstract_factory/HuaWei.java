package main.java.factory_pattern.abstract_factory;

/**
 * 声明具体的产品类实现大类产品
 */
public class HuaWei implements Phone {
    @Override
    public void print() {
        System.out.println("HuaWei");
    }
}
