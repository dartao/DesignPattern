package main.java.factory_pattern.abstract_factory;

/**
 * 声明具体的工厂实现抽象工厂
 */
public class HuaWeiFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}
