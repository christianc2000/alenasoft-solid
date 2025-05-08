package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class Sulfuras implements ItemStrategy {

    @Override
    public void updateQuality(Item item) {
       //Según el comportamiento de Sulfuras, no se actualiza la calidad ni el sellIn
    }
}
