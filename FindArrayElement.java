import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputArray = new ArrayList<Integer>();
        for(int i = 0 ; i < Math.round((Math.random() + 1) * 10) ; i++){
          int input = (int) Math.round((Math.random() + i) * 10);
            inputArray.add(input);   
        }
        System.out.println(inputArray.toString());
        Collections.sort(inputArray);
        System.out.println("Minimum size of the element is : " + inputArray.getFirst());
        System.out.println("Maximum size of the element is : " + inputArray.getLast());
        sc.close();
    }
}
