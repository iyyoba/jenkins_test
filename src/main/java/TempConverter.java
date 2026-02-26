public class TempConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Example usage
    public static void main(String[] args) {
        double c = 32.0;

        System.out.println("Celsius: " + c);
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        System.out.println("Kelvin: " + celsiusToKelvin(c));
    }
}