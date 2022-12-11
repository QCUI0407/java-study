package loop;
public class IfDemo{
    public static void main(String[] args) {
        //格式一：需求： 心跳（60-100）之间是正常，否则系统进一步检查
        int heartBeat = 80;
        if (heartBeat<60 || heartBeat > 100){
            System.out.println("Your heart beat is: "+ heartBeat + ". You may need some exem!");
        }
        System.out.println("Exam complete!");

        //格式二： 需求：发红包
        //double 表示钱包里有多少钱
        double money = 1;
        //send 1220
        if(money >= 1220){
            System.out.println("send!!!");
        }else{
            System.out.println("Not enough!");
        }

        //格式三 需求：绩效系统
        int score =99;
        if(score >= 0 && score<60){
            System.out.println("CCC");
        }else if(score>=60 && score<80){
            System.out.println("BBBB");
        }else if(score>=80 && score<100){
            System.out.println("AAAAA");
        }else{
            System.out.println("Score not acceptable");
        }
    }
}