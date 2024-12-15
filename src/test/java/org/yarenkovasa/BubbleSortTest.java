package org.yarenkovasa;

import org.yarenkovasa.sorts.sorting.BubbleSort;
import org.yarenkovasa.sorts.sorting.SortTypes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
  public static final ArrayList<Integer> testArray = new ArrayList<>(List.of(9, 5, 6, 3, 2, 1, 0, 4, 8, 7));
  public static final List<Integer> sortedTestArray = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

  @Test
  void testType() {
    BubbleSort bubbleSort = new BubbleSort(10);
    assertEquals(bubbleSort.type(), SortTypes.bubble);
  }

  @Test
  void testSort() {
    BubbleSort bubbleSort = new BubbleSort(10);
    bubbleSort.sort(testArray);
    assertEquals(testArray, sortedTestArray);
  }

  @Test
  void testThrowExceptionAtSizeCheck() {
    BubbleSort bubbleSort = new BubbleSort(1);
    assertThrows(IllegalArgumentException.class, () -> bubbleSort.sort(testArray));
  }
}
