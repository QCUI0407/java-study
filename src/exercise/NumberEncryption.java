package exercise;

//即使加密也是解密

import java.util.Scanner;

public class NumberEncryption {


    public static void main(String[] args) {

        //数据加密
        //1.定义一个数组存入需要加密的数据
        System.out.println("需要加密的数字个数****1");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int [length];

        //2.录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入需要加密的第"+i+"个数字*****2");
            int number = sc.nextInt();
            arr[i] = number;
        }
        //3.打印数组,从别的class中调取的function
        CopyArrayElment.printArray(arr);

        //4.核心逻辑， 加密数组数据

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5 )%10;
        }

        //5.核心逻辑， 对数组中加密的数据进行反转,   arr = [6, 4, 3, 8]
        //                                               i        j
        //i < j 为交换条件， 只有i小于j才交换, 一但相等停止循环
        for (int i = 0, j = arr.length-1; i < j; i++,j--) {
            //交换两者值
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        //打印加密后的数组
        CopyArrayElment.printArray(arr);

    }
}
