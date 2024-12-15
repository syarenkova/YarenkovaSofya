package org.yarenkovasa.sorts;

import org.yarenkovasa.sorts.sorting.BasicSort;
import org.yarenkovasa.sorts.sorting.SortTypes;
import org.yarenkovasa.sorts.sorting.Sorting;

import java.util.ArrayList;
import java.util.List;

public class ArraySorter {
  private final List<BasicSort> sortStrategies;

  public ArraySorter(List<BasicSort> sortStrategies) {
    this.sortStrategies = sortStrategies;
  }

  public List<Integer> sort(List<Integer> userList, SortTypes typeOfSort) {

    boolean isLarger = false;

    for (Sorting sortStrategy : sortStrategies) {
      if (sortStrategy.type() == typeOfSort) {
        ArrayList<Integer> sortedArray = new ArrayList<>(userList);

        try {
          sortStrategy.sort(sortedArray);
          return sortedArray;
        } catch (IllegalArgumentException e) { isLarger = true; }
      }
    }

    if (isLarger) {
      throw new IllegalArgumentException("Длина массива превышает допустимый максимум");
    } else {
      throw new RuntimeException("Нет такого типа сортировки");
    }
  }
}
