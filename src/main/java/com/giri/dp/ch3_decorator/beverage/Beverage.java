package com.giri.dp.ch3_decorator.beverage;

import lombok.Getter;

/**
 * @author : 0giri
 * @since : 2022/12/11
 */
@Getter
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}
    Size size = Size.TALL;
    String description = "제목 없음";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract int cost();

}
