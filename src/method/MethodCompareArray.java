package method;

public class MethodCompareArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 10, 20, 40 };
        int[] arr3 = { 10, 20, 30 };
        System.out.println(compare(arr3, arr1));
        System.out.println(compare(arr2, arr1));

    }

    public static boolean compare(int[] arr, int[] arr1) {
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr[i] != arr1[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}