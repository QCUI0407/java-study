package string;

import java.util.Random;
/*生成5位的验证码 */
public class VerificationCode {
    public static void main(String[] args) {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        //循环5次，每次生成一个随机的索引，提取对应的字符连接起来
        String code = "";
        Random r = new Random();
       for (int i = 0; i < 5; i++) {
            //随机一个索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;
        }
        //输出字符串
        System.out.println(code);
    }
}
