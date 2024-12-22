import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int input){
       if(input <= 1) return false;
       if(input == 2) return true;
       if(input % 2 == 0) return false;
           for(int i = 3; i <= Math.sqrt(input); i+=2){
            if(input % i == 0) return false;
           }
       return true;
    }
    public static void main(String args[]){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isPrime(input)){
            System.out.print("Given number "+ input +" is Prime");
        }else{
            System.out.print("Given number "+ input +" not Prime");
        }
        sc.close();
    }
}
