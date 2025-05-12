package edu.alenasoft.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import edu.alenasoft.strategy.AgedBrieUpdater;
import edu.alenasoft.strategy.BackstagePassUpdater;
import edu.alenasoft.strategy.ConjuredManaCakeUpdater;
import edu.alenasoft.strategy.DefaultUpdater;
import edu.alenasoft.strategy.DexterityVestUpdater;
import edu.alenasoft.strategy.QualityUpdater;

public class QualityUpdaterFactory {
    private static final Map<String, Supplier<QualityUpdater>> strategies = new HashMap<>();

    static {
        strategies.put("Aged Brie", AgedBrieUpdater::new);
        strategies.put("Backstage passes to a TAFKAL80ETC concert", BackstagePassUpdater::new);
        strategies.put("Conjured Mana Cake", ConjuredManaCakeUpdater::new);
        strategies.put("+5 Dexterity Vest", DexterityVestUpdater::new);
    }

    public static QualityUpdater getUpdaterFor(String itemName) {
        return strategies.getOrDefault(itemName, DefaultUpdater::new).get();
    }
}
