package com.classes;

import com.interfaces.Carnivores;
import com.interfaces.Herbivores;

public class Main
{
    public static void main(String[] args)
    {
        FactoryCreator factCreat = new FactoryCreator();
        HerbivoreFactory herbiFact = factCreat.getHerbivoreFactory("Herbivore factory");
        Herbivores friendly = herbiFact.getHerbivores("cow");
        friendly.AnimalCategory();
        friendly.AnimalInfo();


        CarnivoreFactory carniFact = factCreat.getCarnivoreFactory("carnivore factory");
        Carnivores danger = carniFact.getCarnivores("Jaguar");
        danger.AnimalCategory();
        danger.AnimalInfo();
    }
}
