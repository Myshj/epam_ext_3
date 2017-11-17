package temperature_converters;

public class TemperatureConverter {
    public double convertFtoC(double degrees){
        return (degrees - 32.0) / 9.0 * 5.0;
    }

    public double convertCtoF(double degrees){
        return degrees / 5.0 * 9.0 + 32.0;
    }

    public double convertCtoK(double degrees){
        return degrees + 273.15;
    }

    public double convertKtoC(double degrees){
        return degrees - 273.15;
    }

    public double convertFtoK(double degrees){
        return (degrees + 459.7) / 9.0 * 5.0;
    }

    public double convertKtoF(double degrees){
        return degrees / 5.0 * 9.0 - 459.7;
    }
}
