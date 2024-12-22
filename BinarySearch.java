import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] nums , int key){
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while(start <= end){
            if(nums[mid] == key){
                return mid;
            }if(nums[mid] <= key){
              mid = mid + 1;
            }else if(nums[mid] >= key){
              mid = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int limit = sc.nextInt();
        int[] numsArray = new int[limit];
        System.out.print("Enter the elements :");
        for(int i = 0 ; i<limit ; i++){
           numsArray[i] = sc.nextInt();
        }
        System.out.print("Enter the key ");
        int key = sc.nextInt();
        int result = binarySearch(numsArray , key);
        System.out.println(key + " is present at index " + result);
        sc.close();
    }
}

