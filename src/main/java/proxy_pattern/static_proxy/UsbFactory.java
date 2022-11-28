package proxy_pattern.static_proxy;

/**
 * 定义目标类, 实现接口中的方法
 */
public class UsbFactory implements UsbSell{

    @Override
    public float sell(int amount) {

        return 30f * amount;
    }
}
