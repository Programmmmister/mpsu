package Graphs;
import DoubleLinkedList.DoubleLinkedList;

public class Graph {
    DoubleLinkedList<DoubleLinkedList<Integer>> graph;
    int nodes;

    public Graph(int node_amount) {
        nodes = node_amount;
        graph = new DoubleLinkedList<DoubleLinkedList<Integer>>();
    }

    public void add(int initial, int desired) {
        graph.get(initial).getData().appendValue(initial);
        graph.get(desired).getData().appendValue(initial);
    }

    public DoubleLinkedList<Integer> get(int index) {
        return graph.get(index).getData();
    }

}
