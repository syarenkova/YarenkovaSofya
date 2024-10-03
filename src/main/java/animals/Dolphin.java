package animals;

import origins.Animal;
import origins.Predators;
import origins.Waterfowl;

public class Dolphin extends Animal implements Predators, Waterfowl {

  public Dolphin(String name){
    super(name);
  }

  @Override
  public void swim() {
    System.out.println(name + " плывет");
  }

  @Override
  public void eatMeat(String meatType) {
    if (meatType.equals("Рыба")) {
      System.out.println(name + " ест " + meatType);
    } else {
      System.out.println(name + " не ест " + meatType);
    }
  }
}
