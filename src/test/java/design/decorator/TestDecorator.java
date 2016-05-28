/**
 * Copyright (c) 2016 云智盛世
 * Created with TestDecorator.
 */
package design.decorator;

import org.junit.Test;
import top.gabin.design.decorator.Programmer;
import top.gabin.design.decorator.ProjectManager;

/**
 * 装饰器测试类
 * @author linjiabin on  16/4/30
 */
public class TestDecorator {

    @Test
    public void testWork() {
        // 程序员
        Programmer programmer = new Programmer();
        // 项目管理人
        ProjectManager pm = new ProjectManager(programmer);
        // 我是一个拥有程序员技能的项目管理人
        pm.work();
    }

}
