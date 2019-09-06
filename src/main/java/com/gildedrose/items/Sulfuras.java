package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras extends Item {
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    protected void updateSellInDays() {
    }

    @Override
    protected void updateQualityAfterExpired() {
    }

    @Override
    protected void updateQuality() {
    }
}
