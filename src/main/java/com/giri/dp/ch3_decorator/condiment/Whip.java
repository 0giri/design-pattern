package com.giri.dp.ch3_decorator.condiment;

import com.giri.dp.ch3_decorator.beverage.Beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
	this.beverage = beverage;
    }

    @Override
    public int cost() {
	return beverage.cost() + 800;
    }

    @Override
    public String getDescription() {
	return beverage.getDescription() + ", 휘핑";
    }
}
