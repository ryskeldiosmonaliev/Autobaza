package com.peaksoft;

import java.util.ArrayList;
import java.util.List;

public class UzerDao {
    private final List<Driver> cars = new ArrayList<>();

    public UzerDao() {
    }

    public List<Driver> getUzers() {
        return cars;
    }
}

