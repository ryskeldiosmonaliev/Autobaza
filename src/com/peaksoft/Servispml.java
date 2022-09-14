package com.peaksoft;

import java.util.Scanner;

public class Servispml {
    public static void servisTruc(Car[] car1, Driver[] drivers) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("выберите грузавик\n" +
                    "1-Renauld_Magnum\n" +
                    "2-Volvo,\n" +
                    "3- DAF_XT\n");
            int carId = scanner.nextInt();
            if (carId == 0) {
                break;
            }
            Car car = StartDriving.getCarById(car1, carId);
            System.out.println(car);
            System.out.println("выбрети что хотите зделат\n" + "1- поменят водителя или назначить\n" + "3-отправит на ремонт\n" + "0-выйты из системы");

            int base = scanner.nextInt();
            if (base == 0) {
                break;
            }
            switch (base) {
                case 1:
                    StartDriving.changeDriver1(car, drivers);
                    break;

                case 2:
                    StartDriving.routeDriver(car);
                    break;
                case 3:
                    StartDriving.repairDriver(car);
                    break;
            }
        }
    }
}

