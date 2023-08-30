package com.madeeasy.pizza.impl;

import com.madeeasy.Pizza;

public class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public Double getCost() {
        return pizza.getCost();
    }
}
