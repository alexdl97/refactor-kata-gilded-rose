package edu.alenasoft.items;

import edu.alenasoft.Item;

public class ItemConjuredManaCake extends Item {
    private static final String TYPE = "Conjured Mana Cake";
    public ItemConjuredManaCake(int sellIn, int quality) {
        super(TYPE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }

        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
            if (this.getSellIn() < 0 && this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
