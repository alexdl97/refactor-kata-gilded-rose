package edu.alenasoft.items;

import edu.alenasoft.Item;

public class ItemAgedBrie extends Item {
    private static final String TYPE = "Aged Brie";
    public ItemAgedBrie(int sellIn, int quality) {
        super(TYPE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.getQuality() > 50) {
            this.setQuality(this.getQuality() + 1);
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
        }
    }
}
