import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (symbols.containsKey(s)) {
                symbols.put(s, symbols.get(s) + 1);
            } else {
                symbols.put(s, 1);
            }
        }

        Map<Character, Node> charNodes = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue();
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            LeafNode node = new LeafNode(entry.getKey(), entry.getValue());
            charNodes.put(entry.getKey(), node);
            queue.add(node);
        }
        int size = 0;
        while (queue.size() > 1) {
            Node node1 = queue.poll();
            Node node2 = queue.poll();
            InternalNode internalNode = new InternalNode(node1, node2);
            size = size + internalNode.sum;
            queue.add(internalNode);
        }
        if (symbols.size() == 1) {
            size = str.length();
        }
        System.out.println(symbols.size() + " " + size);
        Node root = queue.poll();
        if (symbols.size() == 1) {
            root.buildCode("0");
        } else {
            root.buildCode("");
        }
        StringBuilder encodedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            encodedString.append(charNodes.get(str.charAt(i)).code);
        }
        System.out.println(encodedString.toString());
    }
}