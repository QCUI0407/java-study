package loop;
public class Swith {
    public static void main(String[] args) {
        //需求：周计划表
        String weekday = "Thursday";
        switch(weekday){
            case"Monday":
            System.out.println("Work Work Work!");
            break;
            case"Tuesday":
            System.out.println("looking fir help!");
            break;
            case"Wednesday":
            System.out.println("play play play!");
            break;
            case"Thursday":
            System.out.println("Sushi Sushi Sushi!");
            break;
            case"Friday":
            System.out.println("Friday Friday Friday!");
            break;
            case"Saturday":
            System.out.println("go out go out !");
            break;
            case"Sunday":
            System.out.println("World cup final!");
            break;
            default:
            System.out.println("Data not acceptable");
        }

    }
}
