package com.giri.dp.ch2_observer.pull;

/**
 * @author : 0giri
 * @since : 2022/12/10
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    @Override
    public void update() {
	this.temperature = weatherData.getTemperature();
	this.humidity = weatherData.getHumidity();
	display();
    }

    @Override
    public void display() {
	System.out.printf("현재 상태: 온도 %fF, 습도 %f%%\n", temperature, humidity);
    }

}
