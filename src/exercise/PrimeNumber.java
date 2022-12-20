package exercise;

/*
 * 质数（Prime number），又称素数，指在大于1的自然数中，除了1和该数自身外，无法被其他自然数整除的数（也可定义为只有1与该数本身两个正因数的数）。
 */

public class PrimeNumber {
    public static void main(String[] args) {
        // 1.定义一个101-200之间的全部数据
        for (int i = 101; i <= 200; i++) {

            // 信号为： ！标记 ！
            boolean flag = true; // 一开始认为当前数据是素数

            // 2.判断当前便利的这个数据是不是质数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            // 3. 根据判断结果选择是否输出这个数据， 是素数则输出
            if(flag){
                System.out.print(i +"\t");
            }
        }
    }

}
