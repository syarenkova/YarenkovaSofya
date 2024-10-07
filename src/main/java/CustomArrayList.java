/**
 * Realization of array with support for dynamic resizing
 *
 * @param <A> type of elements stored in the array
 */
public class CustomArrayList<A> implements Methodable<A>{

  private Object[] array;
  private final int MIN_CAPACITY = 5;
  private int capacity = MIN_CAPACITY;

  int currIndex = -1;
  int size;

  public CustomArrayList() {
    array = new Object[MIN_CAPACITY];
  }

  /**
   * increases the capacity of array in half by creating dublicate array. basically the realisation of dynamic array
   */
  public void increaseCapacity() {
    capacity *= 2;
    Object[] new_array = new Object[capacity];
    System.arraycopy(array,0, new_array, 0, array.length);
    array = new_array;
  }

  /***
   * updaiting the size of array
   * @return used size of array
   */
  public int size() {
    size = currIndex + 1;
    return size;
  }

  /**
   * method, that adds elements to the end of array. if the element cant be placed here, array increases its capacity
   *
   * @param element that should be add to the array
   */
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IllegalArgumentException("You can't add null elements!");
    } else if (currIndex + 1 == capacity) {
      increaseCapacity();
      currIndex++;
      array[currIndex] = element;
    } else {
      currIndex++;
      array[currIndex] = element;
    }
  }

  /**
   * method that deletes elements from array and moves next elements to the left
   *
   * @params index of element that should be deleted
   */
  @Override
  public void delete(int index) {
    Object[] new_array = new Object[capacity];
    System.arraycopy(array, 0, new_array, 0, index);
    System.arraycopy(array, index+1, new_array, index, array.length - 1 - index);
    array = new_array;
    currIndex--;
  }

  /**
   * method that returns element which is located on the position of given index
   *
   * @param index of element
   * @return element
   */
  @Override
  public A get(int index) {
    return (A) array[index];
  }
}
