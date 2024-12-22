import java.util.Scanner;

public class ToggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.next();
        StringBuilder result = new StringBuilder();
        for(char ch : input.toCharArray()){
           result.append((Character.isUpperCase(ch)) 
           ? Character.toLowerCase(ch)
           :  Character.toUpperCase(ch));
        }
        System.out.println("Given input is "+input+" Toggeled input is "+result.toString());
        sc.close();

    }
}
