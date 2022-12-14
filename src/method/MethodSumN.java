package method;

public class MethodSumN {
    public static void main(String[] args) {
        System.out.println("Sum 1-5: " + sum(5));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

}
