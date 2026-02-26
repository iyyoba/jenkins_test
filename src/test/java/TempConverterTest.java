import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    private static final double DELTA = 0.0001;

    // ---------- Celsius to Fahrenheit ----------

    @Test
    void testCelsiusToFahrenheit_FreezingPoint() {
        assertEquals(32.0, TempConverter.celsiusToFahrenheit(0.0), DELTA);
    }

    @Test
    void testCelsiusToFahrenheit_BoilingPoint() {
        assertEquals(212.0, TempConverter.celsiusToFahrenheit(100.0), DELTA);
    }

    @Test
    void testCelsiusToFahrenheit_Negative() {
        assertEquals(-40.0, TempConverter.celsiusToFahrenheit(-40.0), DELTA);
    }

    // ---------- Fahrenheit to Celsius ----------

    @Test
    void testFahrenheitToCelsius_FreezingPoint() {
        assertEquals(0.0, TempConverter.fahrenheitToCelsius(32.0), DELTA);
    }

    @Test
    void testFahrenheitToCelsius_BoilingPoint() {
        assertEquals(100.0, TempConverter.fahrenheitToCelsius(212.0), DELTA);
    }

    @Test
    void testFahrenheitToCelsius_Negative() {
        assertEquals(-40.0, TempConverter.fahrenheitToCelsius(-40.0), DELTA);
    }

    // ---------- Celsius to Kelvin ----------

    @Test
    void testCelsiusToKelvin_Zero() {
        assertEquals(273.15, TempConverter.celsiusToKelvin(0.0), DELTA);
    }

    @Test
    void testCelsiusToKelvin_Negative273_15() {
        assertEquals(0.0, TempConverter.celsiusToKelvin(-273.15), DELTA);
    }

    // ---------- Kelvin to Celsius ----------

    @Test
    void testKelvinToCelsius_Zero() {
        assertEquals(-273.15, TempConverter.kelvinToCelsius(0.0), DELTA);
    }

    @Test
    void testKelvinToCelsius_Standard() {
        assertEquals(0.0, TempConverter.kelvinToCelsius(273.15), DELTA);
    }

    // ---------- Round-trip Tests ----------

    @Test
    void testRoundTrip_Celsius_Fahrenheit_Celsius() {
        double original = 25.0;
        double converted = TempConverter.fahrenheitToCelsius(
                TempConverter.celsiusToFahrenheit(original)
        );
        assertEquals(original, converted, DELTA);
    }

    @Test
    void testRoundTrip_Celsius_Kelvin_Celsius() {
        double original = 50.0;
        double converted = TempConverter.kelvinToCelsius(
                TempConverter.celsiusToKelvin(original)
        );
        assertEquals(original, converted, DELTA);
    }
}