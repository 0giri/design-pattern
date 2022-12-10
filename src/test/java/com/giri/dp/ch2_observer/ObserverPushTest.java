package com.giri.dp.ch2_observer;

import com.giri.dp.ch2_observer.push.*;
import org.junit.jupiter.api.Test;

/**
 * @author : 0giri
 * @since : 2022/12/10
 */
public class ObserverPushTest {

   @Test
   void 옵저버테스트() {
      WeatherData weather = new WeatherData();
      CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weather);
      StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
      ForecastDisplay forecastDisplay = new ForecastDisplay(weather);
      HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weather);
      System.out.println("==================================================");
      weather.updateData(0.4f, 3.2f, 2.2f);
      System.out.println("==================================================");
      weather.updateData(9.4f, 6.2f, 2.2f);
      System.out.println("==================================================");
      weather.updateData(5.4f, 1.2f, 4.2f);
   }

}
