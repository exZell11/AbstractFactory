package com.company.factories;

import com.company.enumerations.ShoeType;
import com.company.interfaces.ShoeTypeFactory;

public abstract class AbstractShoeFactory {

    public static ShoeTypeFactory getFactory(ShoeType shoeType) {

        switch (shoeType) {
            case SNEAKERS:
                return new SneakerFactory();
            case BOOTS:
                return new BootFactory();
            default:
                return null;
        }

    }
}
