public class PriorityQueue {
    long[] data;
    int size;

    PriorityQueue (int size) {
        data = new long[size];
        /*for (int i = 0; i < size; i++) {
            data[i] = -1;
        } */
        this.size = 0;
    }

    private int parent(int current) {
        return current/2;
    }

    private int leftChild(int current) {
        return current*2;
    }

    private int rightChild(int current) {
        return current*2+1;
    }

    private void siftDown(int current) {
        while (current < size && (data[current] < data[leftChild(current)] ||
                data[current] < data[rightChild(current)])) {
            int maxChild = leftChild(current) > rightChild(current) ?
                    leftChild(current) : rightChild(current);
            long temp = data[current];
            data[current] = data[maxChild];
            data[maxChild] = temp;
            current = maxChild;
        }
    }

    private void siftUp(int current) {
        while (current != 0 && data[current] > data[parent(current)]) {
            long temp = data[current];
            data[current] = data[parent(current)];
            data[parent(current)] = temp;
            current = parent(current);
        }
    }

    public void insert(long value) {
        data[size] = value;
        siftUp(size);
        size++;
    }

    public long extractMax(){
        long max = data[0];
        data[0] = data[size];
        siftDown(size);
        size--;
        return max;
    }
}
