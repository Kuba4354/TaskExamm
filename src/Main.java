import database.GeneradId;
import model.Car;
import model.Person;
import service.CarService;
import service.PersonService;
import service.SocialMediaService;
import service.serviceImpl.CarServiceImpl;
import service.serviceImpl.PersonServiceImpl;
import service.serviceImpl.SocialMediaServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        CarService carService = new CarServiceImpl();
        SocialMediaService socialMediaService = new SocialMediaServiceImpl();

        while (true) {
            System.out.println("**********************************************");
            System.out.println("*                Main Menu                    *");
            System.out.println("**********************************************");
            System.out.println("* 1. save person                              *");
            System.out.println("* 2. get all person                           *");
            System.out.println("* 3. get person by name                       *");
            System.out.println("* 4. update person by id                      *");
            System.out.println("* 5. delete person by id                      *");
            System.out.println("* 6. save media                               *");
            System.out.println("* 7. assign media to person                   *");
            System.out.println("* 8. get social media by id                   *");
            System.out.println("* 9. get all media                            *");
            System.out.println("* 10. delete media by person id               *");
            System.out.println("* 11. delete media by id                      *");
            System.out.println("* 12. save car                                *");
            System.out.println("* 13. get car by person id                    *");
            System.out.println("* 14. update car by id                        *");
            System.out.println("* 15. delete car by id                        *");
            System.out.println("**********************************************");

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    Car car =new Car();
                    System.out.println("write name");
                    car.setName(new Scanner(System.in).nextLine());
                    System.out.println("write model");
                    car.setModel(new Scanner(System.in).nextLine());
                    System.out.println("write foundation year");
                    car.setYear(LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                    car.setId(GeneradId.getCarId());
                    System.out.println("write person id");
                    Long id = new Scanner(System.in).nextLong();
                    carService.saveCar(id,car);
                }
                case 2->{
                    System.out.println("write person id");
                    Long id = new Scanner(System.in).nextLong();
                    System.out.println(carService.getCarById(id));
                }
                case 3->{
                    Car car = new Car();
                    System.out.println("write car id ");
                    Long id = new Scanner(System.in).nextLong();
                    System.out.println("write new name");
                    car.setName(new Scanner(System.in).nextLine());
                    System.out.println("write model");
                    car.setModel(new Scanner(System.in).nextLine());
                    System.out.println("write foundation year");
                    car.setYear(LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                    carService.updateCarById(id,car);
                }
                case 4->{
                    System.out.println("write car id ");
                    Long id = new Scanner(System.in).nextLong();
                    System.out.println(carService.deleteCarById(id));
                }
            }
        }
    }
}