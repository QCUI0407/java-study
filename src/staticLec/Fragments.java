package staticLec;
//代码块

import java.util.ArrayList;

public class Fragments {


    public static String name;
    public static ArrayList<String> cards = new ArrayList<>();


    /**
     * 静态代码块： 有static修饰，属于类，与类一起优先加载一次，自动触发执行。
     * 
     * 作用： 可以用于初始化静态资源
     */
    static{
        System.out.println("-----------------static fragment------------------");
        name = "abc";
        cards.add("3");
        cards.add("a");
    }
    public static void main(String[] args) {
        System.out.println("--------------main method-----------------------");
        System.out.println(name);
    
    }
}
