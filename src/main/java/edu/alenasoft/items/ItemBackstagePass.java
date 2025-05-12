package edu.alenasoft.items;

import edu.alenasoft.Item;

public class ItemBackstagePass extends Item {
    private static final String TYPE = "Backstage passes to a TAFKAL80ETC concert";
    public ItemBackstagePass(int sellIn, int quality) {
        super(TYPE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);
            if (this.getSellIn() < 11 && this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
            if (this.getSellIn() < 6 && this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
        }
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(0);
            }
        }
    }
}
