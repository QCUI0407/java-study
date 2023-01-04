package _recurstion;

public class RecursionDemo {
    public static void main(String[] args) {
        int res = f(5);
        System.out.println("5 f(i) = " + res);
    }

    private static int f(int i) {
        if (i == 1) {
            return 1;
        } else {
            return f(i - 1)*i;
        }
    }
}
 