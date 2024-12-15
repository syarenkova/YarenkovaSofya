package org.yarenkovasa.sorts.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort extends BasicSort implements Sorting {

  public MergeSort(int maxLength) {
    super(maxLength);
  }

  @Override
  public SortTypes type() {
    return SortTypes.merge;
  }

  @Override
  public void sort(ArrayList<Integer> userList) throws IllegalArgumentException {
    if (userList.size() > maxLength) {
      throw new IllegalArgumentException("Длина массива превышает допустимый максимум");
    }

    Collections.sort(userList);
  }
}
