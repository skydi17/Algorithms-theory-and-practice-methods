import java.util.Scanner;

public class DistanceEdit {

    static int findDistance(char[] s1, char[] s2) {
        int[][] d = new int[s1.length + 1][s2.length + 1];
        for (int i = 0; i <= s1.length; i++) {
            d[i][0] = i;
        }
        for (int j = 0; j <= s2.length; j++) {
            d[0][j] = j;
        }
        for (int i = 1; i <= s1.length; i++) {
            for (int j = 1; j <= s2.length; j++) {
                int c = (s1[i - 1] == s2[j - 1]) ? 0 : 1;
                d[i][j] = Math.min(Math.min(d[i - 1][j] + 1, d[i][j-1] + 1), d[i-1][j-1] + c);
            }
        }
        return d[s1.length][s2.length];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(findDistance(s1.toCharArray(), s2.toCharArray()));
    }
}
