package com.peaksoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.peaksoft.Main.*;

public class Servis {
    public static void changeDriver(int id, int dv) {

        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == dv) {
                    System.out.println(c.getName() + "" + ds.getId() + "" + ds.getNameDr());
                    System.out.println("Теперь грузовик" + c.getName() + ", ведёт водитель " + ds.getNameDr());
                }
            }
        }
    }

    public static void changeDriver1(Car car, Driver[] drivers) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 2) {
                    System.out.println(c.getId() + " | " + Name.Renauld_Magnum + "| " + ds.getNameDr() + "| " + c.getState());
                    System.out.println("Теперь грузовик  " + Name.Renauld_Magnum + ", ведёт водитель   " + ds.getNameDr());
                }
            }
        }
    }


    public static void startDriving1() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 2) {
                    if (id == 1) {
                        System.out.println(" нажмите 1 или 2 или 3 ");
                        Servis.truck();
                        System.out.println("выберите водителя");

                    }


                if (id == 2) {

                    System.out.println("грузовик ушпешно вышел на маршрут");
                    System.out.println(c.getId() + " | " + Name.Renauld_Magnum + "| " + ds.getNameDr() + "| " + State.ROUTE);

                } else if (id == 3) {
                    System.out.println(Name.Renauld_Magnum + "грузовик на ремонте");
                    System.out.println(c.getId() + " | " + Name.Renauld_Magnum + "| " + " " + "| " + State.REPAIR);
                }
            }}

        }  }

    public static void changeDriver2() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 2) {
                    System.out.println(c.getId() + " | " + Name.Volvo + "| " + ds.getNameDr() + "| " + c.getState());
                    System.out.println("Теперь грузовик  " + Name.Volvo + ", ведёт водитель   " + ds.getNameDr());
                }
            }
        }
    }
    public static void startDriving2() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 2) {

                    System.out.println("грузовик ушпешно вышел на маршрут");
                    System.out.println(c.getId() + " | " + Name.Volvo + "| " + ds.getNameDr() + "| " + State.ROUTE);


                }

            }
        }
    }

    public static void changeDriver3() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 3) {
                    System.out.println(c.getId() + " | " + Name.DAF_XT + "| " + ds.getNameDr() + "| " + c.getState());
                    System.out.println("Теперь грузовик  " + Name.DAF_XT + ", ведёт водитель   " + ds.getNameDr());
                }
            }
        }
    }
    public static void startDriving3() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Driver[] d = gson.fromJson(readFile2(), Driver[].class);
        Car[] car1 = gson.fromJson(readFile(), Car[].class);
        for (Car c : car1) {
            for (Driver ds : d) {
                if (ds.getId() == id && c.getId() == 2) {

                    System.out.println("грузовик ушпешно вышел на маршрут");
                    System.out.println(c.getId() + " | " + Name.DAF_XT + "| " + ds.getNameDr() + "| " + State.ROUTE);


                }

            }
        }
    }


    public static void truck() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a >= 0) {
            a = scanner.nextInt();
            if (a == 1) {
                Car[] car1 = gson.fromJson(readFile(), Car[].class);
                for (Car c : car1) {
                    if (c.getId() == 1) {
                        System.out.println(c.getId() + " | " + c.getName() + "| " + c.getDriver() + "| " + c.getState());
                        System.out.println("выберите водителя:\n" +
                                "1-Petr\n" +
                                "2-Askar\n" +
                                "3-Uson\n" +
                                "0-выйти из системы");
                        Servis.changeDriver1();
                        System.out.println("выбрети что хотите зделат\n" +
                                "1- поменят водителя или назначить\n" +
                                "2- выйди в пут\n" +
                                "3-отправит на ремонт\n" +
                                "0-выйты из системы");
                        Servis.startDriving1();
                    }
                }
            } else if (a == 2) {
                Car[] car1 = gson.fromJson(readFile(), Car[].class);
                for (Car c : car1) {
                    if (c.getId() == 2) {
                        System.out.println(c.getId() + " | " + c.getName() + "| " + c.getDriver() + "| " + c.getState());
                        System.out.println("выбрети что хотите зделат\n" +
                                "1- поменят водителя или назначить\n" +
                                "2- выйди в пут\n" +
                                "3-отправит на ремонт\n" +
                                "0-выйты из системы");
                        Servis.changeDriver2();
                        Servis.startDriving2();
                    }
                }
            } else if (a == 3) {
                Car[] car1 = gson.fromJson(readFile(), Car[].class);
                for (Car c : car1) {
                    if (c.getId() == 3) {
                        System.out.println(c.getId() + " | " + c.getName() + "| " + c.getDriver() + "| " + c.getState());
                        System.out.println("выбрети что хотите зделат\n" +
                                "1- поменят водителя или назначить\n" +
                                "2- выйди в пут\n" +
                                "3-отправит на ремонт\n" +
                                "0-выйты из системы");
                        Servis.changeDriver3();
                        Servis.changeDriver3();
                    }
                }
            } else if (a == 0) {
                break;
            } else {
                System.out.println("no");
            }
        }

    }
//        Bus: Renault Magnum
//
//        Driver : Petr
//
//       Bus state : On base


//    public  Driver byId(int id) throws Exception {
//        List<Integer> list = new ArrayList<>();
//        Car car = new Car();
//        Driver driver = new Driver();
//        for (int i = 0; i < driver.getId(); i++) {
//            list.add(uzerDao.getUzers().get(i).getId());
//            if (driver.getId() == id) {
//                driver = uzerDao.getUzers().get(i);
//            }
//        }
//        if (list.contains(id)) ;
//        else {
//            throw new Exception("такого id не сушущтвует");
//
//        }
//        return driver;
//    }
}
