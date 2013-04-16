package org.joyofcoding.items;

public class BackstagePassesToTafkal80etcConcert extends Item {

	public BackstagePassesToTafkal80etcConcert( int sellIn,
			int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

	}

	@Override
	public void updateQuality() {
		
		if (this.quality < 50) {
			   this.quality++;
			
			if (testSellInQuality(11,50)) {
				this.quality++;
			}
			if (testSellInQuality(6,50)) {
				this.quality++;
			}
		}
		this.sellIn--;
		
		if (this.sellIn <0 )  {
			this.quality = 0 ;
		}
		
	}

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
	
		return this.sellIn < sellIn && this.quality < quality ;
	}


}
