package edu.alenasoft.items;

import edu.alenasoft.Item;
import edu.alenasoft.strategy.ItemDexterityVestUpdater;

public class ItemDexterityVest extends Item {
    private static final String TYPE = "+5 Dexterity Vest";

    public ItemDexterityVest(int sellIn, int quality) {
        super(TYPE, sellIn, quality, new ItemDexterityVestUpdater());
    }
}
