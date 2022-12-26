package abstract_exercise;

public class GoldCard extends Card{
    @Override
    public void pay(double money_1) {
        // TODO Auto-generated method stub
        System.out.println("Your total is : " + money_1);
        System.out.println("Your card blance is : " + getMoney());

        //discount
        double rs = money_1*0.8;
        System.out.println("Your final price after discount is: " + rs);

        //update account blance
        setMoney(getMoney() - rs);
    }
    
}
