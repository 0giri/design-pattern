package com.giri.dp.ch3_decorator.beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class HouseBlend extends Beverage{

   public HouseBlend() {
      super.description = "하우스 블랜드 커피";
   }

   @Override
   public int cost() {
      return 2500;
   }

}
