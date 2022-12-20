package exercise;

import java.util.Scanner;

/**
 * 按照要求计算机票加价格，旺季（5-10）头等9折，经济8.5折，淡季（11-4）头等7折，经济6.5折
 */

public class AirTiket {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reg Price");
        double price = sc.nextDouble();
        System.out.println("Month for the Tiket");
        int month = sc.nextInt();
        System.out.println("Seat class type");
        String SeatClass = sc.next();

        double rs = calc(price, month, SeatClass);

        System.out.println("after diccount is $"+ rs);

    }

    // 1.定义一个方法（原价，月份，仓位类型）返回值：double
    public static double calc(double price, int month, String SeatClass) {
        // 判断淡旺季
        if (month >= 5 && month <= 10) {
            switch (SeatClass) {
                case "economy":
                    price *= 0.85;
                    break;
                case "first":
                    price *= 0.9;
                    break;
                default:
                    System.out.println("Wrong Seat Class!");
                    price = -1;// cannot calculator!
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (SeatClass) {
                case "economy ":
                    price *= 0.65;
                    break;
                case "first":
                    price *= 0.7;
                    break;
                default:
                    System.out.println("Wrong Seat Class!");
                    price = -1;// cannot calculator!
            }
        } else {
            System.out.println("erro month!");
            price = -1;
        }

        return price;
    }
}
