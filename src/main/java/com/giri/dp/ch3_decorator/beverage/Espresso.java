package com.giri.dp.ch3_decorator.beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class Espresso extends Beverage {

   public Espresso() {
      super.description = "에스프레소";
   }

   @Override
   public int cost() {
      return 2000;
   }

}
