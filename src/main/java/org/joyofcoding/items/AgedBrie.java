package org.joyofcoding.items;

public class AgedBrie extends Item {


	public AgedBrie( int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
		

	}

	
	@Override
	public void updateQuality() {
		if (this.quality < 50){
			this.quality++;
		}
		this.sellIn--;
		
		if (testSellInQuality(0,50))
			this.quality++;
		
	}


	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
		
		return this.sellIn < sellIn && this.quality<quality;
	}
	
}
