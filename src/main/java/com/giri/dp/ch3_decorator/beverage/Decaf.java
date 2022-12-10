package com.giri.dp.ch3_decorator.beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class Decaf extends Beverage{

   public Decaf() {
      super.description = "디카페인 커피";
   }

   @Override
   public int cost() {
      return 2800;
   }

}
