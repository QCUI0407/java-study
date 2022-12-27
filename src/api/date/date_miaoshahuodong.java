package api.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class date_miaoshahuodong {
    public static void main(String[] args) throws ParseException {
        //1.活动开始和结束时间
        String startTime = "2022-12-24 23:59:59";
        String endTime = "2022-12-25 00:10:00";

        //2. personA & personB
        String personA = "2022-12-25 00:05:10";
        String PersonB = "2022-12-25 00:11:00";

        //3.解析他们时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(personA);
        Date d4 = sdf.parse(PersonB);
        

        if(d3.after(d1) && d3.before(d2)){
            System.out.println("A made it!!!!");
        }else{
            System.out.println("A fail");
        }

        if(d4.after(d1) && d4.before(d2)){
            System.out.println("B made it!!!!");
        }else{
            System.out.println("B fail");
        }
    }
}
