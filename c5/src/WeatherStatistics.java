public class WeatherStatistics implements Observer, DisplayElement {
    private Subject weatherData;
    private double minTemperature;
    private double maxTemperature;
    private double sumTemperature;
    private double countTemperature;


    public WeatherStatistics(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        minTemperature = Double.MAX_VALUE;
        maxTemperature = Double.MIN_VALUE;
        sumTemperature = 0;
        countTemperature = 0;
    }

    public void unregister() {
        weatherData.removeObserver(this);
        weatherData = null;
    }

    public void register(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double avgTemperature = sumTemperature / countTemperature;
        System.out.println("Maksymalna temperatura: " + maxTemperature);
        System.out.println("Minimalna temperatura: " + minTemperature);
        System.out.println("Średnia temperatura: " + avgTemperature);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        sumTemperature += temperature;
        countTemperature++;

        if(temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if(temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }
}
