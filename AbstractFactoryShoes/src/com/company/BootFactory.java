package com.company;

public class BootFactory implements ShoeTypeFactory{

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
