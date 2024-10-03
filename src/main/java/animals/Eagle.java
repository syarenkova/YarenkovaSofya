package animals;

import origins.Animal;
import origins.Flying;
import origins.Predators;

public class Eagle extends Animal implements Flying, Predators {

  public Eagle(String name) {
    super(name);
  }

  @Override
  public void eatMeat(String meatType) {
    System.out.println(name + " ест " + meatType);
  }

  @Override
  public void fly() {
    System.out.println(name + " летит");
  }
}
