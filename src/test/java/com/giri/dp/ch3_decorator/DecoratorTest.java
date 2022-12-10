package com.giri.dp.ch3_decorator;

import com.giri.dp.ch3_decorator.beverage.Beverage;
import com.giri.dp.ch3_decorator.beverage.Espresso;
import com.giri.dp.ch3_decorator.condiment.Mocha;
import com.giri.dp.ch3_decorator.condiment.Whip;
import com.giri.dp.ch3_decorator.io.LowerCaseInputStream;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
public class DecoratorTest {

    @Test
    void 음료_테스트() {
	Beverage beverage = new Espresso();
	beverage = new Mocha(beverage);
	beverage = new Whip(beverage);
	System.out.println(beverage.getDescription());
	System.out.println(beverage.cost());
    }

    @Test
    void 사이즈_테스트() {
	Beverage beverage = new Espresso();
	beverage.setSize(Beverage.Size.VENTI);
	beverage = new Mocha(beverage);
	beverage = new Whip(beverage);
	System.out.println(beverage.getDescription());
	System.out.println(beverage.cost());
    }


    @Test
    void 인풋스트림_테스트() {
	int c;
	try {
	    InputStream in = new LowerCaseInputStream(
		    new BufferedInputStream(
			    new FileInputStream("/Users/giri/dev/werow/projects/dp/src/test/java/com/giri/dp/ch3_decorator/text.txt")));
	    while ((c = in.read()) >= 0) {
		System.out.print((char) c);
	    }
	    System.out.println();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
