package arr;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = { 5, 8, 6, 2, 1 };

        // 2.定义一个循环，控制比较的轮数
        for (int i = 0; i < arr.length - 1 /* i <= arr.length */; i++) {

            // 3.定义一个循环，控制每轮比较，占位
            for (int j = 0; j < arr.length -i - 1; j++) {
                // 判断j当前位置的元素值 是否 大于后一个值 若大 则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //遍历出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
