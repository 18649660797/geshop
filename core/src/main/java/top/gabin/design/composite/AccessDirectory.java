/**
 * Copyright (c) 2016 云智盛世
 * Created with AccessDirectory.
 */
package top.gabin.design.composite;

import java.io.File;

/**
 *
 * @author linjiabin on  16/5/15
 */
public class AccessDirectory {

    /**
     * 遍历打印文件
     * @param file
     */
    public void printListFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printListFile(f);
            }
        } else {
            System.out.println(file.getName());
        }
    }

}
