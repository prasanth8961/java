import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String :");
    String input = sc.next();
    StringBuilder str = new StringBuilder(input);
    System.out.print(input + " is reversed as " + str.reverse());
    sc.close();
   } 
}
