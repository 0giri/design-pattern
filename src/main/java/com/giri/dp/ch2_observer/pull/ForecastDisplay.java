package com.giri.dp.ch2_observer.pull;

public class ForecastDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    @Override
    public void update() {
	lastPressure = currentPressure;
	currentPressure = weatherData.getPressure();
	display();
    }

    @Override
    public synchronized void display() {
	String prefix = "Forecast: ";
	if (currentPressure > lastPressure) {
	    System.out.printf("%sImproving weather on the way!\n", prefix);
	} else if (currentPressure == lastPressure) {
	    System.out.printf("%sMore of the same\n", prefix);
	} else if (currentPressure < lastPressure) {
	    System.out.printf("%sWatch out for cooler, rainy weather\n", prefix);
	}
    }

}
