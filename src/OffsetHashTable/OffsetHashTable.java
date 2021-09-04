package OffsetHashTable;
import DynamicArray.DynamicArray;

public class OffsetHashTable {
    int TABLE_SIZE;
    DynamicArray<TableObject> table;

    public OffsetHashTable(int size) {
        TABLE_SIZE = size;
        table = new DynamicArray<TableObject>(size);
    }
}
