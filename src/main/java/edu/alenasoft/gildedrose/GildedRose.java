package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

import edu.alenasoft.gildedrose.strategy.ItemStrategy;
import edu.alenasoft.gildedrose.strategy.ItemStrategyFactory;

public class GildedRose {

    public static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {

        // System.out.println("OMGHAI!");

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 0, 3));

        updateQuality();

        // System.out.println(items);
    }

    public static void updateQuality() {
        for (Item item : items) {
            ItemStrategy strategy = ItemStrategyFactory.getStrategy(item);
            strategy.updateQuality(item);
        }
    }
}
