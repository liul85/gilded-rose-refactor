package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePass extends Item {
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (sellIn < 10) {
            increaseQuality();
        }

        if (sellIn < 5) {
            increaseQuality();
        }
    }

}
