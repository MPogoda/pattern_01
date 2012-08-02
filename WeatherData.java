package ua.patterns;

public final class WeatherData {
  private float temperature;
  private float humidity;
  private float pressure;
  private CurrentConditionsDisplay ccd;

  public WeatherData() {
    ccd = new CurrentConditionsDisplay;
  }

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
    ccd.update(
               getTemperature(),
               getHumidity(),
               getPressure()
              );
  }
}
