package OffsetHashTable;
import DynamicArray.DynamicArray;

public class OffsetHashTable {
    int TABLE_SIZE;
    DynamicArray<TableObject> table;

    public OffsetHashTable(int size) {
        TABLE_SIZE = size;
        table = new DynamicArray<TableObject>(size);
    }

    public void input(String data) {
        int key = get_ascii(data) % TABLE_SIZE;
        TableObject newObject = new TableObject(data);

        while (table.get(key) != null) {
            key++;

            if (key >= table.getSize()) {
                return;
            }
        }
        table.insert(key, newObject);
    }

    public void remove(String data) {
        int index = get_ascii(data) % TABLE_SIZE;

        if (table.get(index).data.equals(data)) {
            table.remove(index);
        } else {
            for (int i = index; i < table.getSize() - 1; i++) {
                if (table.get(i).data.equals(data) && table.get(i) != null) {
                    table.remove(i);
                    return;
                }
            }
        }
    }

    public int hash(int key) {
        return key % TABLE_SIZE;
    }

    public int get_ascii(String data) {
        int code = 0;
        for (int i = 0; i < data.length(); i++) {
            int ascii = data.charAt(i);
            code += ascii;
        }
        return code;
    }
}

