public class Problem3 {
  public static void main(String[] args) {
    int[] nums = {4, 1, 2, 1, 2};

    // XOR all elements together
    // Pairs will cancel out (a^a=0)
    // Only the unique number remains
    int result = 0;

    // TODO: loop through nums and XOR into result
    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }

    // Expected output: 4
    System.out.println(result);
  }
}
