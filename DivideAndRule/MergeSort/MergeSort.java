import java.util.Scanner;

public class MergeSort {

    public static long numbOfInversions = 0;

    static long[] mergeSort(long[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            merge(mergeSort(arr, l, m), mergeSort(arr, m + 1, r));
        }
        return arr;
    }

    static long[] merge(long[] arr1, long[] arr2) {
        if (arr1[0] >= arr2[0]) {
            numbOfInversions = numbOfInversions + arr1.length;
        }
        long[] res = new long[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (arr1.length > i && arr2.length > j) {
            if (arr1[i] > arr2[j]) {
                res[k] = arr2[j];
                j++;
            } else {
                res[k] = arr1[i];
                i++;
            }
            k++;
        }
        if (arr1.length - 1 == i) {
            while (k < arr2.length) {
                res[k] = arr2[j];
                k++;
                j++;
            }
        } else {
            while (k < arr1.length) {
                res[k] = arr1[i];
                k++;
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
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(numbOfInversions);
    }
}
