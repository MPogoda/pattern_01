package ua.patterns;

public class WeatherStation {
  public static void main(String[] argv) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(25, 65, 30.4f);
    weatherData.setMeasurements(30, 76, 34.3f);
    weatherData.setMeasurements(41, 80, 35.1f);
  }
}
