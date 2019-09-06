package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    private static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
