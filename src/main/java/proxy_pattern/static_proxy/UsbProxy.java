package proxy_pattern.static_proxy;

/**
 * 本质上就是为代理类传入一个目标类对象, 或者直接在代理类中 new 一个目标类对象
 *
 * 然后在方法中调用目标对象的方法, 同时也可以做一些功能增强 / 控制访问
 */
public class UsbProxy implements UsbSell{

    //使用构造方法从外面传入一个目标类的对象
    private UsbFactory usbFactory;

    public UsbProxy(UsbFactory usbFactory){
        this.usbFactory = usbFactory;
    }

    //直接在代理类中创建一个目标类对象
//    private UsbFactory usbFactory = new UsbFactory();

    @Override
    public float sell(int amount) {
        float price = usbFactory.sell(amount);  //调用目标对象的方法

        price += 20;  //使用代理做功能增强

        return price;
    }
}
