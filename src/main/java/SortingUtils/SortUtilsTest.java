package SortingUtils;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortUtilsTest {
	@Test
    public void testBubbleSort() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        SortUtils.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
    }

    @Test
    public void testQuickSort() {
        int[] arr = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        SortUtils.quickSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9}, arr);
    }
}


