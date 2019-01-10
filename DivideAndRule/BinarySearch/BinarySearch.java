import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int b) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int mid = (r + l) / 2;
            if (arr[mid] >= b) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (arr[r] == b) {
            return r + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            res.append(binarySearch(arr, scanner.nextInt()) + " ");
        }
        System.out.println(res.toString());
    }
}
