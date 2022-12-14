package method;

public class MethodDemo2 {
    public static void main(String[] args) {
        print();

        System.out.println("------------");

        print2();
    }

    //无参数无返回值的方法
    public static void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Method.");
        }
    }

    public static void print2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 2");
        }
    }
}
