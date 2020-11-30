package com.company;

public class Main {

    public static void main(String[] args) {
        ShoeTypeFactory factory = AbstractShoeFactory.getFactory(ShoeType.SNEAKERS);
        Shoe nike = factory.create(ShoeBrand.NIKE);
        nike.logo();


        ShoeTypeFactory bfactory = AbstractShoeFactory.getFactory(ShoeType.BOOTS);
        Shoe timbs = bfactory.create(ShoeBrand.TIMBERLAND);
        timbs.logo();

    }
}
