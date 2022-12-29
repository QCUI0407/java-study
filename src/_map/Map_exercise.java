package _map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * 统计投票人数
 */
public class Map_exercise {
    public static void main(String[] args) {
        // 1.把100个学生选择数据拿进来
        String[] selects = { "A", "B", "C", "D" };
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        //2.定义一个Map集合统计记录最终结果
        Map<Character, Integer> infos = new HashMap<>();

        //3.遍历100个学生数据
        for (int i = 0; i < sb.length(); i++) {
            //4.提取当前选择字符
            char ch = sb.charAt(i);
            //5.判断map中是否有这个值
            if(infos.containsKey(ch)){
                //让其+1
                infos.put(ch, infos.get(ch)+1);
            }else{
                //说明次景点第一次被选
                infos.put(ch, 1);
            }
        }
        //4.输出集合
        System.out.println(infos);

    }
}