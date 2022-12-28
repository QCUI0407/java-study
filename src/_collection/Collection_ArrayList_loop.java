package _collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_ArrayList_loop {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("list-1");
        lists.add("list-2");
        lists.add("list-3");

        /* for 循环 list特有 */
        for (int i = 0; i < lists.size(); i++) {
            String e = lists.get(i);
            System.out.println(e);
        }
        System.out.println("--------------------------------------");
        /* 迭代器 */
        Iterator<String> i = lists.iterator();
        while (i.hasNext()) {
            String e = i.next();
            System.out.println(e);
        }
        System.out.println("--------------------------------------");

        /* foreach */
        for (String e : lists) {
            System.out.println(e);
        }
        System.out.println("--------------------------------------");

        /* JDK1.8 后版本 Lambda */
        lists.forEach(e -> {
            System.out.println(e);
        });

    }
}
