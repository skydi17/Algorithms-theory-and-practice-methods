import java.util.Scanner;

public class CountingSort {
    public static void count(int[] arr) {
        int[] res = new int[11];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]] = res[arr[i]] + 1;
        }
        int k;
        for(int i = 0; i < res.length; i++) {
            k = 0;
            while (k < res[i]) {
                System.out.print(i + " ");
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        count(arr);
    }
}
