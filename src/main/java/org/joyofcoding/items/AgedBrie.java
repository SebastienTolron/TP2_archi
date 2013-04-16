package org.joyofcoding.items;

public class AgedBrie extends Item {


	public AgedBrie( int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
		

	}

	
	@Override
	public void updateQuality() {
		if (this.getQuality() < 50){
			this.setQuality(this.getQuality() +1 );
		}
		this.setSellIn(this.getSellIn() - 1 );
		
		if (testSellInQuality(0,50))
				this.setQuality(this.getQuality()+1);
		
	}


	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
		
		return this.getSellIn() < sellIn && this.getQuality()<quality;
	}
	
}
