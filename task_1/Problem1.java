import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // TODO: find two indices that sum to target
    // Hint: use a nested for loop
    int i = -1, j = -1;
    for (i = 0; i < nums.length; i++) {
      for (j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          break;
        }
      }
    }

    // Expected output: 0 1
    System.out.println(i + " " + j);
  }
}
