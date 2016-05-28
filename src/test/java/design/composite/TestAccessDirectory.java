/**
 * Copyright (c) 2016 云智盛世
 * Created with TestAccessDirectory.
 */
package design.composite;

import org.junit.Test;
import top.gabin.design.composite.AccessDirectory;

import java.io.File;

/**
 * Class description
 *
 * @author linjiabin on  16/5/15
 */
public class TestAccessDirectory {
    @Test
    public void testPrintDirectory() {
        File file = new File("/data/mall/mysql");
        new AccessDirectory().printListFile(file);
    }
}
