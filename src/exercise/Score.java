package exercise;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        //1.定义一个动态数组
        int[] scores = new int[6];

        //2. 6个评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Please enter No." + (i + 1) + "'s score.");
            int score = sc.nextInt();
            //3. 把分数存入对应位置
            scores[i] = score;
        }
        //4.遍历数组中的每个数据，找出最大值 最小值 总分
        //int max = scores[0], min = scores[0], sum = 0;
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                //替换最大值
                max = scores[i];
            }
            if(scores[i] < min){
                //替换最小值
                min = scores[i];
            }

            //统计总分
            sum += scores[i];
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        //统计平均分,去掉最低分和最高分
        double res = (sum -max -min)/(scores.length - 2);
        System.out.println(res);
    }
}