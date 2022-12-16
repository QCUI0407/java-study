package oop;

import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {
        // 1.在 items class 中定义商品类
        // 2.定义购物车对象，使用一个数字对象（以后学集合）
        Items[] shopCart = new Items[100];// [null,null,null.....]
        // 3.搭建操作架构
        while (true) {

            System.out.println("Please follow procedure.");
            System.out.println("Add item");
            System.out.println("Query");
            System.out.println("Updata");
            System.out.println("pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your command.");
            String command = sc.next();

            switch (command) {
                case "add":

                    addItems(shopCart, sc);
                    break;
                case "query":

                    queryItems(shopCart);
                    break;
                case "updata":

                    updataItems(shopCart, sc);
                    break;
                case "pay":

                    pay(shopCart);
                    break;
                default:
                    System.out.println("reenter the command");
            }
        }
    }

    public static void pay(Items[] shopCart) {
        // 1.定义一个求和变量累加金额
        double total = 0;
        // 2.遍历
        for (int i = 0; i < shopCart.length; i++) {
            Items item = shopCart[i];
            if (item != null) {
                total += (item.price * item.buynumber);
            } else {
                break;
            }
        }
        System.out.println("Total is $" + total);
    }

    public static void updataItems(Items[] shopCart, Scanner sc) {
        // 输入查询ID
        while (true) {
            System.out.println("Enter ID.");
            int id = sc.nextInt();
            Items item = getItemById(shopCart, id);
            if (item == null) {
                // nothing find
                System.out.println("Cannot find it.");
            } else {
                // find it and can be updata
                System.out.println("Please enter new QTY for item " + item.name);
                int buynumber = sc.nextInt();
                item.buynumber = buynumber;
                System.out.println("Done");
                queryItems(shopCart);
                break;
            }
        }
    }

    public static Items getItemById(Items[] shopCart, int id) {

        for (int i = 0; i < shopCart.length; i++) {
            Items item = shopCart[i];
            if (item != null) {

                if (item.id == id) {
                    return item;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static void queryItems(Items[] shopCart) {
        System.out.println("=============items=============");
        System.out.println("ID\t\tDescription\t\tPrice\t\tQTY\t\t");
        for (int i = 0; i < shopCart.length; i++) {
            Items item = shopCart[i];
            if (item != null) {
                System.out.println(item.id + "\t\t" + item.name + "\t\t\t" + item.price + "\t" + item.buynumber);
            } else {
                break;
            }
        }

    }

    public static void addItems(Items[] shopCart, Scanner sc) {

        // 1.录入商品信息
        System.out.println("Enter item id");
        int id = sc.nextInt();
        System.out.println("Enter item description");
        String name = sc.next();
        System.out.println("Enter quantity");
        int buynumber = sc.nextInt();
        System.out.println("Enter price");
        double price = sc.nextDouble();

        // 2.把信息封装成一个对象
        Items item = new Items();
        item.id = id;
        item.name = name;
        item.buynumber = buynumber;
        item.price = price;

        // 3.把商品加入到购物车中
        // shopcart = [a, b, null,.....]
        for (int i = 0; i < shopCart.length; i++) {
            if (shopCart[i] != null) {
                System.out.println("You can not use this id" + i);
            } else if (shopCart[i] == null) {
                // 说明此处没有存入元素
                shopCart[i] = item;
                break;
            }

        }
        System.out.println(item.name + " added to your cart.");
    }

}