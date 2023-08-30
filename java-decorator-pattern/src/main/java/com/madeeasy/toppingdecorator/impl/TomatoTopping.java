package com.madeeasy.toppingdecorator.impl;

import com.madeeasy.Pizza;
import com.madeeasy.pizza.impl.ToppingDecorator;

public class TomatoTopping extends ToppingDecorator {
    public TomatoTopping(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 1.5;
    }
}
