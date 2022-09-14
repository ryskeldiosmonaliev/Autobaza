package com.peaksoft;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StartDriving {
    public static void changeDriver1(Car car, Driver[] drivers) {
        Random random = new Random();
        int driverId = random.nextInt(1, 4);
        Driver driver = Arrays.stream(drivers)
                .filter(d -> d.getId() == driverId)
                .findAny()
                .get();
        if (car.getDriver() == null) {
            car.setDriver(driver);
            driver.setName(car.getName());
            System.out.println(car.getId() + " | " + car.getName() + "| " + driver.getNameDr() + "| " + car.getState());
            System.out.println("Теперь грузовик  " + car.getName() + ", ведёт водитель   " + driver.getNameDr());
            System.out.println("выбрети что хотите зделат\n" + "1- поменят водителя или назначить\n" + "2- выйди в пут\n" + "3-отправит на ремонт\n" + "0-выйты из системы");
        } else {
            System.out.println(driver);
            System.out.println("Это водитель не свободен");
        }
    }

    public static void routeDriver(Car car) {
        if (car.getState().equals(State.ROUTE)) {
            System.out.println("Грузовик уже в пути");
        } else if (car.getDriver() == null) {
            System.out.println("net driver");
        } else {
            car.setState(State.ROUTE);
            System.out.println(car.getId() + " | " + car.getName() + "| " + car.getDriver().getNameDr() + "| " + State.ROUTE);
            System.out.println("Теперь грузовик  " + car.getName() + ", ведёт водитель   " + car.getDriver().getNameDr());
        }
    }

    public static void repairDriver(Car car) {

        if (car.getState().equals(State.REPAIR)) {
            System.out.println("Нельзя сменить водителя.");
        } else if (car.getDriver() == null) {
            System.out.println("net driver");
        } else {
            car.setState(State.REPAIR);
            System.out.println(car.getId() + " | " + car.getName() + "| " + car.getDriver().getNameDr() + "| " + State.ROUTE);
        }
    }
    public static Car getCarById (Car[] cars, int id){
        return Stream.of(cars)
                .filter(x -> x.getId() == id)
                .findFirst()
                .get();
    }
}



