package org.joyofcoding.items;

public class ConjuredManaCake extends Item {

	public ConjuredManaCake( int sellIn, int quality) {
		super("Conjured Mana Cake", sellIn, quality);
	
	}

	@Override
	public void updateQuality() {
		
		if (this.getQuality() > 0) {
			this.setQuality(this.getQuality() - 1);
		}
		this.setSellIn(this.getSellIn() - 1);
		
		if (this.getSellIn() < 0 && this.getQuality() > 0)
		{
			this.setQuality(	this.getQuality() - 1);
		}
	
	}

}
