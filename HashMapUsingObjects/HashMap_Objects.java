package HashMapUsingObjects;

public class HashMap_Objects<K,V> {
    private Entry[] bucket;
    static final int size = 16;

    public HashMap_Objects() {
        bucket = new Entry[size];
    }

    public <K> int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public <K,V> void put(K key, V value) {

        // fetching index value of 'key' value
        int index = getBucketIndex(key);
        Entry entry = new Entry(key,value);

        // checking if any other key is present at that index value or not
        if(bucket[index]==null) {
            bucket[index] = entry;
        }
        else {
            // creating a pointer 'ptr' to traverse through nodes at a particular index value
            Entry ptr = bucket[index];

            while(ptr != null) {
                if(ptr.key.equals(key)) {
                    ptr.value = value;
                    return;
                }
                else if(ptr.next.equals(null)) {
                    ptr.next = entry;
                    return;
                }
                ptr = ptr.next;
            }
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        Entry ptr = bucket[index];

        while (ptr != null) {
            if (ptr.key.equals(key)) {
                return (V) ptr.value;
            }
            ptr = ptr.next;
        }

        throw new KeyNotFoundException("Key " + key + " not found in the hashmap.");
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        if(index<0 || index>=size)
            System.out.println("\nKey not present!!");
        else {
            Entry ptr = bucket[index];

            // creating a pointer to point to the previous object, wrt the element we want to delete, i.e., ptr
            Entry prev = null;

            // loop until we reach last node at a particular index

            while (ptr != null) {
                if (ptr.key.equals(key)) {
                    if (prev == null) {
                        // key is found at first position
                        prev = ptr;
                        bucket[index] = ptr.next;
                        prev.next = null;
                    } else {
                        // key is found at any other position
                        prev.next = ptr.next;
                        ptr.next = null;
                    }
                } else {
                    prev = ptr;
                    ptr = ptr.next;
                }
            }
            System.out.println("Key-Value pair removed.");
        }
    }

    public <K,V> void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            Entry ptr = bucket[i];
            if (ptr != null) {
                System.out.print("Bucket " + i + ": ");
                while (ptr != null) {
                    System.out.print("[" + ptr.key + ":" + ptr.value + "]");
                    ptr = ptr.next;
                }
                System.out.println();
            }
        }
    }
}
