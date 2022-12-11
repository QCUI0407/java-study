package loop;
public class ForEx {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100; i<=999; i++){
            double ge = i % 10;
            double shi = (i/10) % 10;
            double bai = (i/100) % 10;
            if(Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i){
                //去掉ln取消换行
                System.out.print(i +"\t");
                count++;
            }
        }
        //换行
        System.out.println();
        System.out.println("Number is : " + count);
    }
}
//不好使
// public class ForEx {
//     public static void main(String[] args) {
//         for(int i=100; i<=999; i++){
//             double ge = i % 10;
//             double shi = (i/10) % 10;
//             double bai = (i/100) % 10;
//             if(Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i){
//                 System.out.println(i);
//             }
//         }
//     }
// }

