package com.company.factories;

import com.company.interfaces.Shoe;
import com.company.enumerations.ShoeBrand;
import com.company.interfaces.ShoeTypeFactory;
import com.company.models.NorthFaceShoe;
import com.company.models.TimberlandShoe;

public class BootFactory implements ShoeTypeFactory {

    public Shoe create(ShoeBrand shoeBrand) {
        switch (shoeBrand){
            case NORTHFACE:
                return new NorthFaceShoe();
            case TIMBERLAND:
                return new TimberlandShoe();
            default:
                return null;
        }
    }
}
