package HashMapUsingObjects;

public class HashMap_Objects {
    private Entry[] bucket;
    static final int size = 16;

    public HashMap_Objects() {
        bucket = new Entry[size];
    }

    public int getBucketIndex(Integer key) {
        return Math.abs(Integer.hashCode(key)) % size;
    }

    public class KeyNotFoundException extends RuntimeException {
        public KeyNotFoundException(String message) {
            super(message);
        }
    }

    public void put(Integer key, Integer value) {

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
                if(ptr.next.equals(null)) {
                    ptr.next = entry;
                    return;
                }
                ptr = ptr.next;
            }
        }
    }

    public Integer get(Integer key) {
        int index = getBucketIndex(key);
        Entry ptr = bucket[index];

        while (ptr != null) {
            if (ptr.key.equals(key)) {
                return ptr.value;
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

}
