package arr;

public class ArrayDynamIcinitialization {
    public static void main(String[] args) {
        double[] scores = new double[3];

        //赋值
        scores[0] = 85.5;
        System.out.println(scores[0]);

        String[] names = new String[4];
        names[0] = "Tom0";
        names[3] = "Tom3";
        System.out.println(names[0]);
        System.out.println(names[2]);//null
        System.out.println(names[3]);

    }
}
