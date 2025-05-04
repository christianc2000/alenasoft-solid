package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class Conjured implements ItemStrategy {

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        // Reducción adicional por ser Conjured (doble de rápido)
        // Si está vencido, reduce una vez más (el quality no debe ser negativo)
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

    }

}
