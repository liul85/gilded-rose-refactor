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
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 10) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 5) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}
