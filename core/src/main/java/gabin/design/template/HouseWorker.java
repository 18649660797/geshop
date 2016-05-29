/**
 * Copyright (c) 2016 云智盛世
 * Created with TargetTemplate.
 */
package gabin.design.template;

/**
 * 家政人员
 * @author linjiabin on  16/5/9
 */
public abstract class HouseWorker {
    // 家政服务
    protected final void housekeeping() {
        cleanRoom();
        cooking();
        if (needFeedDog()) {
            feedDog();
        }
    }
    // 清理房间
    public abstract void cleanRoom();
    // 煮饭
    public abstract void cooking();
    // 喂狗
    public abstract void feedDog();
    // hook,钩子
    public boolean needFeedDog() {
        return true;
    }
}
