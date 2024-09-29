package animals;

import origins.Animal;
import origins.Herbivores;
import origins.Land;

public class Horse extends Animal implements Herbivores, Land {

  public Horse(String name){
    super(name);
  }

  @Override
  public void walk() {
    System.out.println(name + " идет");
  }

  @Override
  public void eatGrass() {
    System.out.println(name + " ест траву");
  }
}

