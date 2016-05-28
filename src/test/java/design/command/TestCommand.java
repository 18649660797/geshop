/**
 * Copyright (c) 2016 云智盛世
 * Created with TestCommand.
 */
package design.command;

import org.junit.Test;
import top.gabin.design.command.RemoteControl;

/**
 * 命令测试类
 * @author linjiabin on  16/5/2
 */
public class TestCommand {

    @Test
    public void testCommand() {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.powerButtonOn();
        remoteControl.powerButtonOff();
    }

}
