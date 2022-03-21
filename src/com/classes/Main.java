package com.classes;

import com.interfaces.Carnivores;
import com.interfaces.Herbivores;

public class Main
{
    public static void main(String[] args)
    {
        FactoryCreator factCreator = new FactoryCreator();
        HerbivoreFactory herbivoreFactory = factCreator.getHerbivoreFactory("Herbivore factory");
        Herbivores friendly = herbivoreFactory.getHerbivores("cow");
        friendly.AnimalCategory();
        friendly.AnimalInfo();


        CarnivoreFactory carnivoreFactory = factCreator.getCarnivoreFactory("carnivore factory");
        Carnivores danger = carnivoreFactory.getCarnivores("Jaguar");
        danger.AnimalCategory();
        danger.AnimalInfo();
    }
}
