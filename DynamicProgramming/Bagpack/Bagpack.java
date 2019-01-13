import java.util.Scanner;

public class Bagpack {

    static int findMaxWeight(int[] arr, int w) {
        int[][] d = new int[arr.length + 1][arr.length + 1];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {

            }
        }
        return d[arr.length][arr.length];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMaxWeight(arr, w));
    }
}
