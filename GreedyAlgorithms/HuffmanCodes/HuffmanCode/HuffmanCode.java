import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        PriorityQueue queue = new PriorityQueue(str.length());
        for (int i = 1; i <= str.length(); i++) {
            HuffmanNode node = new HuffmanNode();
            node.setI(i);
            node.setF(arr[i]);
            queue.add(node);
        }
        for (int k = str.length() + 1; k < 2*str.length() - 1; k++) {
            //HuffmanNode node = queue.
        }
    }
}
