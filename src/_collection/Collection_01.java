package _collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection_01 {
    public static void main(String[] args) {
        //Hashset: 添加的元素是无序，不重复，无索引
        Collection<String> list = new ArrayList<>();
        //1.添加元素，添加成功返回true
        list.add("java");
        list.add("html");
        list.add("html");
        list.add("MySQL");
        list.add("abc");
        System.out.println(list.add("java"));//添加成功返回true
        System.out.println(list);

        //2.清空集合
        // list.clear();
        // System.out.println(list);

        //3.判断集合是否为空 是空返回true，反之
        //System.out.println(list.isEmpty());

        //4.获取集合大小
        System.out.println(list.size());

        //5.判断是否包含某个元素
        System.out.println(list.contains("java"));
        System.out.println(list);

        //6.删除某个元素： 有多个默认元素删除第一个
        System.out.println(list.remove("java"));
        System.out.println(list);

        //7.把集合换成数组 
        Object[] arrs = list.toArray();
        System.out.println("Array: " + Arrays.toString(arrs));

        System.out.println("----------------拓展---------------");
        Collection<String> c = new ArrayList<>();
        c.add("c01");
        c.add("c02");
        Collection<String> c1 = new ArrayList<>();
        c1.add("c101");
        c1.add("c102");
        //addAll 把c2集合的元素全部倒入到c1中去
        c.addAll(c1);
        System.out.println(c);
        System.out.println(c1);
    }
}
