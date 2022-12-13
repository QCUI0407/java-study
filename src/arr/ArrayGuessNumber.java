package arr;

import java.util.Random;
import java.util.Scanner;

public class ArrayGuessNumber {
    public static void main(String[] args) {
        // 5个 1-20之间的随机数，猜数字，猜中提示猜中，还要输出该数据在数组中第一次出现的索引，猜错继续猜。

        // 1.定义一个动态数组
        int[] data = new int[5];

        // 2.生成5个随机数，加入到数组
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }

        // 3.使用一个死循环，去猜数字

        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("Enter a number between 1-20:");
            int guessData = sc.nextInt();

            // 4.遍历数组，判断是否相同
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessData) {
                    System.out.println("You got it. The number index is: " + i);
                    break OUT;
                }
            }
            System.out.println("The number you enter is not in the array.");
        }

        //5.输出全部数字
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");//输出一行，\t表示空格
        }
    }
}
