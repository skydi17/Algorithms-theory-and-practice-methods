import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DifferentAddend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n == 1) {
            System.out.println("1\n1");
        } else if (n == 2) {
            System.out.println("1\n2");
        } else {
            int count = 0, i = 1;
            LinkedList list = new LinkedList();
            while (n > count) {
                count = count + i;
                list.addLast(i);
                i++;
            }
            if (n != count) {
                list.remove(count - (int) n - 1);
            }
            System.out.println(list.size());
            ListIterator iterator = list.listIterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
        }
    }
}
