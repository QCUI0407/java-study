package random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            int data = r.nextInt(10);// 0-9 不包含10的随机数
            int data1 =r.nextInt(27)+65; //65-91 之间的随机数
            // System.out.println(data);
            System.out.println(data1);
        }
    }
}
