package edu.alenasoft;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;

import edu.alenasoft.items.ItemAgedBrie;
import edu.alenasoft.items.ItemBackstagePass;
import edu.alenasoft.items.ItemConjuredManaCake;
import edu.alenasoft.items.ItemDexterityVest;
import edu.alenasoft.items.ItemSulfuraHOR;

public class GildedRose {

  public static List<Item> items = null;

  public static void main(String[] args) {

    System.out.println("OMGHAI!");
    items = new ArrayList<Item>();
    // items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new ItemDexterityVest(10, 20));
    //items.add(new Item("Aged Brie", 2, 0));
    items.add(new ItemAgedBrie(2, 0));
    // items.add(new Item("Elixir of the Mongoose", 5, 7));
    //items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new ItemSulfuraHOR(0, 80));
    items.add(new ItemBackstagePass(15, 20));
    //items.add(new Item("Conjured Mana Cake", 0, 3));
    items.add(new ItemConjuredManaCake(0, 3));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    for (Item item : items) {
      item.updateQuality();
    }
  }

  public static void updateQualityLegacy() {
    for (int i = 0; i < items.size(); i++) {
      if ((!"Aged Brie".equals(items.get(i).getName()))
          && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
        if (items.get(i).getQuality() > 0) {
          if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
            items.get(i).setQuality(items.get(i).getQuality() - 1);
          }
        }
      } else {
        if (items.get(i).getQuality() < 50) {
          items.get(i).setQuality(items.get(i).getQuality() + 1);

          if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
            if (items.get(i).getSellIn() < 11) {
              if (items.get(i).getQuality() < 50) {
                items.get(i).setQuality(items.get(i).getQuality() + 1);
              }
            }

            if (items.get(i).getSellIn() < 6) {
              if (items.get(i).getQuality() < 50) {
                items.get(i).setQuality(items.get(i).getQuality() + 1);
              }
            }
          }
        }
      }

      if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
        items.get(i).setSellIn(items.get(i).getSellIn() - 1);
      }

      if (items.get(i).getSellIn() < 0) {
        if (!"Aged Brie".equals(items.get(i).getName())) {
          if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
            if (items.get(i).getQuality() > 0) {
              if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
                items.get(i).setQuality(items.get(i).getQuality() - 1);
              }
            }
          } else {
            items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
          }
        } else {
          if (items.get(i).getQuality() < 50) {
            items.get(i).setQuality(items.get(i).getQuality() + 1);
          }
        }
      }

      if (items.get(i).getName().equals("Conjured Mana Cake")) {
        if (items.get(i).getQuality() > 0) {
          items.get(i).setQuality(items.get(i).getQuality() - 1);
          if (items.get(i).getSellIn() < 0 && items.get(i).getQuality() > 0) {
            items.get(i).setQuality(items.get(i).getQuality() - 1);
          }
        }
      }
    }
  }
}
