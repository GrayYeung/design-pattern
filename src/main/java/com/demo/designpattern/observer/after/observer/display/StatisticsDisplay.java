package com.demo.designpattern.observer.after.observer.display;

import com.demo.designpattern.observer.after.observer.CustomObserver;
import com.demo.designpattern.observer.after.subject.WeatherData;

/**
 * @see CurrentConditionsDisplay
 */
public class StatisticsDisplay implements CustomObserver, DisplayElement {

    private final WeatherData weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        var newTemp = weatherData.getTemperature();
        tempSum += newTemp;
        numReadings++;

        if (newTemp > maxTemp) {
            maxTemp = newTemp;
        }

        if (newTemp < minTemp) {
            minTemp = newTemp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
