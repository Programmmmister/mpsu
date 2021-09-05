package Graphs;
import DoubleLinkedList.DoubleLinkedList;

public class Graph {
    DoubleLinkedList<DoubleLinkedList<Integer>> graph;
    int nodes;
    int size = 0;

    public Graph(int node_amount) {
        nodes = node_amount;
        graph = new DoubleLinkedList<DoubleLinkedList<Integer>>();

        for (int i = 0; i < nodes; i++) {
            // initialization

            graph.appendValue(new DoubleLinkedList<Integer>());
        }
    }

    public void add(int initial, int desired) {
        graph.get(initial).getData().appendValue(desired);
        graph.get(desired).getData().appendValue(initial);
        size++;
    }

    public DoubleLinkedList<Integer> get(int index) {
        return graph.get(index).getData();
    }

    public void delete(int initial, int desired)
    {
        for (int i = 0; i < graph.get(desired).getData().getSize(); i++)
        {
            if (graph.get(desired).getData().get(i).getData().equals(initial))
            {
                graph.get(desired).getData().popIndex(i);
                break;
            }
        }
        for (int i = 0; i < graph.get(initial).getData().getSize(); i++)
        {
            if (graph.get(initial).getData().get(i).getData() == desired)
            {
                graph.get(initial).getData().popIndex(i);
                break;
            }
        }

        size--;
    }

    public int get_size() {
        return size;
    }

}
