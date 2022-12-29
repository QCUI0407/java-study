package method;

import java.util.Arrays;

//可变参数
public class Method_variableArguments {
    public static void main(String[] args) {
        sum();//1.不传参数
        sum(100);//2.可以传输一个参数
        sum(10, 20, 30);//3.可以传多个参数
        sum(new int[]{10,20,30,40,50,60,});//4.可以传一个数组
    }

    /**
     * 列表中只能有一个可变参数 
     * 可变参数必须放再形参（formal parameter）的最后面
     * @param nums
     */
    private static void sum(int...nums) {
        System.out.println("element nums" + nums.length);
        System.out.println("element content" + Arrays.toString(nums));
    }

}
