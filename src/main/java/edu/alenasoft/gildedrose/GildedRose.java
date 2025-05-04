package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

import edu.alenasoft.gildedrose.strategy.AgedBrie;
import edu.alenasoft.gildedrose.strategy.Backstage;
import edu.alenasoft.gildedrose.strategy.Conjured;
import edu.alenasoft.gildedrose.strategy.Default;
import edu.alenasoft.gildedrose.strategy.Sulfuras;

public class GildedRose {

    public static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 0, 3));

        updateQuality();

        System.out.println(items);
    }

    public static void BackstagePasses(Item item) {

    }

    // public static void updateQuality() {
    //   for (int i = 0; i < items.size(); i++) {
    //     if ((!"Aged Brie".equals(items.get(i).getName()))//Verifica si no es igual a Aged Brie y no es igual a Backstage passes to a TAFKAL80ETC concert
    //         && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
    //       if (items.get(i).getQuality() > 0) {
    //         if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
    //           items.get(i).setQuality(items.get(i).getQuality() - 1);
    //         }
    //       }
    //     } else {//Si es Aged Brie o Backstage passes to a TAFKAL80ETC concert
    //       if (items.get(i).getQuality() < 50) {
    //         items.get(i).setQuality(items.get(i).getQuality() + 1);
    //         if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
    //           if (items.get(i).getSellIn() < 11) {
    //             if (items.get(i).getQuality() < 50) {
    //               items.get(i).setQuality(items.get(i).getQuality() + 1);
    //             }
    //           }
    //           if (items.get(i).getSellIn() < 6) {
    //             if (items.get(i).getQuality() < 50) {
    //               items.get(i).setQuality(items.get(i).getQuality() + 1);
    //             }
    //           }
    //         }
    //       }
    //     }
    //     if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
    //       items.get(i).setSellIn(items.get(i).getSellIn() - 1);
    //     }
    //     if (items.get(i).getSellIn() < 0) {
    //       if (!"Aged Brie".equals(items.get(i).getName())) {
    //         if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
    //           if (items.get(i).getQuality() > 0) {
    //             if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
    //               items.get(i).setQuality(items.get(i).getQuality() - 1);
    //             }
    //           }
    //         } else {
    //           items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
    //         }
    //       } else {
    //         if (items.get(i).getQuality() < 50) {
    //           items.get(i).setQuality(items.get(i).getQuality() + 1);
    //         }
    //       }
    //     }
    //   }
    // }
    public static void updateQuality() {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);

            if (item.getName().equals("Aged Brie")) {
                new AgedBrie().updateQuality(item);
            } else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                new Backstage().updateQuality(item);
            } else if (item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                new Sulfuras().updateQuality(item);
            } else if (item.getName().equals("Conjured Mana Cake")) {
                System.out.println("Conjured Mana Cake");
                new Conjured().updateQuality(item);
            } else {
                new Default().updateQuality(item);
            }
        }
    }
}
