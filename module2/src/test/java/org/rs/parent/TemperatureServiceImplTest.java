package org.rs.parent;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TemperatureServiceImplTest extends TestCase {

    @InjectMocks private TemperatureServiceImpl iTempConverter= new TemperatureServiceImpl();

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertNotNull(iTempConverter.convertCelsiusToFahrenheit(0));
    }


}