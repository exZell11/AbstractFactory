package com.company;

import static com.company.ShoeType.BOOTS;
import static com.company.ShoeType.SNEAKERS;

public abstract class AbstractShoeFactory {

    //Sneakers
    //Boots

    public static ShoeTypeFactory getFactory(ShoeType shoeType){

        switch (shoeType){
            case SNEAKERS:
                return new SneakerFactory();
            case BOOTS:
                return new BootFactory();
            default:
                return null;
        }

    }
}
