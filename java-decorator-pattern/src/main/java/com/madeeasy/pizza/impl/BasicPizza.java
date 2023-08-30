package com.madeeasy.pizza.impl;

import com.madeeasy.Pizza;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}
