package com.company.models;

import com.company.interfaces.Shoe;

public class NorthFaceShoe implements Shoe {

    @Override
    public void logo() {
        System.out.println("North Face");
    }
}
