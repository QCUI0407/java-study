package _collection.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 斗地主
 * 功能：
 * 1.做牌
 * 2.洗牌
 * 3.定义3个玩家
 * 4.发牌
 * 5.排序（拓展，了解，作业）
 * 6.看牌
 * 
 */
public class Game_exercise {
    /*
     * 1.定义一个静态集合存储54张牌
     */
    public static List<Card> allCards = new ArrayList<>();

    /*
     * 2.做牌： 定义静态代码块初始化牌数据
     */
    static {
        // 3.定义点数： 个数确定，类型确定， 使用数组
        String[] sizes = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        // 4.定义花色： 个数确定，类型确定， 使用数组
        String[] colors = { "\u0003", "\u0004", "\u0005", "\u0006" };
        // 5.组合点数和花色
        int index = 0; //记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6.封装成一个对象
                Card c = new Card(size, color, index);
                // 7.存入集合容器中
                allCards.add(c);
            }
        }
        //8.大小王存入集合容器中
        Card c1 = new Card("","S\u262F",++index);
        Card c2 =new Card("","B\u1213",++index);
        Collections.addAll(allCards, c1,c2);
        System.out.println("new cards: " + allCards);
    }

    public static void main(String[] args) {
        //9. 洗牌
        Collections.shuffle(allCards);
        System.out.println("After shuffle : " + allCards);

        //10.发牌（定义3个玩家，每个玩家的牌是以个集合容器
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        //11.开始发牌（从牌集合中发出51张给3个玩家， 剩余3张做底）

        for (int i = 0; i < allCards.size()-3; i++) {
            //先拿到当前牌对象
            Card c = allCards.get(i);
            if(i % 3 == 0){
                player1.add(c);
            }else if(i % 3 == 1){
                player2.add(c);
            }else if(i % 3 ==2){
                player3.add(c);
            }
        }
        //12.拿到最后3张底牌(把最后3张牌截取成子集合)
        List<Card> lastThreeCards = allCards.subList(allCards.size()-3, allCards.size());

        //13.给玩家的牌排序（从大到小）
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);

        //14.输出玩家的牌
        System.out.println("p1: " + player1);
        System.out.println("p2: "+ player2);
        System.out.println("p3: "+ player3);
        System.out.println("last 3 cards: " + lastThreeCards);

    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                // 知道牌的大小，带可以指定规则
                return o2.getIndex()-o1.getIndex();
            }
            
        });    
    }
}
