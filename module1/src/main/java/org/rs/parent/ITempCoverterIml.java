package org.rs.parent;



import com.rs.service.cxf.CelsiusToFahrenheitRequest;
import com.rs.service.cxf.TempConverterEndpoint;
import com.rs.service.cxf.TempConverterEndpointService;
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
