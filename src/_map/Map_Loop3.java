package _map;

import java.util.HashMap;
import java.util.Map;

public class Map_Loop3 {
    public static void main(String[] args) {
        // 添加元素，无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("aaa", 10);
        maps.put("bbb", 100);
        maps.put("ccc", 1000);
        maps.put("ddd", 55);
        maps.put("eee", 40);
        System.out.println(maps);

        maps.forEach((k, v) -> {
            System.out.println(k + "----->" + v);
        });
    }
}
