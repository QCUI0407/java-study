package _collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_interaor {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //1.得到当前集合的迭代器对象
        Iterator<String> i = list.iterator();

        //2.定义while循环
        while(i.hasNext()){
            String e = i.next();
            System.out.println(e);
        }
        
    }
}
