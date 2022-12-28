package _genericity._method;

public class Genertcity_method {
    public static void main(String[] args) {
        String[] names = {"aaa", "bbb", "ccc"};
        printArray(names);

        System.out.println("------------");
        Integer[] nums = {10, 20, 30};
        printArray(nums);
    }

    private static<T> void printArray(T[] arr) {

        if(arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "": ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }
    }
}