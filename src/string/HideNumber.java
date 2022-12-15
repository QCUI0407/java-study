package string;

import java.util.Scanner;

public class HideNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("waht is your phone number?");
        String phoneNum = sc.next();

        //only show first 3 and last 2

        String begin = phoneNum.substring(0, 3);
        String last = phoneNum.substring(phoneNum.length() - 2);

        String hidePhoneNumber = begin + "*****" + last;
        System.out.println(hidePhoneNumber);
    }
}
