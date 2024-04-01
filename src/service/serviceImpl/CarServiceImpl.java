package service.serviceImpl;

import dao.CarDao;
import dao.daoImpl.CarDaoImpl;
import model.Car;
import service.CarService;

import java.util.List;

public class CarServiceImpl  implements CarService {


    @Override
    public void saveCar(Long id, Car car) {

    }

    @Override
    public List<Car> getCarByPersonId(Long id) {
        return null;
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }

    @Override
    public void updateCarById(Long id, Car car) {

    }

    @Override
    public String deleteCarById(Long id) {
        return null;
    }
}



