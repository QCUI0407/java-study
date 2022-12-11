package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 1.随机一个号码
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        // 2.使用一个死循环让用户不断去猜，并给出提示
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 输入猜测的数字
            System.out.println("Please enter a Number.(1-100)");
            int inputNumber = sc.nextInt();

            // 3.判断号码
            if (inputNumber > luckNumber) {
                System.out.println("Guess number is biger than lucky number.");
            } else if (inputNumber < luckNumber) {
                System.out.println("Guess number smaller than lucky number.");
            } else {
                System.out.println("You got it!!!!");
                break;//结束游戏，跳出循环
            }
        }
    }
}
