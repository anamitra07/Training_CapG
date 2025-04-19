package April_11th_HashMap;

public class Entry<I extends Number, S> {
    int key;
    int value;
    Entry<Number, S> next;

    Entry(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
