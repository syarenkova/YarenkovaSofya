public class CustomArrayList<A> implements Methodable<A>{

  // setting min capacity, capacity and creating array of Objects
  private Object[] array;
  private final int MIN_CAPACITY = 5;
  private int capacity = MIN_CAPACITY;

  //setting size and current index values
  int currIndex = -1;
  int size = currIndex + 1;

  // constructor
  public CustomArrayList() {
    array = new Object[MIN_CAPACITY];
  }

  //method that increases the capacity. basically the realisation of dynamic array
  public void increaseCapacity() {
    capacity *= 2;
    Object[] new_array = new Object[capacity];
    System.arraycopy(array,0, new_array, 0, array.length);
    array = new_array;
  }

  //checking size
  public int size() {
    size = currIndex + 1;
    return size;
  }

  //adding elements to array. if the element cant be placed here, array increases
  @Override
  public void add(A element) {
    if (element == null) {
      System.out.println("You can't add null elements!");
    } else if (currIndex + 1 == capacity) {
      increaseCapacity();
      currIndex++;
      array[currIndex] = element;
    } else {
      currIndex++;
      array[currIndex] = element;
    }
  }

  // deleting elements from array. basically creates copy that doesn't have that element
  @Override
  public void delete(int index) {
    Object[] new_array = new Object[capacity];
    System.arraycopy(array, 0, new_array, 0, index);
    System.arraycopy(array, index+1, new_array, index, array.length - 1 - index);
    array = new_array;
    currIndex--;
  }

  //getting element from the array
  @Override
  public A get(int index) {
    return (A) array[index];
  }
}
