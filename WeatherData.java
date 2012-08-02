package ua.patterns;

public final class WeatherData {
  private float temperature;
  private float humidity;
  private float pressure;

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void measurementsChanged() {
    // write your code here
  }
}
