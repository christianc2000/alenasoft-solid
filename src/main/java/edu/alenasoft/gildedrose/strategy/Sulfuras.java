package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class Sulfuras implements ItemStrategy {

    @Override
    public void updateQuality(Item item) {
       //Según el comportamiento de Sulfuras, no sufre modificaciones en su calidad ni en su fecha de caducidad.
        //Por lo tanto, no se necesita implementar ninguna lógica aquí.
    }
}
