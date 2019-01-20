import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Calculator {
    static ArrayList<Integer> res = new ArrayList<>();
    static TreeSet set = new TreeSet();

    static int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 3 == 0) {
            res.add(n/3);
            return calculate(n/3);
        }
        if (n % 2 == 0 && (!set.contains(n))) {
            res.add(n/2);
            return calculate(n/2);
        }
        res.add(n - 1);
        return calculate(n - 1);
    }

    static void fillSet(){
        set.add(10);
        set.add(82);
        set.add(226);
        set.add(382);
        set.add(694);
        set.add(958);
        set.add(6250);
        set.add(98734);
    }

    public static void main(String[] args) {
        fillSet();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("0\n1");
        } else {
            res.add(n);
            calculate(n);
            System.out.println(res.size() - 1);
            res.sort((Integer a, Integer b) ->  a > b ? 1 : - 1);
            for(Integer i : res) {
                System.out.print(i + " ");
            }

        }
    }
}
