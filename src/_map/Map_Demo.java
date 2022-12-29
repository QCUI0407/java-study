package _map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 认识map体系特点： 按照键无序，不重复，无索引。 值不做要求
 */
public class Map_Demo {
    public static void main(String[] args) {
        //1.创建一个Map集合
        Map<String, Integer> maps = new HashMap<>();//无序
        maps.put("book", 3);
        maps.put("car", 10);
        maps.put("food",5 );
        maps.put("car", 5);
        maps.put(null, null);
        System.out.println(maps);
        System.out.println("--------------");

        Map<String, Integer> maps1 = new LinkedHashMap<>();//有序
        maps1.put("car", 10);
        maps1.put("book", 3);
        maps1.put("food",5 );
        maps1.put("car", 5);
        maps1.put(null, null);
        System.out.println(maps1);

    }
}
