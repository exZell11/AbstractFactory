package com.company;

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
