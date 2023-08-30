package com.madeeasy.toppingdecorator.impl;

import com.madeeasy.Pizza;
import com.madeeasy.pizza.impl.ToppingDecorator;

public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 2.0;
    }
}
