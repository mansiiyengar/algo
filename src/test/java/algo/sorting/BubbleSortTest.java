package algo.sorting;

import org.junit.Test;
import com.ahalikov.toolkit.utils.ArrayUtils;

import static org.junit.Assert.*;

/**
 * @author ahalikov
 */
public class BubbleSortTest {

    @Test
    public void testSort1() throws Exception {
        int[] actual = {19, 11, 2, 7, 4, 1, 5, 3};
        int[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
        BubbleSort.sort1(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort1a() throws Exception {
        int[] actual = {1, 1, 0, 1, 0, -1};
        int[] expected = {-1, 0, 0, 1, 1, 1};
        BubbleSort.sort1(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort1CornerCases() throws Exception {
        // empty array
        int[] actual = {};
        int[] expected = {};
        BubbleSort.sort1(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() throws Exception {
        int[] actual = {19, 11, 2, 7, 4, 1, 5, 3};
        int[] expected = {1, 2, 3, 4, 5, 7, 11, 19};
        BubbleSort.sort2(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2a() throws Exception {
        int[] actual = {1, 1, 0, 1, 0, -1};
        int[] expected = {-1, 0, 0, 1, 1, 1};
        BubbleSort.sort2(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2CornerCases() throws Exception {
        // empty array
        int[] actual = {};
        int[] expected = {};
        BubbleSort.sort1(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort3() throws Exception {
        int[] actual = {2, 7, 4, 1, 5, 3};
        int[] expected = {1, 2, 3, 4, 5, 7};
        BubbleSort.sort(actual);
        ArrayUtils.print(actual);
        assertArrayEquals(expected, actual);
    }
}