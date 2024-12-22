import java.util.Arrays;
public class ReverseWord {
    public static void main(String[] args) {
        char[] word = new char[]{'o' , 'l' , 'l' , 'e' , 'h'};
        int left = 0 , right = word.length - 1;
        while(left < right){
            char temp = word[right];
            word[right--] = word[left];
            word[left++] = temp;
        }
        System.out.print(Arrays.toString(word));
    }
}
