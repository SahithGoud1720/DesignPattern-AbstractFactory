package com.classes;

public class FactoryCreator
{
    public HerbivoreFactory getHerbivoreFactory(String herbiFactory)
    {
        if(herbiFactory.equalsIgnoreCase("herbivore factory"))
            return new HerbivoreFactory();
        else
            return null;
    }

    public CarnivoreFactory getCarnivoreFactory(String carniFactory)
    {
        if(carniFactory.equalsIgnoreCase("carnivore factory"))
            return new CarnivoreFactory();
        else
            return null;
    }
}
