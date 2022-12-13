package arr;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //完整格式
        double[] arrNum =new double[]{12, 545, 545, 78754, 75.55};

        int[] arrAges = new int[]{12, 54, 87,45};

        String[] arrNames = new String[]{"Tom","Jerry", "Bob","Cui"};

        //简化格式
        double[] arrNum1 = {12, 545, 545, 78754, 75.55};
        double arrNum11[]  = {12, 545, 545, 78754, 75.55}; //另一种写法

        int[] arrAges1 = {12, 54, 87,45};

        String[] arrNames1 = {"Tom","Jerry", "Bob","Cui"};

        //数组地址
        System.out.println(arrNum);//[D@53bd815b

        //array 取值
        System.out.println(arrNames[3]);
        //array 赋值
        arrNames[3] = "QC";
        System.out.println(arrNames[3]);

        //数组长度
        System.out.println(arrNames1.length);

    }
}
