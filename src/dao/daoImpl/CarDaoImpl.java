package dao.daoImpl;

import dao.CarDao;
import database.Database;
import model.Car;
import model.Person;

import javax.xml.crypto.Data;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public void saveCar(Long id, Car car) {
        for (Person person : Database.person) {
            if (car.getId().equals(id)) {
                person.getCars().add(car);
                System.out.println("успешно ");
            } else System.out.println("мындай person жок ");
        }
    }

    @Override
    public List<Car> getCarByPersonId(Long id) {
        for (Person person : Database.person) {
            if (person.getId().equals(id)) {
                return person.getCars();
            } else System.out.println("мындай person жок  ");
        }

        return null;
    }

    @Override
    public Car getCarById(Long id) {
        for (Person person : Database.person) {
            for (Car car : person.getCars()) {
                if (car.getId().equals(id)) {
                    return car;
                } else System.out.println("мындай  car жок ");
            }
        }
        return null;
    }

    @Override
    public void updateCarById(Long id, Car car) {
        for (Person person : Database.person) {
            for (Car car1 : person.getCars()) {
                if (car1.getId().equals(id)) {
                    car1.setName(car.getName());
                    car1.setModel(car.getModel());
                    car1.setYear(car.getYear());
                    return;
                } else System.out.println("успешно");

            }
        }

    }

    @Override
    public String deleteCarById(Long id) {
        for (Person person : Database.person) {
            for (Car car : person.getCars()) {
                if (car.getId().equals(id)) {
                    person.getCars().remove(car);
                    return "Car successfully deleted!";


                }
            }
        }
        throw new RuntimeException("Car not found");
    }
}
