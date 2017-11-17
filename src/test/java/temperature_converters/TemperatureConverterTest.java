package temperature_converters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class TemperatureConverterTest {
    protected TemperatureConverter converter;

    protected double accuracy = 0.001;

    @Parameterized.Parameter
    public double outValue;

    @Parameterized.Parameter(1)
    public double inValue;

    @org.junit.Before
    public void setUp() throws Exception {
        converter = new TemperatureConverter();
    }

    @Test
    public abstract void test();
}
