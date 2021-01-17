package com.company;

import com.company.enumerations.ShoeBrand;
import com.company.enumerations.ShoeType;
import com.company.factories.AbstractShoeFactory;
import com.company.interfaces.Shoe;
import com.company.interfaces.ShoeTypeFactory;

public class Main {

    public static void main(String[] args) {
        ShoeTypeFactory factory = AbstractShoeFactory.getFactory(ShoeType.SNEAKERS);
        Shoe nike = factory.create(ShoeBrand.NIKE);
        nike.logo();

        Shoe adidas = factory.create(ShoeBrand.ADIDAS);
        adidas.logo();


        ShoeTypeFactory bfactory = AbstractShoeFactory.getFactory(ShoeType.BOOTS);
        Shoe timbs = bfactory.create(ShoeBrand.TIMBERLAND);
        timbs.logo();

    }
}
