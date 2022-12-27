package regex;
//校验QQ号，必须全为数字 且 6-20位
public class Regex_1 {
    public static void main(String[] args) {
        //传统方法
        System.out.println(checkQQ("1545646654"));
        System.out.println(checkQQ("sds12"));
        System.out.println(checkQQ("123"));
        System.out.println(checkQQ(null));
        System.out.println("------------------------------------");
        //正则表达式
        System.out.println(checkQQqq("1545646654"));
        System.out.println(checkQQqq("sds12"));
        System.out.println(checkQQqq("123"));
        System.out.println(checkQQqq(null));

    }
    //正则表达式(\d 表示全为数字)
    public static boolean checkQQqq(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }

    //传统方法
    public static boolean checkQQ(String qq){
        //1.判断QQ号的长度是否满足
        if(qq ==null || qq.length()<6 || qq.length()>20){
            return false;
        }

        //2.判断qq中是否全为数字
        for (int i = 0; i < qq.length(); i++) {
            //获取每一位数字
            char ch = qq.charAt(i);
            //判断这个字符是否为数字，不是返回false
            if(ch<'0' || ch>'9'){
                return false;
            }
        }
        return true; //合法qq号
    }
}
