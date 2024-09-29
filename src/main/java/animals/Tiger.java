package animals;

import origins.Animal;
import origins.Land;
import origins.Predators;

public class Tiger extends Animal implements Predators, Land {

  public Tiger(String name){
    super(name);
  }

  @Override
  public void walk() {
    System.out.println(name + " идет");
  }

  @Override
  public void eatMeat(String meatType) {
    if (meatType.equals("Говядина")) {
      System.out.println(name + " ест " + meatType);
    } else {
      System.out.println(name + " не ест " + meatType);
    }
  }
}
