import java.util.NoSuchElementException;

public class HashTableLinear {
    private int[] keys;
    private String[] values;
    private int size;
    private int count = 0;

    public HashTableLinear(int size) {
        this.size = size;
        keys = new int[size];
        values = new String[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, String value) {
        int index = hash(key);

        while (keys[index] != 0) {
            if (keys[index] == key) {
                values[index] = value;
                return;
            }
            index = (index + 1) % size;
        }

        keys[index] = key;
        values[index] = value;
        count++;
    }

    public String get(int key) {
        int index = hash(key);

        while (keys[index] != 0) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % size;
        }

        throw new NoSuchElementException("Key not found");
    }

    public void remove(int key) {
        int index = hash(key);

        while (keys[index] != 0) {
            if (keys[index] == key) {
                keys[index] = 0;
                values[index] = null;
                count--;
                return;
            }
            index = (index + 1) % size;
        }

        throw new NoSuchElementException("Key not found");
    }

    public int size() {
        return count;
    }
}