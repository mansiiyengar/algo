package src.test.java.algo.sort;

import algo.sort.Merge;
import util.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: Artur Khalikov
 */
public class MergeTest {

    @Test
    public void testSort() throws Exception {
        int[] actual = {5, 4, 1, 8, 7, 2, 6, 3};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        Merge.sort(actual);assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2() throws Exception {
        int[] actual = {5, 4, 1, 8, 0, 7, 2, 6, 0};
        int[] expected = {0, 0, 1, 2, 4, 5, 6, 7, 8};
        Merge.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortEmpty() throws Exception {
        int[] actual = {};
        int[] expected = {};
        Merge.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortOneElement() throws Exception {
        int[] actual = {1};
        int[] expected = {1};
        Merge.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort3() throws Exception {
        int n = 1000 + 1;
        int[] expected = new int[n];
        ArrayUtils.fillFrom(expected, 0);

        int[] actual = Arrays.copyOf(expected, expected.length);
        ArrayUtils.shuffle(actual);
        Merge.sort(actual);

        assertArrayEquals(expected, actual);
    }
}