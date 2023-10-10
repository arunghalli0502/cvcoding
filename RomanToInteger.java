import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm= new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = hm.get(s.charAt(i));
            if (curr > prev) {
                sum -= prev;
            } else {
                sum += prev;
            }
            prev = curr;
        }
        sum += prev;
        return sum;
    }

    public static void main(String[] args) {
        String Rnumber= "IX";
        int integerValue = romanToInt(Rnumber);
        System.out.println("The integer value of the Roman numeral " + Rnumber + " is " + integerValue);
    }
}
