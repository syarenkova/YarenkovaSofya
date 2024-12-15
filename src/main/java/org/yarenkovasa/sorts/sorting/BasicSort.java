package org.yarenkovasa.sorts.sorting;

public abstract class BasicSort implements Sorting {
  protected final int maxLength;

  public BasicSort(int maxLength) throws IllegalArgumentException {
    if (maxLength <= 0) {
      throw new IllegalArgumentException("maxLength должен быть положительный");
    }

    this.maxLength = maxLength;
  }

  public int getMaxLength() {
    return maxLength;
  }
}
