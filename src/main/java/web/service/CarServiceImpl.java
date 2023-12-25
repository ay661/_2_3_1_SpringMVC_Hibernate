package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(1, "3", "Mazda"));
        cars.add(new Car(2, "Swift", "Suzuki "));
        cars.add(new Car(3, "Vesta", "Lada"));
        cars.add(new Car(4, "Priora", "Lada"));
        cars.add(new Car(5, "m3", "BMW"));
    }


    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}