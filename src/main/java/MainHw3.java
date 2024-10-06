public class MainHw3 {

  public static void testStrings() {
    CustomArrayList<String> array = new CustomArrayList<>();

    //adding 6 elements even though original min capacity = 5, so array increased
    array.add("string0");
    array.add("string1");
    array.add("string2");
    array.add("string3");
    array.add("string4");
    array.add("string5");

    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }

    System.out.println();

    array.delete(3);
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }
  }

  public static void testIntegers(){
    CustomArrayList<Integer> array = new CustomArrayList<>();

    //adding 6 elements even though original min capacity = 5, so array increased
    array.add(0);
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(5);

    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }

    System.out.println();

    array.delete(3);
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }
  }

  public static void main(String[] args) {
    testStrings();
    testIntegers();
  }
}
