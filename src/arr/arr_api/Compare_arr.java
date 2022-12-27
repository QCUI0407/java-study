package arr.arr_api;

import java.util.Arrays;
import java.util.Comparator;

public class Compare_arr {
    public static void main(String[] args) {
        StudentArr[] studens = new StudentArr[3];
        studens[0] = new StudentArr("AAA", 10, 175.5);
        studens[1] = new StudentArr("BBB", 20, 185.5);
        studens[2] = new StudentArr("CCC", 30, 165.5);

        System.out.println(Arrays.toString(studens));

       // Arrays.sort(studens); // 直接运行会报错，不知道用那个数据排序
       Arrays.sort(studens,new Comparator<StudentArr>() {

        @Override
        public int compare(StudentArr o1, StudentArr o2) {
            // 自己制定规则
            //return o1.getAge() - o2.getAge();//按照年龄升序排序
            //return o2.getAge() - o1.getAge();//按照年龄降序排序
            return Double.compare(o1.getHeight(), o2.getHeight());//浮点型升序
        }
       });

       System.out.println(Arrays.toString(studens));

    }
}
