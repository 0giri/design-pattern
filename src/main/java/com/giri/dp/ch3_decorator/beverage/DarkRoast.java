package com.giri.dp.ch3_decorator.beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class DarkRoast extends Beverage{

   public DarkRoast() {
      super.description = "다크로스트 커피";
   }

   @Override
   public int cost() {
      return 2300;
   }

}
