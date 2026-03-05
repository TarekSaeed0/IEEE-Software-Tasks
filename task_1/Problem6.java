import java.util.Scanner;

public class Problem6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    // TODO: fill arr from user input
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = arr[0], maxIdx = 0;
    int min = arr[0], minIdx = 0;

    // TODO: single loop — update max/min and indices
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIdx = i;
      }

      if (arr[i] < min) {
        min = arr[i];
        minIdx = i;
      }
    }

    System.out.println("Max: " + max + " at index " + maxIdx);
    System.out.println("Min: " + min + " at index " + minIdx);
  }
}
