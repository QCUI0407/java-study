package method;

public class MethodMaxNum {
    public static void main(String[] args) {
        int [] nums = {1, 54, 256, 444, 55555};
        int max = getArrayMaxNum(nums);
        System.out.println(max);
        
    }

    public static int getArrayMaxNum(int[] arr){
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
