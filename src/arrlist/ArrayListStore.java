package arrlist;

import java.util.ArrayList;

/*
 * 集合存储自定义元素并遍历
 * 需求： 定义电影（名称，分数，演员）
 */
public class ArrayListStore {
    public static void main(String[] args) {
        // 1.定义一个电影类： Movies
        // 2.定义一个ArrayList存储这些电影对象

        ArrayList<Movies> movies = new ArrayList<>();
        // 3.创建影片对象封装电影数据，把对象加入集合中

        Movies m1 = new Movies("11111", 7.5, "aaaaaa ");
        movies.add(m1);

        movies.add(new Movies("22222", 8.5, "bbbbbb "));

        movies.add(new Movies("33333", 9.5, "cccccc "));

        System.out.println(movies);//打出的是地址

        // 4.sout集合
        for (int i = 0; i < movies.size(); i++) {
            Movies movie = movies.get(i);
            System.out.println("name: " + movie.getName());
            System.out.println("score: " + movie.getScore());
            System.out.println("actor: " + movie.getActor());
        }

    }
}
