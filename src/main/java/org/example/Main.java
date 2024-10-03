package org.example;

import animals.*;

public class Main {

  public static void importTiger() {
    Horse horse = new Horse("Лошадь");
    horse.eatGrass();
    horse.walk();
  }

  public static void importCamel() {
    Camel camel = new Camel("Верблюд");
    camel.eatGrass();
    camel.walk();
  }

  public static void importDolphin() {
    Dolphin dolphin = new Dolphin("Дельфин");
    dolphin.eatMeat("Говядина");
    dolphin.eatMeat("Рыба");
    dolphin.swim();
  }

  public static void importEagle() {
    Eagle eagle = new Eagle("Орёл");
    eagle.fly();
    eagle.eatMeat("Говядина");
    eagle.eatMeat("Рыба");
  }

  public static void importHorse() {
    Horse horse = new Horse("Лошадь");
    horse.walk();
    horse.eatGrass();
  }

  public static void main(String[] args) {
    importHorse();
    importCamel();
    importDolphin();
    importTiger();
    importEagle();
  }
}