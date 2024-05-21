public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        WeatherForecast weatherForecast = new WeatherForecast(weatherData);
        WeatherStatistics weatherStatistics = new WeatherStatistics(weatherData);
        weatherData.setMeasurements(11, 36, 1004);
        weatherData.setMeasurements(15, 36, 1003);
    }
}
