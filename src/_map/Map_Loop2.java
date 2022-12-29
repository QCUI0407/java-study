package _map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Loop2 {
    public static void main(String[] args) {
        // 添加元素，无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("aaa", 10);
        maps.put("bbb", 100);
        maps.put("ccc", 1000);
        maps.put("ddd", 55);
        maps.put("eee", 40);
        System.out.println(maps);

        //1.把Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        //2.开始遍历
        for (Map.Entry<String,Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "====>" + value);
        }
    }
}
