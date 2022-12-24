package staticLec;

import java.util.ArrayList;

//目标： 模拟游戏启动前，初始化54张牌的数据

public class StaticExecies {
    /*
     * 1.定义一个静态集合， 这样这个集合只加载一个。 因为当前房间只需要一副牌
     */

    public static ArrayList<String> cards = new ArrayList<>();

    /*
     * 2.在程序真正运行main方法前，把54张牌放进去， 后续游戏课直接使用
     */

     static{
        //3.正式做牌，放到集合中
        // a:定义一个数组存储全部点数， 类型确定，个数确定
        String[] size = {"2", "3","4","5","6","7","8","9","10","J","Q","K","A"};
        //b: 定义一个数组存储全部花色， 类型确定，个数确定
        String[] symbol = {"\u0006", "\u0003","\u0004","\u0005"};
        //c：遍历
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                String card = size[i] + symbol[j];
                cards.add(card);
            }
        }
        //e: 大小王
        cards.add("x🃏");
        cards.add("o🃏");
     }

    public static void main(String[] args) {
        System.out.println("new cards:" + cards);
    }
}
