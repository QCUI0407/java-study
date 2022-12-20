package exercise;

import java.util.Random;

/*
 * 实现随机产生验证码， 每一位可能是数字，大写字母，小写字母。
 */
public class verificationCode {
    public static void main(String[] args) {
        String code = createCode(5);

        System.out.println("verification Code is :" + code);
    }

    // 定义一个方法返回一个随机验证码：
    public static String createCode(int n) {
        // 3. 定义一个字符变量记录产生的随机数
        String code = "";
        Random r = new Random();
        // 2. for 一个循环，循环n次， 依次长生随机字符
        for (int i = 0; i < n; i++) {
            // 3.生成一个随机字符，大写，小写，数字（0，1，2）
            int type = r.nextInt(3);// 0 1 2
            switch (type) {
                case 0:
                    // 大写字符（A65 - Z 65+25） （0 - 25） + 65
                    char c = (char) (r.nextInt(26) + 65);// 强该成字符
                    code += c;
                    break;
                case 1:
                    // 小写字符（a 97 - z 97+25） （0 - 25） + 97
                    char c1 = (char) (r.nextInt(26) + 97);
                    code += c1;
                    break;
                case 2:
                    code += r.nextInt(10);// 0-9
                    break;
            }
        }
        return code;
    }

}
