package org.yarenkovasa;

import org.yarenkovasa.sorts.sorting.BasicSort;
import org.yarenkovasa.sorts.sorting.SortTypes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BasicSortTest {
  public static final List<Integer> array1 = List.of(7, 3, 11);
  public static final List<Integer> array2 = List.of(7, 3, 11, 56, 2, 78, 45, 0, 1, 52);

  @Test
  void testConstructorWithCorrectArgument() {
    BasicSort basicSort = new BasicSort(10) {
      @Override
      public SortTypes type() {
        return null;
      }

      @Override
      public void sort(ArrayList<Integer> userList) throws IllegalArgumentException {}
    };

    assertEquals(10, basicSort.getMaxLength());
  }

  @Test
  void testConstructorWithNegativeArgument() {
    assertThrows(IllegalArgumentException.class, () -> {
      new BasicSort(-1) {
        @Override
        public SortTypes type() {
          return null;
        }

        @Override
        public void sort(ArrayList<Integer> userList) throws IllegalArgumentException {}
      };
    });
  }
}
