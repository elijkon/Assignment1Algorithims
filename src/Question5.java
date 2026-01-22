import java.util.Arrays;

public class Question5 {
        public static int removeSmallNumbers(double[] nums, double val) {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= val) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }
        public static void main(String[] args) {
            double[] nums = {1.25, 15.0, 5.36, 7.158, 19.26, 8.35, 1.0};
            double val = 8.35;

            int k = removeSmallNumbers(nums, val);

            System.out.println("There are " + k + " numbers larger or equal to " + val);

            System.out.print("Valid nums: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
