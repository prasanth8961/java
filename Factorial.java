import java.util.Scanner;

public class Factorial {
    public static int factorial(int input){
        if(input == 0) return 1;
        return  input * factorial(input - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int input = sc.nextInt();
          System.out.println("Factorial of "+ input +" is "+ factorial(input));
        sc.close();
    }
}
