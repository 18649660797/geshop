/**
 * Copyright (c) 2016 云智盛世
 * Created with TestAdapter.
 */
package design.adapter;

import org.junit.Test;
import top.gabin.design.adapter.Cobbler;
import top.gabin.design.adapter.SmartAdapter;
import top.gabin.design.adapter.VariousGeBright;

/**
 * 测试适配器的效果
 *
 * @author linjiabin on  16/5/5
 */
public class TestAdapter {

    @Test
    public void testAdapter() {
        Cobbler cobbler = new Cobbler();
        VariousGeBright variousGeBright = new SmartAdapter(cobbler);
        String idea = variousGeBright.idea();
        System.out.println(idea);
    }

}
