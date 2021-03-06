package top.gabin.design.command;

/**
 * 命令接口
 * @author linjiabin on  16/5/2
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
