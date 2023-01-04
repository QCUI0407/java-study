package _recurstion;
/*
 * 每天吃一半多一个，10天后剩1个
 * 第一天   =   第二天
 * f(x) -f(x)/2 -1 = f(x+1)
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }
    private static int f(int i) {
        if (i == 10) {
            return 1;
        } else {
            return 2*f(i+1)+2;
        }
    }
}
