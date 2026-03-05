import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // TODO: loop from 1 to n
    // Check divisibility with %
    // Print Fizz, Buzz, FizzBuzz, or i
    for (int i = 1; i <= n; i++) {
      boolean is_divisible_3 = i % 3 == 0;
      boolean is_divisible_5 = i % 5 == 0;

      if (is_divisible_3 && is_divisible_5) {
        System.out.println("FizzBuzz");
      } else if (is_divisible_3) {
        System.out.println("Fizz");
      } else if (is_divisible_5) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }

    // Hint: check divisible by 15 first!
    sc.close();
  }
}
