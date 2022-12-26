package abstract_exercise;

//父类 parent class

public abstract class Card {
    private String userName;
    private double money;

/**
 * 定义一个支付方法： 表示卡片可以支付。
 */
public abstract void pay(double money_1);

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    
}
