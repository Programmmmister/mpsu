package BinarySearchTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTests {

    @Test
    public void insertion_GeneralTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "abcdefghijklmnop";
        String actual = tree.getSuccessor(tree.search("abcdefghijk")).getKey();
        assertEquals(expected, actual);

        expected = "abcdefghi";
        actual = tree.getSuccessor(tree.search("abcdefgh")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void min_GeneralTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "a";
        String actual = tree.getMin().getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void max_GeneralTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "abcdefghijklmnopqrst";
        String actual = tree.getMax().getKey();
        assertEquals(expected, actual);
    }


    @Test
    public void getSuccessor_GeteralTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "abcdefghijklmnop";
        String actual = tree.getSuccessor(tree.search("abcdefghijk")).getKey();
        assertEquals(expected, actual);

        expected = "abcdefghi";
        actual = tree.getSuccessor(tree.search("abcdefgh")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void getSuccessor_NotFound_ReturnNull() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        Object expected = null;
        Object actual = tree.getSuccessor(tree.search("abcdefghijklmnopqrst"));
        assertEquals(expected, actual);
    }

    @Test
    public void getPredecessor_GeneralTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "abcde";
        String actual = tree.getPredecessor(tree.search("abcdefgh")).getKey();
        assertEquals(expected, actual);

        expected = "abcdefghi";
        actual = tree.getPredecessor(tree.search("abcdefghijk")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void getPredecessor_NotFound_ReturnNull() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        Object expected = null;
        Object actual = tree.getPredecessor(tree.search("a"));
        assertEquals(expected, actual);
    }

    @Test
    public void insertionTest() {
        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        tree.delete(tree.search("abcdefghijklmnopqrst"));

        String expected = null;
        Object actual = tree.getSuccessor(tree.search("abcdefghijklmnopqr"));
        assertEquals(expected, actual);
    }

    @Test
    public void search_positive() {

        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        String expected = "abcd";
        String actual = tree.getSuccessor(tree.search("abc")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void search_notFound() {

        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        Object expected = null;
        Object actual = tree.search("trhr");
        assertEquals(expected, actual);
    }

    @Test
    public void delete() {

        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        tree.delete(tree.search("abcdefghijklmnopqr"));

        String expected = "abcdefghijklmnopqrst";
        String actual = tree.getSuccessor(tree.search("abcdefghijklmnopq")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void delete_NotFound() {

        BinarySearchTree tree = new BinarySearchTree("abcdefgh");
        tree.insert("abc");
        tree.insert("abcd");
        tree.insert("abcdefghijk");
        tree.insert("abcdefghi");
        tree.insert("ab");
        tree.insert("abcdefghijklmnopqrst");
        tree.insert("abcdefghijklmnopq");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("abcdefghijklmnop");
        tree.insert("abcdefghijklmnopqr");

        tree.delete(tree.search("hrth"));

        String expected = "ab";
        String actual = tree.getSuccessor(tree.search("a")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void isAVLtree_true() {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert("abcdefgh");
        tree.insert("abcdefghi");
        tree.insert("abcdef");
        tree.insert("abcdefg");
        tree.insert("abcd");
        tree.insert("abcde");
        tree.insert("abc");
        tree.insert("ab");
        tree.insert("a");

        boolean actual = true;
        Node first = tree.getMin();

        while (first != null) {

            int balance = first.getBalance();

            if (balance < - 1 || balance > 1) {
                actual = false;
            }

            first = tree.getSuccessor(first);
        }

        boolean expected = true;
        assertEquals(expected, actual);
    }
}
