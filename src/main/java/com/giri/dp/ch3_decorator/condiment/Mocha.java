package com.giri.dp.ch3_decorator.condiment;

import com.giri.dp.ch3_decorator.beverage.Beverage;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
	this.beverage = beverage;
    }

    @Override
    public int cost() {
	int cost = this.beverage.cost();
	Size size = beverage.getSize();
	if (size.equals(Size.TALL)) {
	    cost += 500;
	} else if (size.equals(Size.GRANDE)) {
	    cost += 1000;
	} else if (size.equals(Size.VENTI)) {
	    cost += 1500;
	}
	return cost;
    }

    @Override
    public String getDescription() {
	return this.beverage.getDescription() + ", 모카";
    }

}
