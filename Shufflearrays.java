import java.util.Random;

public class Shufflearrays {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5, 6, 7};
        Random random = new Random();

        // Shuffle the array
        for (int i = a.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // Print the shuffled array
        for (int x : a) {
            System.out.println(x);
        }
    }
}