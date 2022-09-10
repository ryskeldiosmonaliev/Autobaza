package com.peaksoft;

public class Car {
    private int id;
    private Name name;
    private Driver driver;
    private State state;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static Car makeCar(int id, Name name, Driver driver, State state){
        Car car = new Car();
        car.id=id;
        car.name=name;
        car.driver=driver;
        car.state=state;
        return car;
}

    @Override
    public String toString() {
        return
                id+ "|" +name+  "| " +driver + "|"+ state;

    }
}
