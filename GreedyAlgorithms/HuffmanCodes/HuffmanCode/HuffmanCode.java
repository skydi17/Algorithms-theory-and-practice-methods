import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        PriorityQueue<HuffmanNode> queue = new PriorityQueue(str.length());
        for (int i = 1; i <= str.length(); i++) {
            HuffmanNode node = new HuffmanNode();
            node.setI(i);
            node.setF(str.charAt(i));
            queue.add(node);
        }
        int size = 0;
        for (int k = str.length() + 1; k < 2*str.length() - 1; k++) {
            HuffmanNode i = queue.poll();
            HuffmanNode j = queue.poll();
            HuffmanNode nodeK = new HuffmanNode();
            nodeK.setI(k);
            size = i.getF() + j.getF();
            nodeK.setF(size);
            queue.add(nodeK);
        }
        System.out.println(queue.size() + " " + size);
        StringBuilder encodedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //encodedString.append(queue.)
        }
        System.out.println(encodedString.toString());
    }
}
