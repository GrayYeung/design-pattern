package com.demo.designpattern.observer.before;

import com.demo.designpattern.observer.before.displays.CurrentConditionsDisplay;
import com.demo.designpattern.observer.before.displays.ForecastDisplay;
import com.demo.designpattern.observer.before.displays.StatisticsDisplay;
import lombok.Getter;

@Getter
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;


    // Assume this method called when sensor push new data
    public void measurementsChanged() {
        // Assume the new data already set
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();

        // Register displays
        // FIXME: coding to concrete implementation, so if add new display, it required to change code here.
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // To update each display
        // FIXME: if add more property, it required to change code here.
        currentDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

}
