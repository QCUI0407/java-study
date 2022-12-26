package abstract_exercise;

//抽象类的基本使用：写一个父类，被继承，重写抽象方法

public class TEST {
    public static void main(String[] args) {

        GoldCard user1Card = new GoldCard();
        user1Card.setMoney(1000);
        user1Card.setUserName("ABC");

        user1Card.pay(300);
        System.out.println("Blance: " + user1Card.getMoney());
    }
}
