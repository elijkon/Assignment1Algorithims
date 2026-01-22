import java.util.Scanner;

public class Question4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input: ");
            long target = scanner.nextLong();

            if (target < 1) {
                System.out.println("Output: 0");
                return;
            }

            long prevPrev = 0;
            long prev = 1;
            int index = 1;

            if (target == 1) {
                System.out.println("Output: 1");
                return;
            }

            while (true) {
                long nextVal = ((prev * 3) / 2) + (2 * prevPrev);
                index++;

                if (nextVal == target) {
                    System.out.println("Output: " + index);
                    break;

                } else if (nextVal > target) {
                    System.out.println("Output: " + (index - 1));
                    break;
                }

                prevPrev = prev;
                prev = nextVal;
            }
        }
    }
