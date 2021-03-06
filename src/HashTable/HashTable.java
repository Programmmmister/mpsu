package HashTable;
import DoubleLinkedList.DoubleLinkedList;
import DoubleLinkedList.Node;
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

    // GET INFO

    public DoubleLinkedList<TableObject> get(int key) {
        int index = hash(key);
        return data.get(index);
    }

    public void remove(int key) {
        int index = hash(key);
        for (int i = 0; i < data.get(index).getSize(); i++) {
            int currentKey = data.get(index).get(i).getData().key;

            if (data.get(index).getSize() <= 1) {
                data.insert(index, new DoubleLinkedList<TableObject>());
                return;
            }

            if (currentKey == key) {
                data.get(index).popIndex(i);
                return;
            }
        }
    }


    // EDIT HASHTABLE

    public void input(String data) {
        TableObject item = new TableObject(data);
        int index = hash(item.key);
        this.data.get(index).insertToStart(new Node<TableObject>(item));
    }

    // ENCRYPT

    private int hash(int key) {
        return key % size;
    }
}
