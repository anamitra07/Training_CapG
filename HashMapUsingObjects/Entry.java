package HashMapUsingObjects;

public class Entry {
    static Integer key;
    static Integer value;
    Entry next;

    Entry(Integer key, Integer value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
