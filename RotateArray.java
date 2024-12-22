import java.util.Arrays;
public class RotateArray {
    private static void rotate(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int k = 3;
        k %= nums.length;
        System.out.println("before rotating array : " + Arrays.toString(nums));
        rotate(nums , 0 , nums.length - 1 );
        rotate(nums , 0 , k - 1  );
        rotate(nums , k , nums.length - 1 );
        System.out.print("After rotating array : " + Arrays.toString(nums));
        
    }

}
