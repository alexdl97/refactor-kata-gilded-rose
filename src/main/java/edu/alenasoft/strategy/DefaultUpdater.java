package edu.alenasoft.strategy;

import edu.alenasoft.Item;

public class DefaultUpdater implements QualityUpdater {

    public DefaultUpdater() {}

    @Override
    public void update(Item item) {
        System.out.println("No implementado");
    }

}
