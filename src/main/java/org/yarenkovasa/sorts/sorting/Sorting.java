package org.yarenkovasa.sorts.sorting;

import java.util.ArrayList;
import java.util.List;

public interface Sorting {
  /**
   * @return тип сортировки
   */
  SortTypes type();

  /**
   * Сортирует массив
   *
   * @param userList массив, который должен быть отсортирован
   * @throws IllegalArgumentException, если длина массива больше максимально заданного значения
   */
  void sort(ArrayList<Integer> userList) throws IllegalArgumentException;
}
