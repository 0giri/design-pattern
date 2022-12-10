package com.giri.dp.ch2_observer.push;

/**
 * @author : 0giri
 * @since : 2022/12/10
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
