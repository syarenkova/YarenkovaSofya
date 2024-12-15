package org.yarenkovasa;

import org.yarenkovasa.sorts.sorting.MergeSort;
import org.yarenkovasa.sorts.sorting.SortTypes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
  public static final ArrayList<Integer> testArray = new ArrayList<>(List.of(9, 5, 6, 3, 2, 1, 0, 4, 8, 7));
  public static final List<Integer> sortedTestArray = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

  @Test
  void testType() {
    MergeSort mergeSort = new MergeSort(10);
    assertEquals(mergeSort.type(), SortTypes.merge);
  }

  @Test
  void testSort() {
    MergeSort mergeSort = new MergeSort(10);
    mergeSort.sort(testArray);
    assertEquals(testArray, sortedTestArray);
  }

  @Test
  void testThrowExceptionAtSizeCheck() {
    MergeSort bubbleSort = new MergeSort(1);
    assertThrows(IllegalArgumentException.class, () -> bubbleSort.sort(testArray));
  }
}
