package org.example.bilprojekt.Repository;

import org.example.bilprojekt.Config.Initdata;
import org.example.bilprojekt.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    @Autowired // Nu kan man tilgå initdata i hele klassen.
    Initdata init;

    public ArrayList<Car> getAllCars() {
        return init.carList;
    }

}
