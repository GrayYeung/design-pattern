package com.demo.designpattern.observer.after.observer.display;

import com.demo.designpattern.observer.after.observer.CustomObserver;
import com.demo.designpattern.observer.after.subject.WeatherData;

/**
 * @see CurrentConditionsDisplay
 */
public class ForecastDisplay implements CustomObserver, DisplayElement {

    private final WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
