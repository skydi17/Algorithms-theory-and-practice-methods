import java.util.Scanner;

public class NOD {

    public static int countNOD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return countNOD(a % b, b);
        }
        if (b >= a) {
            return countNOD(a, b % a);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(countNOD(a, b));
    }
}
