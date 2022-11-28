package proxy_pattern.static_proxy;

/**
 * 1. 创建一个目标对象
 * 2. 创建一个目标对象的代理对象,把目标对象作为一个参数传入
 * 3. 通过调用代理对象的sell方法,完成对目标对象sell方法的调用
 */

public class Test {
    public static void main(String[] args) {
        UsbFactory usbFactory = new UsbFactory();  // 1.

        UsbProxy usbProxy = new UsbProxy(usbFactory);  //2.

        System.out.println("使用代理,购买10个: "+usbProxy.sell(10));  // 3.
    }

}
