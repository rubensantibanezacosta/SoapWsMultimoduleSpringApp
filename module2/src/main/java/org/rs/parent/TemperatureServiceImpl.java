package org.rs.parent;

import org.springframework.beans.factory.annotation.Autowired;

public class TemperatureServiceImpl implements TemperatureService {


    private ITempCoverterIml iTempConverter;

    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        FactoryTemp.init();
        iTempConverter= (ITempCoverterIml) FactoryTemp.getInstance();
        return iTempConverter.convertCelsiusToFahrenheit(celsius);
    }

}
