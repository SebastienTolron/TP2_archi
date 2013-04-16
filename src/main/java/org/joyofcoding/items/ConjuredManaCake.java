package org.joyofcoding.items;

public class ConjuredManaCake extends Item {

	public ConjuredManaCake( int sellIn, int quality) {
		super("Conjured Mana Cake", sellIn, quality);
	
	}

	@Override
	public void updateQuality() {
		
		if (this.quality > 0) {
			this.quality--;
		}
		this.sellIn--;
		
		if (testSellInQuality(0,0))
		{
			this.quality--;
		}
	
	}

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
	
		return this.sellIn < sellIn && this.quality > quality ;
	}

}
