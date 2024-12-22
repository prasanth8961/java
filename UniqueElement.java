import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String input = sc.next();
    Set<Character> result = new HashSet<Character>();

    for(char ch :  input.toCharArray()){
        result.add(ch);
    }
    System.out.println(result.toString());
    sc.close();
  }  
}
