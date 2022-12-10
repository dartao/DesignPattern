package main.java.factory_pattern.simple_factory;

/**
 * 简单工厂模式: 又称为静态工厂方法模式
 * 根据参数的不同,返回不同类的实例。
 * 简单工厂模式专门定义一个类来负责创建其他类的实例,并且被创建的实例都具有相同的父类（比如ProductA和ProductB具有相同的父类Product）
 *
 * 工厂类:
 * 根据传入参数的不同,创建不同的产品
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");

        product.print();
    }

    public static Product createProduct(String type){  // 根据传入参数的不同,生产不同的产品
        if("A".equals(type)){
            return new ProductA();
        }
        else if("B".equals(type)){
            return new ProductB();
        }
        else{
            return null;
        }
    }
}
