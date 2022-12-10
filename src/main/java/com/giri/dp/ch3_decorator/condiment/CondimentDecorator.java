package com.giri.dp.ch3_decorator.condiment;

import com.giri.dp.ch3_decorator.beverage.Beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public abstract class CondimentDecorator extends Beverage {

   public Beverage beverage;
   @Override
   public abstract String getDescription();

   public Size getSize() {
      return beverage.getSize();
   }

}
