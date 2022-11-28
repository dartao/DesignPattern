package proxy_pattern.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UsbFactory usbFactory = new UsbFactory();

        SellHandler handler = new SellHandler(usbFactory);  //把目标对象传入

        UsbSell usbSell = (UsbSell) Proxy.newProxyInstance(usbFactory.getClass().getClassLoader(),
                                    usbFactory.getClass().getInterfaces(), handler);

        System.out.println("使用动态代理,购买10个:"+ usbSell.sell(10));
    }
}
