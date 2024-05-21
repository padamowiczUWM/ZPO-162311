
public class WeatherForecast implements Observer, DisplayElement {
    private double currentPressure;
    private double lastPressure;
    private Subject weatherData;

    public WeatherForecast(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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
        if(currentPressure > lastPressure) {
            System.out.println("Pogoda się polepszyła.");
        }
        else if(currentPressure < lastPressure) {
            System.out.println("Pogoda się pogorszyła.");
        }
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
