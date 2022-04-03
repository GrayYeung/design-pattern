package com.demo.designpattern.observer.after;

import com.demo.designpattern.observer.after.observer.display.CurrentConditionsDisplay;
import com.demo.designpattern.observer.after.observer.display.ForecastDisplay;
import com.demo.designpattern.observer.after.observer.display.StatisticsDisplay;
import com.demo.designpattern.observer.after.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay); // forecastDisplay should not receive update()
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
