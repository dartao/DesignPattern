package proxy_pattern.dynamic_proxy;

public class UsbFactory implements UsbSell {

    @Override
    public float sell(int amount) {

        return 30f * amount;
    }
}
