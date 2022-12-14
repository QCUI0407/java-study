package method;

public class MethodPrintArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        printArray(nums);
        System.out.println("-------------");
        int[] nums1 = {10, 20, 30, 40, 50};
        printArray(nums1);
        System.out.println("============== ");
        int[] nums2 = null; //or {}
        printArray(nums2);
    }

    public static void printArray(int[] arr){
        System.out.print("[");

        if(arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
