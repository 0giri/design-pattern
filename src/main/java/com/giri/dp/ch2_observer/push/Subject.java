package com.giri.dp.ch2_observer.push;

/**
 * @author : 0giri
 * @since : 2022/12/10
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
