package Graphs;
import DoubleLinkedList.DoubleLinkedList;

public class Graph {
    DoubleLinkedList<DoubleLinkedList<Integer>> graph;
    int nodes;

    public Graph(int node_amount) {
        nodes = node_amount;
        graph = new DoubleLinkedList<DoubleLinkedList<Integer>>();
    }

}
