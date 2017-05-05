package org.fage.bean;

import org.fage.annotations.Bean;
import org.fage.annotations.Fruit;
import org.fage.annotations.Fruit.FruitType;

@Fruit(isMelon=true,name="WaterMelon",price=10,fruitType=FruitType.WATERMELON)
@Bean("This is a Fruit JavaBean!!")
public class FruitBean {}
