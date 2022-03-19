package com.classes;

import com.abstractclasses.AbstractFactory;
import com.interfaces.Carnivores;
import com.interfaces.Herbivores;

class CarnivoreFactory extends AbstractFactory
{
    public Carnivores getCarnivores(String carni)
    {
        if(carni.equalsIgnoreCase("Tiger"))
            return new Tiger();
        else if(carni.equalsIgnoreCase("Jaguar"))
            return new Jaguar();
        else
            return null;

    }
    public Herbivores getHerbivores(String herbi)
    {
        return null;
    }

}
