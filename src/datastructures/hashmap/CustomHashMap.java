package datastructures.hashmap;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        if ((double) size / table.length >= LOAD_FACTOR) {
            resize();
        }

        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public V remove(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    V value = entry.value;
                    table[index].remove(entry);
                    size--;
                    return value;
                }
            }
        }

        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        LinkedList<Entry<K, V>>[] oldTable = table;
        table = new LinkedList[oldTable.length * 2];
        size = 0;

        for (LinkedList<Entry<K, V>> bucket : oldTable) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value);
                }
            }
        }
    }

    public void display() {
        System.out.println("\n--- HashMap Contents ---");
        System.out.println("Size: " + size + ", Capacity: " + table.length);
        System.out.println("Load Factor: " + String.format("%.2f", (double) size / table.length));

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && !table[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : table[i]) {
                    System.out.print("[" + entry.key + "=" + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        int choice;
        do {
            System.out.println("\n--- Custom HashMap Implementation ---");
            System.out.println("1. Put (key, value)");
            System.out.println("2. Get value by key");
            System.out.println("3. Remove by key");
            System.out.println("4. Check if key exists");
            System.out.println("5. Display HashMap");
            System.out.println("6. Size");
            System.out.println("7. Is Empty");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (String): ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value (Integer): ");
                    int value = scanner.nextInt();
                    map.put(key, value);
                    System.out.println("Added [" + key + "=" + value + "]");
                    break;
                case 2:
                    System.out.print("Enter key to search: ");
                    String searchKey = scanner.nextLine();
                    Integer result = map.get(searchKey);
                    if (result != null) {
                        System.out.println("Value: " + result);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    String removeKey = scanner.nextLine();
                    Integer removed = map.remove(removeKey);
                    if (removed != null) {
                        System.out.println("Removed [" + removeKey + "=" + removed + "]");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter key to check: ");
                    String checkKey = scanner.nextLine();
                    boolean exists = map.containsKey(checkKey);
                    System.out.println("Key exists: " + exists);
                    break;
                case 5:
                    map.display();
                    break;
                case 6:
                    System.out.println("Size: " + map.size());
                    break;
                case 7:
                    System.out.println("Is empty: " + map.isEmpty());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
