package loop;
public class BreakAndContinue {
    public static void main(String[] args) {
        // 每天都去看星星，第三天之后阴天没办法去
        for (int i = 0; i < 5; i++) {
            System.out.println("Star!!!!!!!!!!");
            if (i == 2) {
                break;// 跳出当前循环
            }
        }

        // 第三天下雨，第四第五天天晴可以去
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Star:  " + i);
        }
    }

}
