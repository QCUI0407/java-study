package arr;

import java.util.Scanner;
import java.util.Random;
public class ArrayRandom {
    public static void main(String[] args) {
        //输入一组号码， 随机排列出这组号码
        //1.初始化一个数组
        int[] nums = new int[5];

        //2.定义一个循环，依次输入5个号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            //输入号码
            System.out.println("Please enter place "+(i+1)+" number.");
            int num = sc.nextInt();

            //存号码
            nums[i] = num;
        }

        //遍历元素，随机一个索引，让该元素与索引位置交换
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            //当前遍历的元素值nums[i];
            //随机一个元素值nums[index]
            int index = r.nextInt(nums.length);

            //定义一个临时变量，存储index位置的值
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
        //输出随机后的数字
        for (int j = 0; j < nums.length; j++) {            
            System.out.print(nums[j] + "\t");
        }
    }
}
