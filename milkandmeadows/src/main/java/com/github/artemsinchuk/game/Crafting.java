package com.github.artemsinchuk.game;
/*
 * The Crafting class represents various crafting activities that a virtual cow can perform.
 */

public class Crafting {
  
  public static int makeButter(int milkAmount) {
    int butterAmount = milkAmount / 5;
    return butterAmount;
}

public static int makeCheese(int milkAmount) {
    int cheeseAmount = milkAmount / 10;
    return cheeseAmount;
}

public static int makeCottageCheese(int milkAmount) {
  int cottageCheeseAmount = milkAmount / 8;
  return cottageCheeseAmount;
}

public static int makeIceCream(int milkAmount, int eggsAmount, int sugarAmount) {
  int iceCreamAmount = Math.min(Math.min(milkAmount, eggsAmount), sugarAmount) / 3;
  return iceCreamAmount;
}
public class Craft {


  public String craftFertilizer(int dung) {
      if (dung >= 1) {
          return "The fertilizer has been successfully created from  " + dung + " units of cow dung!";
      } else {
          return "Not enough cow dung to create fertilizer!";
      }
  }
}
  public static String craftHay(int grass) {
      if (grass >= 5) {
          return "The hay has been successfully created from " + grass + " units of grass!";
      } else {
          return "Not enough grass to make hay!";
      }
  }

}
