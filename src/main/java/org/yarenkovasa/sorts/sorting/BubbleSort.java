package org.yarenkovasa.sorts.sorting;

import java.util.ArrayList;

public class BubbleSort extends BasicSort implements Sorting {

  public BubbleSort(int maxLength) {
    super(maxLength);
  }

  @Override
  public SortTypes type() {
    return SortTypes.bubble;
  }

  @Override
  public void sort(ArrayList<Integer> userList) throws IllegalArgumentException {
    if (userList.size() > maxLength) {
      throw new IllegalArgumentException("Длина массива превышает допустимый максимум");
    }

    for (int i = 0; i < userList.size(); i++) {
      for (int j = i + 1; j < userList.size(); j++) {
        if (userList.get(i) > userList.get(j)) {
          int temp = userList.get(i);
          userList.set(i, userList.get(j));
          userList.set(j, temp);
        }
      }
    }
  }
}
