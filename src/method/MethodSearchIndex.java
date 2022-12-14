package method;

public class MethodSearchIndex {
    public static void main(String[] args) {
        int[] nums = {12, 54, 47, 44, 65};
        int index = searchIndex(nums, 12);
        System.out.println("The index of data is: " + index);
    }

    public static int searchIndex(int[] arr, int data){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                return i;
            }
        }
        //After the loop can not find data
        return -1;
    }
}
