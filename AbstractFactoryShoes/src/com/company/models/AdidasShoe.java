package com.company.models;

import com.company.interfaces.Shoe;

public class AdidasShoe implements Shoe {

    @Override
    public void logo() {
        System.out.println("Adidas");
    }
}
