import java.util.Scanner;

public class MergeSort {

    public static long inversions = 0;

    static long[] mergeSort(long[] arr) {
        if (arr.length == 1) return arr;
        int m = arr.length / 2;
        long[] left = new long[m];
        System.arraycopy(arr, 0, left, 0, m);
        long[] right = new long[arr.length - m];
        System.arraycopy(arr, m, right, 0, arr.length - m);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    static long[] merge(long[] arr1, long[] arr2) {
        long[] res = new long[arr1.length + arr2.length];
        int i = 0, j = 0;
        for (int k = 0; k < res.length; k++) {
            if (i == arr1.length || (j < arr2.length && arr1[i] > arr2[j])) {
                res[k] = arr2[j];
                j++;
                inversions = inversions + arr1.length - i;
            } else {
                res[k] = arr1[i];
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        mergeSort(arr);
        System.out.println(inversions);
    }
}
