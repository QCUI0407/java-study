package api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//有一个时间 2021年8月6日 11点11分11秒 往后 2天14小时49分06秒后的时间是多少
public class SimpleDateFormat_Demo {
    public static void main(String[] args) throws ParseException {
        //1. 把字符串时间拿到程序中来
        String dateStr = "2021-08-06 11:11:11";

        //2.把字符串时间解析完成日期对象（***重点***）：形式必须与被解析时间的形式完全一样，否则运行时解析报错！！！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(dateStr);

        //3.往后走2天 14小时 49分 06秒
        long time =d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        //4.格式化这个时间的毫秒值
        System.out.println(sdf.format(time));
    }
}
