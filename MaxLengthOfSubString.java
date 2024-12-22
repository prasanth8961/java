import java.util.*;

public class MaxLengthOfSubString {

   private static int maxSumOfArray(int[] arr , int key){
    int maxSum = 0;
    int windowSum = 0;

    for(int i = 0 ; i < key; i++){
        windowSum += arr[i];
    }
    maxSum = windowSum;

    for(int j = key ; j < arr.length; j++){
        windowSum += arr[j] - arr[j - key];
        maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
   }
   private static int longestSubStringLength(String inpuString){
    int maxLenght = 0;
    int left = 0;
    final HashSet<Character> set = new HashSet<>();
    for(int right = 0; right < inpuString.length(); right++){
        while(set.contains(inpuString.charAt(right))){
            set.remove(inpuString.charAt(left));
            left++;
        }
        set.add(inpuString.charAt(right));
        maxLenght = Math.max(maxLenght, right - left + 1);
    }
    return maxLenght;
   }
    public static void main(String[] args) {
        System.out.println(longestSubStringLength("abcabcbb"));
        System.out.println(maxSumOfArray(new int[]{1,2,5,35,3,6,74,23} , 3));
    }
}
