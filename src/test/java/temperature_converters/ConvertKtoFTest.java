package temperature_converters;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ConvertKtoFTest extends TemperatureConverterTest {

    @Parameterized.Parameters(name="{index}: expected output={0}, input={1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(
                new Object[][]{
                        {-457.87, 1},
                        {-279.67, 100}
                }
        );
    }

    @Test
    public void test() {
        assertEquals(outValue, converter.convertKtoF(inValue), 0.1);
    }
}
