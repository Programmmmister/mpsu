package OffsetHashTable;
import DynamicArray.DynamicArray;

public class OffsetHashTable {
    int TABLE_SIZE;
    DynamicArray<TableObject> table;

    public OffsetHashTable(int size) {
        TABLE_SIZE = size;
        table = new DynamicArray<TableObject>(size);
    }

    public void add(String data) {
        int key = data.hashCode() % TABLE_SIZE; // key is the index
        TableObject newObject = new TableObject(data);

        while (table.get(key) != null) {
            key++;

            if (key >= table.getSize()) {
                return;
            }
        }
        table.insert(key, newObject);
    }

    public int hash(int key) {
        return key % TABLE_SIZE;
    }
}

