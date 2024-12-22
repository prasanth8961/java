import java.util.*;

public class RomanToInt {
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();
       static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
       }
    public static void main(String args[]){
        System.out.println(RomanToIntConverter("MCMIV"));
    }

   public static int RomanToIntConverter(String romanString){
    int result = 0;
    int preValue = 0;

    for(int i = romanString.length() - 1; i>=0; i--){
        char key = romanString.charAt(i);
        int value = romanToIntMap.get(key);
            if(value < preValue){
                result -= value;
            }else{
                result += value;
            }

            preValue = value;
    }
    return result;
   }
}