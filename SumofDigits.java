import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = sc.nextInt();
        int sum = 0;
        while (input != 0) {
             sum += (input % 10) ;
             input /= 10;
        }
        System.out.println("\n Sum of digit is : " + sum);
        sc.close();
    }
}
