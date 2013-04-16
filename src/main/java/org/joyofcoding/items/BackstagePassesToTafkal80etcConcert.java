package org.joyofcoding.items;

public class BackstagePassesToTafkal80etcConcert extends Item {

	public BackstagePassesToTafkal80etcConcert( int sellIn,
			int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		
		if (this.getQuality() < 50) {
			this.setQuality(this.getQuality() +1 );
			
			if (testSellInQuality(11,50)) {
				this.setQuality(this.getQuality() + 1);
			}
			if (testSellInQuality(6,50)) {
				this.setQuality(this.getQuality() + 1);
			}
		}
		this.setSellIn(this.getSellIn() - 1 );
		
		if (this.getSellIn() <0 )  {
			this.setQuality(0);
		}
		
	}

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
	
		return this.getSellIn() < sellIn && this.getQuality() < quality ;
	}


}
