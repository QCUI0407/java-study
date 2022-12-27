package api.date;

import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        // 1.创建一个Date类对象，代表系统此时此刻日期时间对象
        Date d = new Date();
        System.out.println(d);

        // 2。获取时间毫秒值 （从1970.1.1 到现在的毫秒值）
        long time = d.getTime();
        System.out.println(time);

        System.out.println("---------------------------------");

        /* 3.计算出当前时间往后走1小时121秒后的时间是多少 */

        // 得到当前时间毫秒值
        Date d1 = new Date();
        System.out.println(d1);

        // 当前时间往后走1小时121秒
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;

        //把毫秒值转换为对应日期 方法一
        Date d2 = new Date(time2);
        System.out.println(d2);

        //方法二
        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }

}
