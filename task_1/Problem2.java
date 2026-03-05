public class Problem2 {
  public static void main(String[] args) {
    int x = 121;

    // Negative numbers are never palindromes
    // Hint: reverse the number using % and /
    int reversed = 0;
    int original = x;

    // TODO: build reversed, then compare to original
    while (x > 0) {
      reversed *= 10;
      reversed += x % 10;
      x /= 10;
    }

    // Expected output: true
    System.out.println(reversed == original);
  }
}
