import java.util.ArrayList;
import java.util.Random;
public class bai4 {
    
    public static String getElementAtIndex(int i) {
        ArrayList<String> chars = new ArrayList<>();
        for (int a = 0; a < 100; a++) {
            Random random = new Random();
            char randomChar = (char) (random.nextInt(26) + 'a');
            chars.add(String.valueOf(randomChar));
        }
        return chars.get(i);
    }
    public static void main(String[] args){
        String s = getElementAtIndex(99);
        System.out.printf(s);
    }
}