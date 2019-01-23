public class LeafNode extends Node {
    char symbol;

    public LeafNode(char symbol, int sum) {
        super(sum);
        this.symbol = symbol;
    }

    @Override
    void buildCode(String code) {
        super.buildCode(code);
        System.out.println(symbol + ": " + code);
    }
}
