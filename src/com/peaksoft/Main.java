package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson gson = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Path.of("./cars.json");
    public static final Path DRIVER_NAME =Path.of("./driver.json");

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = {
                Car.makeCar(1, Name.Renauld_Magnum, null, State.BASE),
               Car.makeCar(2, Name.Volvo, null, State.BASE),
                Car.makeCar(3, Name.DAF_XT, null, State.BASE),
        };
        Car [] car1 = gson.fromJson(readFile(),Car[].class);
        for (Car c :car1){
            System.out.println(c);

        }
        System.out.println();

        Driver[] drivers= {
                Driver.makeDriver(1,"Petr",null),
                Driver.makeDriver(2,"Askar",null),
                Driver.makeDriver(3,"Uson",null),
        };
        Driver[] d =gson.fromJson(readFile2(),Driver[].class);
        for (Driver ds: d){
            System.out.println(ds.toString());
        }

        writeFile(gson.toJson(cars));
        writeDriverName(gson.toJson(drivers));
        Servis servis = new Servis();
        System.out.println("Праграмма завершает работу при 0\n выберите Сar 1 2 3");
  //Servis.changeDriver2();
        Servis.truck();
      //  Servis.changeDriver(1,3);
    }

    private static void writeFile(String Object) {
        Path write = Paths.get(String.valueOf(WRITE_PATH));
        try {
            Files.writeString(write, Object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    private static void writeDriverName(String object){
        Path write = Paths.get(String.valueOf(DRIVER_NAME));
        try {
            Files.writeString(write,object,StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static String readFile(){
        String json = "";
        try {
            FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while ((a = reader.read()) !=-1){
                json +=  (char)a;
            }
        }catch (Exception e){
            e.getMessage();
        }
        return json;
    }
    static String readFile2(){
        String json = "";
        try {
            FileReader reader = new FileReader(String.valueOf(DRIVER_NAME));
            int a;
            while ((a = reader.read()) !=-1){
                json +=  (char)a;
            }
        }catch (Exception e){
            e.getMessage();
        }
        return json;
    }
}




