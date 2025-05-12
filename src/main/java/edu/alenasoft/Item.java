package edu.alenasoft;

import edu.alenasoft.strategy.QualityUpdater;

public class Item {

  public String name;
  public int sellIn;
  public int quality;
  public QualityUpdater qualityUpdater;

  public Item(String name, int sellIn, int quality, QualityUpdater qualityUpdater) {
    this.setName(name);
    this.setSellIn(sellIn);
    this.setQuality(quality);
    this.qualityUpdater = qualityUpdater;
  }

  /* Generated getter and setter code */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public void incrementQuality() {
    if (this.getQuality() < 50) {
      this.setQuality(this.getQuality() + 1);
    }
  }

  public void decrementSellIn() {
    this.setSellIn(this.getSellIn() - 1);
  }

  public void updateQuality() {
    if (this.qualityUpdater != null) {
      this.qualityUpdater.update(this);
    }
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", sellIn=" + sellIn +
        ", quality=" + quality +
        '}';
  }
}
