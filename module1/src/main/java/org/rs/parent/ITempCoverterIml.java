package org.rs.parent;


import com.name.server.cxf.CelsiusToFahrenheitRequest;
import com.name.server.cxf.TempConverterEndpoint;
import com.name.server.cxf.TempConverterEndpointService;
import org.springframework.stereotype.Service;

@Service
public class ITempCoverterIml implements ITempConverter {


   @Override
    public double convertCelsiusToFahrenheit(double celsius) {

       TempConverterEndpointService ss = new TempConverterEndpointService();
       TempConverterEndpoint port = ss.getTempConverterEndpointPort();
         CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
         request.setTemperatureInCelsius(celsius);
       return port.celsiusToFahrenheit(request).getTemperatureInFahrenheit();

    }
}
