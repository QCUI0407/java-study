package _map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_exercise1 {
    public static void main(String[] args) {
        //1.使用一个hashmap存储数据
        Map<String,List<String>> data = new HashMap<>();

        //2.把学生选择的数据录入
        List<String> selects = new  ArrayList<>();
        Collections.addAll(selects, "A","B");
        data.put("preson1", selects);
        
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A","B","C");
        data.put("person2", selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "D","B","C");
        data.put("person3", selects2);

        System.out.println(data);
        //{person3=[D, B, C], person2=[A, B, C], preson1=[A, B]}

        //3.统计每个景点选择的人数.  String 选择的字符， Integer 几个人选择这个字符
        Map<String, Integer> infos = new HashMap<>();

        //4.提取所有人选择字符的信息
        Collection<List<String>> vars = data.values();
        System.out.println(vars);
        //[[D, B, C], [A, B, C], [A, B]]

        for (List<String> var : vars) {
            for (String s : var) {
                //没有包含这个字符
                if(infos.containsKey(s)){
                    infos.put(s, infos.get(s)+1);
                }else{
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);
      //{A=2, B=3, C=2, D=1}
    }
    
}
