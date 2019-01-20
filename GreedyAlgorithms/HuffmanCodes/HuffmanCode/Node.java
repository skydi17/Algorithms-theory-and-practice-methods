public class Node implements Comparable<Node> {
    final int sum;
    String code;

    public Node(int sum) {
        this.sum = sum;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(sum, node.sum);
    }

    void buildCode(String code) {
        this.code = code;
    }
}
