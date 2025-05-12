package edu.alenasoft.items;

import edu.alenasoft.Item;
import edu.alenasoft.strategy.ItemBackstagePassUpdater;

public class ItemBackstagePass extends Item {
    private static final String TYPE = "Backstage passes to a TAFKAL80ETC concert";

    public ItemBackstagePass(int sellIn, int quality) {
        super(TYPE, sellIn, quality, new ItemBackstagePassUpdater());
    }
}
