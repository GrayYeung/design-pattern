package com.demo.designpattern.observer.after.subject;

import com.demo.designpattern.observer.after.observer.CustomObserver;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class WeatherData implements Subject {

    private final List<CustomObserver> observers = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Encapsulate the change of number of observer.
     */
    @Override
    public void registerObserver(CustomObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(CustomObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (CustomObserver observer : observers) {
            // push an update message to observers
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // Assume station will use this method to update state when sensor push new data
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
