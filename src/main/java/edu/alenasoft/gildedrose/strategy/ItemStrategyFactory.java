package edu.alenasoft.gildedrose.strategy;

import edu.alenasoft.gildedrose.Item;

public class ItemStrategyFactory {

    public static ItemStrategy getStrategy(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage();
            case "Conjured Mana Cake":
                return new Conjured();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            default:
                return new Default();
        }
    }
}
