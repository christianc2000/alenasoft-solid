package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class Default implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

}
