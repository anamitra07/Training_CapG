package April_11th_HashMap;

public class HashMapClass {

    // creating an array bucket of type 'Entry'
    private Entry[] bucket;
    private static final int size = 16;

    // creating a constructor of HashMap class to initialize 'bucket'.
    public HashMapClass() {
        bucket = new Entry[size];
    }

    // returns the index value corresponding to a particular key
    public int getBucketIndex(int key) {
        return Math.abs(Integer.hashCode(key)) % size;
    }

    // creating a custom exception class to return exception if key is not present
    public class KeyNotFoundException extends RuntimeException {
        public KeyNotFoundException(String message) {
            super(message);
        }
    }

    public void put(int key, int value) {

        // fetching index value of 'key' value
        int index = getBucketIndex(key);
        Entry entry = new Entry(key,value);

        // checking if any other key is present at that index value or not
        if(bucket[index] == null) {
            bucket[index] = entry;
        }
        else {
            // creating a pointer 'ptr' to traverse through nodes at a particular index value
            Entry ptr = bucket[index];

            while(ptr != null) {
                if(ptr.key == key) {
                    ptr.value = value;
                    return;
                }
                if(ptr.next == null) {
                    ptr.next = entry;
                    return;
                }
                ptr = ptr.next;
            }
        }
    }

    // method to get the value corresponding to the key
    public int get(int key) {
        int index = getBucketIndex(key);
        Entry ptr = bucket[index];

        while (ptr != null) {
            if (ptr.key == key) {
                return ptr.value;
            }
            ptr = ptr.next;
        }

        throw new HashMapClass.KeyNotFoundException("Key " + key + " not found in the hashmap.");
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        Entry ptr = bucket[index];

        // creating a pointer to point to the previous object, wrt the element we want to delete, i.e., ptr
        Entry prev = null;

        // loop until we reach last node at a particular index
        while (ptr != null) {
            if (ptr.key == key) {
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
            }
            else {
                prev = ptr;
                ptr = ptr.next;
            }
        }
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            Entry ptr = bucket[i];
            if (ptr != null) {
                System.out.print("Bucket " + i + ": ");
                while (ptr != null) {
                    System.out.print("[" + ptr.key + ":" + ptr.value + "] ");
                    ptr = ptr.next;
                }
                System.out.println();
            }
        }
    }
}
