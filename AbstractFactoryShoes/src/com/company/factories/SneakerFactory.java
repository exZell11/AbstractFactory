package com.company.factories;

import com.company.interfaces.Shoe;
import com.company.enumerations.ShoeBrand;
import com.company.interfaces.ShoeTypeFactory;
import com.company.models.AdidasShoe;
import com.company.models.NikeShoe;

public class SneakerFactory implements ShoeTypeFactory {

    public Shoe create(ShoeBrand shoeBrand) {

        switch (shoeBrand){
            case NIKE:
                return new NikeShoe();
            case ADIDAS:
                return new AdidasShoe();
            default:
                return null;
        }
    }
}
