package string;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        //1. username and password
        String username = "username";
        String password = "123456";

        //2. enter  username and password
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsearname = sc.next();
        System.out.println("Enter your password");
        String inputPassword = sc.next();

        //3.true or false

        if(inputUsearname.equals(username) && inputPassword.equals(password)){
            System.out.println("Welcome！");
        }else{
            System.out.println("Try again!");
        }

        

    }
}
