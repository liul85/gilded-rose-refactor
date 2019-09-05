package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }
}
