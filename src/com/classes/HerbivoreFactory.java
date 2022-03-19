package com.classes;

import com.abstractclasses.AbstractFactory;
import com.interfaces.Carnivores;
import com.interfaces.Herbivores;

class HerbivoreFactory extends AbstractFactory
{
     public Herbivores getHerbivores(String herbi)
     {
         if(herbi.equalsIgnoreCase("Cow"))
             return new Cow();
         else if(herbi.equalsIgnoreCase("Sheep"))
             return new Sheep();
         else
             return null;
     }
     public Carnivores getCarnivores(String carni)
     {
         return null;
     }
}
