package com.madeeasy;

import com.madeeasy.pizza.impl.BasicPizza;
import com.madeeasy.toppingdecorator.impl.CheeseTopping;
import com.madeeasy.toppingdecorator.impl.TomatoTopping;

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        Pizza cheeseTomatoPizza = new TomatoTopping(new CheeseTopping(basicPizza));

        System.out.println("Pizza Description: " + cheeseTomatoPizza.getDescription());
        System.out.println("Pizza Cost: $" + cheeseTomatoPizza.getCost());
    }
}