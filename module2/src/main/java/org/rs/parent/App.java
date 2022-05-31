package org.rs.parent;

import org.springframework.beans.factory.annotation.Autowired;

public class App {

    public static void main(String[] args) {
        TemperatureServiceImpl service = new TemperatureServiceImpl();
        System.out.println(service.convertCelsiusToFahrenheit(20));
    }
}
