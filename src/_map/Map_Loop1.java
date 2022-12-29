package _map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Loop1 {
    public static void main(String[] args) {
        //添加元素，无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("aaa", 10);
        maps.put("bbb", 100);
        maps.put("ccc",1000);
        maps.put("ddd", 55);
        maps.put("eee", 40);
        System.out.println(maps);
        
        //1.找键值， 先拿到集合全部键值
        Set<String> keys = maps.keySet();
        //2.遍历每个键， 根据键提取值
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "====>" + value);
        }

    }
}
