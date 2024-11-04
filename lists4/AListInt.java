public class AListInt {
    private int[] items;
    private int size;

    public Alist() {
        items = new int[100];
        size = 0;
    }

    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size - 1];
        // what about empty list?
    }

    public int get(int i) {
        return items[i];
    }

    public int removeLast() {
        items[size - 1] = 0; //not necessary! can remove this line
        int x = getLast(); //can also do as int x = items[size - 1]; but this way reads better
        size -= 1;
        return x;
    }

    public int size() {
        return size;
    }
}
