package proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在 invoke()方法中需要做的:
 * 1. 完成目标对象方法的回调
 * 2. 完成功能增强（如果需要的话）
 */
public class SellHandler implements InvocationHandler {

    private Object target;

    public SellHandler(Object target){   //创建 handler对象的时候, 需要把目标对象（被代理对象）作为参数传进来
        this.target =target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 参数1: 代理对象本身
        // 参数2: 被代理的方法对象
        // 参数3: 被代理方法应该传入的参数

        Object res = method.invoke(target, args);  // 回调目标对象的方法, 使用res保存
        if(res != null){
            Float price = (Float) res;
            price += 20;

            res = price;
        }
        return res;
    }
}
