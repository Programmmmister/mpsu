package HashTable;
import DoubleLinkedList.DoubleLinkedList;
import DynamicArray.DynamicArray;

public class HashTable {
    int size = 5;
    DynamicArray<DoubleLinkedList<TableObject>> data;

    public HashTable() {
        data = new DynamicArray<DoubleLinkedList<TableObject>>(size);
        for (int i = 0; i < size; i++) {
            data.insert(i, new DoubleLinkedList<TableObject>());
        }
    }

    public HashTable(int size) {
        this.size = size;
        data = new DynamicArray<DoubleLinkedList<TableObject>>(this.size);

        for (int i = 0; i < this.size; i++) {
            data.insert(i, new DoubleLinkedList<TableObject>());
        }
    }
}
