import java.util.Scanner;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue queue = new PriorityQueue(n);
        for (int i = 0; i < n; i++) {
            switch (scanner.next()) {
                case "Insert":
                    queue.insert(scanner.nextLong());
                    break;
                case "ExtractMax":
                    System.out.println(queue.extractMax());
                    break;
            }
        }
    }
}
