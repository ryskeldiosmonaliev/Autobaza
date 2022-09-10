package com.peaksoft;

public class Driver {
    private int id;
    private String nameDr;
   private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDr() {
        return nameDr;
    }

    public void setNameDr(String nameDr) {
        this.nameDr = nameDr;
    }

    public static Driver makeDriver(int id, String nameDr, Name name){
        Driver driver = new Driver();
        driver.id=id;
        driver.nameDr = nameDr;
        driver.name =name;
        return driver;
    }


    @Override
    public String toString() {
        return id+" |"+ nameDr+"|"+ name;
    }
}
