package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

import org.joyofcoding.items.AgedBrie;
import org.joyofcoding.items.BackstagePassesToTafkal80etcConcert;
import org.joyofcoding.items.ConjuredManaCake;
import org.joyofcoding.items.DexterityVest5;
import org.joyofcoding.items.ElixirOfTheMongoose;
import org.joyofcoding.items.Item;
import org.joyofcoding.items.SulfurasHandOfRagnaros;

public class GildedRose {
    public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
	}

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
		items.add(new DexterityVest5(10,20));
		items.add(new AgedBrie(2, 0));
		items.add(new ElixirOfTheMongoose(5,7));
		items.add(new SulfurasHandOfRagnaros(0,80));
		items.add(new BackstagePassesToTafkal80etcConcert(15,20));
		items.add(new ConjuredManaCake(3,6));
		
		return items;
    }

    public void updateQuality(List<Item> list) {
    	List<Item> items = list;
        for (int i = 0; i < items.size(); i++) {
        	
        	items.get(i).updateQuality();
        	
    	}
    }

}
