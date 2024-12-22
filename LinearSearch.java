import java.util.*;

class LinearSearch{
   static int linearSearch(int[] nums  , int key){
      if(nums.length == 0) return -1;
      for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] == key){
            return i;
        }
      }return -1;
   }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the limit : ");
     int limit = sc.nextInt();
     System.out.println("Enter the elements :");
     int[] numsArray = new int[limit];
     for ( int  i = 0 ; i < limit ; i++){
       numsArray[i] = sc.nextInt();
     }
    System.out.print("Enter a searching element : ");
    int key = sc.nextInt();
    int result = linearSearch(numsArray , key);
    System.out.print(key + " is present at index " + result);
    sc.close();
  }
}