package regex;

import java.util.Scanner;

public class Regex_exercise {
    public static void main(String[] args) {
        // 校验 手机号 邮箱
        checkPhone();
        checkEmail();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your phone number");
            String phone = sc.next();
            // 判断
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("DONE!");
                break;
            } else {
                System.out.println("Wrong phone number!");
            }
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your Email");
            String email = sc.next();
            // 判断
            if (email.matches("\\w{1,}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("DONE!");
                break;
            } else {
                System.out.println("Wrong Email!!!");
            }
        }
    }
}
