package algo.recursion;

/**
 * Recursive binary search
 *
 * Worst time - O(log n)
 * Worst space - O(log n)
 *
 * todo: compare execution time with iterative search
 *
 * @author ahalikov
 */
public class BinarySearch {

    /**
     * Search for key in array of objects
     * @param a array of objects
     * @param key searched object
     * @return >0 - position of the key in array
     *         <0 - if key is not found in array
     */
    public static int search(Object[] a, Object key) {
        return searchRecursively(a, 0, a.length-1, key);
    }

    private static int searchRecursively(Object[] a, int first, int last, Object key) {
        if (first <= last) {
            int mid = (first + last) >> 1;
            Comparable midVal = (Comparable) a[mid];
            int comp = midVal.compareTo(key);
            if (comp < 0)
                return searchRecursively(a, mid + 1, last, key);
            else if (comp > 0)
                return searchRecursively(a, first, mid - 1, key);
            else
                return mid;
        }
        return -first - 1;
    }
}
