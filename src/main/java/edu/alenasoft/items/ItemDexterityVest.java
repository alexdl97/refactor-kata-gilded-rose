package edu.alenasoft.items;

import edu.alenasoft.Item;

public class ItemDexterityVest extends Item {
    private static final String TYPE = "+5 Dexterity Vest";
    public ItemDexterityVest(int sellIn, int quality) {
        super(TYPE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
        }
        this.setSellIn((this.getSellIn() - 1));
        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
