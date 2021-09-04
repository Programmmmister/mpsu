package OffsetHashTable;

public class TableObject {
    public String data;
    public int key;

    public TableObject(String data) {
        this.data = data;
        int code = 0;
        for (int i = 0; i < data.length(); i++) {
            int ascii = data.charAt(i);
            code += ascii;
        }
        key = code;
    }

    public String getData() {
        return data;
    }
}
