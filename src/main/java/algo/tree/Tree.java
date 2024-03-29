package algo.tree;

/**
 * Binary tree implementation
 */
public class Tree<E extends Comparable> {

    private Entry<E> root;

    private int size;

    public Tree() {
    }

    public Tree(E ...elements) {
        insert(elements);
    }

    public Entry<E> search(E element) {
        return recursiveSearch(root, element);
    }

    public void insert(E element) {
        recursiveInsert(root, element, root);
    }

    public void insert(E... elements) {
        for (E element: elements) {
            recursiveInsert(root, element, root);
        }
    }

    /**
     * Height of a tree
     * Time complexity: O(n)
     */
    public int height() {
        return findHeight(root);
    }

    private int findHeight(Entry<E> node) {
        if (node == null)
            return -1;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    private Entry<E> recursiveSearch(Entry<E> node, E element) {
        if (node == null)
            return null;
        int cmp = element.compareTo(node.element);
        if (cmp == 0)
            return node;
        else
            return (cmp < 0)
                    ? recursiveSearch(node.left, element)
                    : recursiveSearch(node.right, element);
    }
    
    private Entry<E> recursiveInsert(Entry<E> node, E element, Entry<E> parent) {
        if (node == null) {
            Entry<E> newEntry = new Entry();
            newEntry.element = element;
            newEntry.parent = parent;
            if (root == null) {
                root = newEntry;
            }
            size++;
            return newEntry;
        } else {
            int cmp = ((Comparable) element).compareTo(node.element);
            if (cmp < 0)
                node.left = recursiveInsert(node.left, element, node);
            else
                node.right = recursiveInsert(node.right, element, node);
            return node;
        }
    }

    static final class Entry<E> {
        E element;
        Entry<E> parent;
        Entry<E> left;
        Entry<E> right;
    }

    public Entry<E> root() {
        return root;
    }

    public int getSize() {
        return size;
    }
}
