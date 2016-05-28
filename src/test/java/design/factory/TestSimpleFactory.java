/**
 * Copyright (c) 2016 云智盛世
 * Created with TestSimpleFactory.
 */
package design.factory;


import org.junit.Test;

/**
 * 简单工厂测试类
 * @author linjiabin on  16/4/30
 */
public class TestSimpleFactory {

    @Test
    public void testSimple() {
        String[] join = "::::".split(":", 5);
        for (String s : join) {
            System.out.println(s + "-");
        }
    }
}
