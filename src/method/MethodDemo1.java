package method;

public class MethodDemo1 {
    public static void main(String[] args) {
        int rs = add(100, 200);
        System.out.println("sum is: " + rs);

        System.out.println("--------------");
        int rs1 = add(500, 500);
        System.out.println("rs1 sum is: " + rs1);
    }

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
}
