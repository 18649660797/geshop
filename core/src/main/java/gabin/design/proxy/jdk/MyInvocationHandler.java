/**
 * Copyright (c) 2016 云智盛世
 * Created with MyInvocationHandler.
 */
package gabin.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Class description
 *
 *
 *
 * @author linjiabin on  16/5/15
 */
public class MyInvocationHandler implements InvocationHandler {

    private RealService realService;

    public MyInvocationHandler(RealService realService) {
        this.realService = realService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("获取时间,现在时间是:");
        Object invoke = method.invoke(realService, args);
        System.out.println("获取结束");
        return invoke;
    }
}
