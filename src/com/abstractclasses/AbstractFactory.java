package com.abstractclasses;

import com.interfaces.Carnivores;
import com.interfaces.Herbivores;

public abstract class AbstractFactory
{
    public abstract Herbivores getHerbivores(String herbi);
    public abstract Carnivores getCarnivores(String carni);
}
