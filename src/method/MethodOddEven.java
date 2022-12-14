package method;

public class MethodOddEven {
    public static void main(String[] args) {
       check(11);
    }

    public static void check(int num){
        if(num % 2 == 0){
            System.out.println(num  + " is even number.");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
