package loop;
import java.util.Scanner;

public class DeadLoop {
    public static void main(String[] args) {
        //1.定义正确密码
        int okPW = 000000;
        //2.定义一个死循环让用户不断输入密码确认
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please enter PW!");
            int password = sc.nextInt();
            //3.判断密码是否正确
            if(password == okPW){
                System.out.println("Welcome!!!!!!!!");
                break;
            }else{
                System.out.println("Wrong Password!!!!!");
            }
        }
    }
}
