/**
 * Copyright (c) 2016 云智盛世
 * Created with JdkProxyTest.
 */
package top.gabin.design.proxy.jdk;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Class description
 *
 * @author linjiabin on  16/5/15
 */
public class JdkProxyTest {

    @Test
    public void testJdkProxy() {
        RealService realService = new RealServiceImpl();
        RealService proxyInstance = (RealService)Proxy.newProxyInstance(realService.getClass().getClassLoader(), RealServiceImpl.class.getInterfaces(), new MyInvocationHandler(realService));
        proxyInstance.now();
    }

}
