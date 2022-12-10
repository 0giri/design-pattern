package com.giri.dp.ch2_observer.pull;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 0giri
 * @since : 2022/12/10
 */
@Getter
public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
	this.observers = new ArrayList<>();
    }

    public void updateData(float temperature, float humidity, float pressure) {
	this.temperature = temperature;
	this.humidity = humidity;
	this.pressure = pressure;
	notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
	this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
	this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
	observers.parallelStream().forEach(Observer::update);
    }
}
