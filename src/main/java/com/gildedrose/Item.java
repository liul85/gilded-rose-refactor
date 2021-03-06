package com.gildedrose;

public class Item {
    private String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void passOneDay() {
        updateSellInDays();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterExpired();
        }
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void updateQualityAfterExpired() {
        decreaseQuality();
    }

    protected void updateSellInDays() {
        sellIn = sellIn - 1;
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }
}