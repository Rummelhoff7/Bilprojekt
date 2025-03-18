package org.example.bilprojekt.Config;

import org.example.bilprojekt.Model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Initdata {

    public ArrayList<Car> carList = new ArrayList<>();

    public Initdata() {
        carList.add(new Car(1,"Volvo", 2012, "Sedan", "Red", "ABC123", "blåvolvostationcar.jpg"));
        carList.add(new Car(2, "Ford", 1938, "SUV", "Blue", "DEF456", "generic.jpg"));
        carList.add(new Car(3, "VW", 1986, "Coupe", "Blue", "DEF456", "generic.jpg"));
        carList.add(new Car(4, "Ford", 1938, "SUV", "Blue", "DEF456", "generic.jpg"));
        carList.add(new Car(5, "Ford", 1938, "SUV", "Blue", "DEF456", "generic.jpg"));
    }
}
