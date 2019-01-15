import java.util.Scanner;

public class Bagpack {

    static int findMaxWeight(int[] arr, int w) {
        int[][] d = new int[w + 1][arr.length + 1];

        for (int i = 0; i <= arr.length; i++) {
            d[0][i] = 0;
        }

        for (int i = 0; i <= w; i++) {
            d[i][0] = 0;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= w; j++) {
                d[j][i] = d[j][i - 1];
                if (arr[i - 1] <= j) {
                    d[j][i] = Math.max(d[j][i - 1], d[j-arr[i - 1]][i - 1]+arr[i-1]);
                }
            }
        }
        return d[w][arr.length];
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
