/**
 * Copyright (c) 2016 云智盛世
 * Created with Demo.
 */
package gabin.design.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class description
 *
 *
 *
 * @author linjiabin on  16/5/15
 */
public class IteratorDemo {

    @Test
    public void testDemo() {
        List<String> numberList = new ArrayList<String>();
        numberList.add("one");
        numberList.add("two");
        numberList.add("three");

        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }

        printListForUpdateCase(numberList, new DealString() {
            public String updateCase(String content) {
                if (content == null) {
                    return null;
                }
                return content.toUpperCase();
            }
        });
    }

    private void printListForUpdateCase(List<String> list, DealString dealString) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(dealString.updateCase(next));
        }
    }

    private interface DealString {
        String updateCase(String content);
    }

}
