package edu.alenasoft.strategy;

import edu.alenasoft.Item;

public class AgedBrieUpdater implements QualityUpdater {

    @Override
    public void update(Item item) {
        if (item.getQuality() > 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
