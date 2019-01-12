import java.util.Scanner;

public class HighestSequentialSubsequence {

    static int LISBottomUp(int[] arr) {
        int[] d = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            d[i] = 1;
            for (int j = 1; j <= i - 1; j++) {
                if (((arr[i] % arr[j]) == 0) && (d[j] + 1 > d[i])) {
                    d[i] = d[j] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            ans = Math.max(ans, d[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(LISBottomUp(arr));
    }
}
