package arr;

public class ArrayMax {
    public static void main(String[] args) {
        //1.定义一个静态数据
        int[] num ={15, 6555, 545, 1000000,-5, 56};

        //2.定义一个变量用来储存最大值元素，建议使用第一个元素
        int max = num[0];

        //遍历找到最大值
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
