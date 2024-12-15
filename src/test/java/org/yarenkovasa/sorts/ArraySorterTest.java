package org.yarenkovasa;

import org.yarenkovasa.sorts.ArraySorter;
import org.yarenkovasa.sorts.sorting.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.yarenkovasa.sorts.sorting.SortTypes;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySorterTest {
  public static final ArrayList<Integer> testArray = new ArrayList<>(List.of(9, 5, 6, 3, 2, 1, 0, 4, 8, 7));
  public static final ArrayList<Integer> sortedTestArray = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

  @Test
  void testSortWithoutExceptions() {
    ArraySorter arraySorter = new ArraySorter(List.of(new BubbleSort(10)));
    assertEquals(arraySorter.sort(testArray, SortTypes.bubble), sortedTestArray);
  }

  @Test
  void testSortThrowsIllegalArgumentException() {
    ArraySorter arraySorter = new ArraySorter(List.of(new BubbleSort(5)));
    assertThrows(IllegalArgumentException.class, () -> arraySorter.sort(testArray, SortTypes.bubble));
  }

  @Test
  void testSortThrowsRuntimeException() {
    ArraySorter arraySorter = new ArraySorter(List.of(new BubbleSort(10)));
    assertThrows(RuntimeException.class, () -> arraySorter.sort(testArray, SortTypes.merge));
  }
}
