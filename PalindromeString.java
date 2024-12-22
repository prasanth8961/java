import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.next();
        StringBuilder str = new StringBuilder(input);
        if(input.equals(str.reverse().toString())){
            System.out.println( input + "is Palindrome");
        }else{
            System.out.println(input + "is not Palindrome");
        }
        sc.close();
    }
}
