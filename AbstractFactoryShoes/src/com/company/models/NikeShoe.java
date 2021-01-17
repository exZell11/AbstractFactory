package com.company.models;

import com.company.interfaces.Shoe;

public class NikeShoe implements Shoe {

    @Override
    public void logo() {
        System.out.println("Nike");
    }
}
