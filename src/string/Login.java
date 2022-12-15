package string;

import java.util.Scanner;

/*模拟用户登录 最多三次机会 */
public class Login {
    public static void main(String[] args) {
        // 定义正确的登录名称和密码
        String username = "zxc";
        String password = "123";

        // 循环三次让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            
            System.out.println("what is your username?");
            String inputUser = sc.next();

            // 比较
            if (username.equals(inputUser)) {
                System.out.println("what is your password?");
                String inputPw = sc.next();
                if (password.equals(inputPw)) {
                    System.out.println("Welcome!!!");
                    break;
                } else {
                    System.out.println("password is wrong " + (3 - i) + " Chance");
                }
            } else {
                System.out.println("username is wrong " + (3 - i) + " Chance");
            }
        }
    }
}
