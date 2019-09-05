package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePass extends Item {
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    public boolean isBackstage() {
        return true;
    }
}
