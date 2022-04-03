package com.demo.designpattern.observer.after.observer.display;

import com.demo.designpattern.observer.after.observer.CustomObserver;
import com.demo.designpattern.observer.after.subject.WeatherData;

public class CurrentConditionsDisplay implements CustomObserver, DisplayElement {

    /**
     * To register/remove, access data.
     */
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData observable) {
        this.weatherData = observable; // create reference to Subject
        observable.registerObserver(this);
    }

    /**
     * Encapsulate the change of number of property.
     */
    public void update() {
        // pull data from Data object
        this.temperature = weatherData.getTemperature();

        display();
    }

    // Another way: push data with update message
    public void update(Object[] datas) {
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
