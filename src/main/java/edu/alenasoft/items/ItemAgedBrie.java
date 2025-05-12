package edu.alenasoft.items;

import edu.alenasoft.Item;
import edu.alenasoft.strategy.AgedBrieUpdater;

public class ItemAgedBrie extends Item {
    private static final String TYPE = "Aged Brie";

    public ItemAgedBrie(int sellIn, int quality) {
        super(TYPE, sellIn, quality, new AgedBrieUpdater());
    }
}
