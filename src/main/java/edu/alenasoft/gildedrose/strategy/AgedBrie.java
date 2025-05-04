package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class AgedBrie implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1); // Aumenta calidad adicional si está vencido
        }
    }

}
