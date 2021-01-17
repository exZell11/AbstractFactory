package com.company.interfaces;

import com.company.enumerations.ShoeBrand;

public interface ShoeTypeFactory {

    Shoe create(ShoeBrand shoeBrand);

}
