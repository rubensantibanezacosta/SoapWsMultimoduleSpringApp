package org.rs.parent;



public class TemperatureServiceImpl implements TemperatureService {


    private ITempCoverterIml iTempConverter;

    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        FactoryTemp.init();
        iTempConverter= (ITempCoverterIml) FactoryTemp.getInstance();
        return iTempConverter.convertCelsiusToFahrenheit(celsius);
    }

}
