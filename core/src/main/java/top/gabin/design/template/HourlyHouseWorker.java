/**
 * Copyright (c) 2016 云智盛世
 * Created with NormalHouseWorker.
 */
package top.gabin.design.template;

/**
 * 钟点工
 * @author linjiabin on  16/5/9
 */
public class HourlyHouseWorker extends HouseWorker {
    private Integer salary;
    public void cleanRoom() {
        System.out.println("我只能打扫半小时");
    }

    public void cooking() {
        System.out.println("一个小时内必须把饭菜做好");
    }

    @Override
    public boolean needFeedDog() {
        // 钱给的够多的话,我愿意帮您喂狗
        return salary > 1000;
    }

    public void feedDog() {
        System.out.println("虽然我不愿意喂狗,但是如果多给钱的话,我也是可以的.");
    }
}
