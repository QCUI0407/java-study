package exercise;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

/*
 * 投注号码由6个红色球号码和1个蓝色球号码组成，红色球号码从1-33中选择(不能重复）；蓝色球号码从1-16中选择。
 */

public class LuckyBall {
    public static void main(String[] args) {
        int[] luckyNumber = pickLuckyNumber();
        int[] userNumber = userInputNumber();
        CopyArrayElment.printArray(userNumber);

        compare(luckyNumber,userNumber);

    }

    // 1.随机一组中奖号码
    public static int[] pickLuckyNumber() {
        // 定义一个动态初始话的数组存储数字
        int[] numbers = new int[7];
        // 遍历数组生成每个位置的对应的号码（6 个红球）
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int number = r.nextInt(33) + 1;// 1-33 ===> {(0-32)+1}
                // 判断随机号码是否在前面出现过
                // 顶一个标记为，默认没有重复
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == number) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    // 数字没有重复，可以使用
                    numbers[i] = number;
                    break;
                }
            }

        }
        // 蓝色球，第七个球
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;

    }
    // 2.用户选择号码
    public static int[] userInputNumber(){
        //定义一个数组存储号码
        int[] numbers = new int [7];
        //用户输入6个红色球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Enter the number (1-33)for place NO."+ (i+1)+ " for red ball" );
            int red = sc.nextInt();
            //把当前数字存入数组
            numbers[i] = red;
        }

        //输入篮球号码
        System.out.println("Enter the number (1-16)for blue ball");
        numbers[6] =  sc.nextInt();
        return numbers;

    }
    // 3.对比号码,判断中奖结果
    public static void compare(int[] LuckyNumber, int[] userNumber){


        //1.定义两个变量。分别为红球和蓝球命中个数
        int redBall = 0;
        int blueBall = 0;

        //判断红球命中个数，开始统计
        for (int i = 0; i < userNumber.length - 1; i++) {
            for (int j = 0; j <LuckyNumber.length - 1; j++) {
                if(userNumber[i] == LuckyNumber[i]){
                    redBall ++;
                    break;
                }
            }
        }

        //蓝色球号码
        blueBall = LuckyNumber[6] == userNumber[6] ? 1: 0;

        CopyArrayElment.printArray(LuckyNumber);


        //判断中间情况
        if(blueBall == 1 && redBall < 3){
            System.out.println("6th");
        }else if(blueBall == 1 && redBall == 3 
        || blueBall == 0 && redBall == 4){
            System.out.println("5th");
        }else if(blueBall == 1 && redBall == 4 
        || blueBall == 0 && redBall == 5){
            System.out.println("4th");
        }else if(blueBall == 1 && redBall == 5){
            System.out.println("3rd");
        }else if(blueBall == 0 && redBall == 6){
            System.out.println("2nd");
        }else if(blueBall == 1 && redBall == 6){
            System.out.println("1st");
        }else{
            System.out.println("Thank you!!!!!!!!");
        }
    }
}
