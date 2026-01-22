import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the seq: ");
        int numTerms = scanner.nextInt();
        long[] seq = new long[numTerms];

        if (numTerms > 0) {
            seq[0] = 0;
        }

        if (numTerms > 1) {
            seq[1] = 1;
        }

        for (int i = 2; i < numTerms; i++) {
            long prev = seq[i - 1];
            long prevPrev = seq[i - 2];

            long nextVal = ((prev * 3) / 2) + (2 * prevPrev);
            seq[i] = nextVal;
        }

        System.out.println("The first " + numTerms + " numbers in the NotFibonacci seq:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(seq[i]);
            if (i < numTerms - 1) {
                System.out.print(", ");
            }
        }
    }
}
