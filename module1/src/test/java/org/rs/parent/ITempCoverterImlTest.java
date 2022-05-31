package org.rs.parent;


import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ITempCoverterImlTest extends TestCase {

    @InjectMocks private ITempCoverterIml iTempConverter;

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals(iTempConverter.convertCelsiusToFahrenheit(30), 86.0, 0.0);
    }
}