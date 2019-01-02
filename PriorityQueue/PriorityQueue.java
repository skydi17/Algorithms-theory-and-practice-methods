public class PriorityQueue {
    long[] data;
    int size;

    PriorityQueue (int size) {
        data = new long[size];
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
        int maxIndex = current;
        int l = leftChild(current);
        if (l <= size && data[l] > data[maxIndex]) {
            maxIndex = l;
        }
        int r = rightChild(current);
        if (r <= size && data[r] > data[maxIndex]) {
            maxIndex = r;
        }
        if (current != maxIndex) {
            long temp = data[current];
            data[current] = data[maxIndex];
            data[maxIndex] = temp;
            siftDown(maxIndex);
        }
    }

    private void siftUp(int current) {
        while (current > 0 && data[current] > data[parent(current)]) {
            long temp = data[current];
            data[current] = data[parent(current)];
            data[parent(current)] = temp;
            current = parent(current);
        }
    }

    public void insert(long value) {
        size++;
        data[size] = value;
        siftUp(size);
    }

    public long extractMax(){
        long max = data[0];
        data[0] = data[size];
        size--;
        siftDown(0);
        return max;
    }
}
