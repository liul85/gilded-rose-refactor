package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras extends Item {
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }
}
