package edu.alenasoft.items;

import edu.alenasoft.Item;
import edu.alenasoft.strategy.ItemConjuredManaCakeUpdater;

public class ItemConjuredManaCake extends Item {
    private static final String TYPE = "Conjured Mana Cake";

    public ItemConjuredManaCake(int sellIn, int quality) {
        super(TYPE, sellIn, quality, new ItemConjuredManaCakeUpdater());
    }
}
