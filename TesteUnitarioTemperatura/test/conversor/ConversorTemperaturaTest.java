package conversor;

import conversor.ConversorTemperatura;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConversorTemperaturaTest {
    
    public ConversorTemperaturaTest() {
    }

    @Test
    public void testConverteCelsiusParaFahrenheit() {
        System.out.println("converteCelsiusParaFahrenheit");
        double celsius = 28.0;
        double expResult = 82.4;
        double result = ConversorTemperatura.converteCelsiusParaFahrenheit(celsius);
        assertEquals(expResult, result, 82.4);
    }

    @Test
    public void testConverteFahrenheitParaCelsuius() {
        System.out.println("converteFahrenheitParaCelsuius");
        double fahrenheit = 155.0;
        double expResult = 68.3;
        double result = ConversorTemperatura.converteFahrenheitParaCelsuius(fahrenheit);
        assertEquals(expResult, result, 68.3);
    }
    
}
