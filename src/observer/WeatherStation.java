package observer;

public class WeatherStation {
    public static void main(String[] args) throws Exception{
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        Thread.sleep(1000);
        weatherData.setMeasurements(82, 70, 29.2f);
        Thread.sleep(1000);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
