package temperature_converters;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConvertCtoFTest extends TemperatureConverterTest {

    @Parameterized.Parameters(name="{index}: expected output={0}, input={1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(
                new Object[][]{
                        {33.8, 1},
                        {212, 100}
                }
        );
    }

    @Test
    public void test() {
        assertEquals(outValue, converter.convertCtoF(inValue), accuracy);
    }
}
