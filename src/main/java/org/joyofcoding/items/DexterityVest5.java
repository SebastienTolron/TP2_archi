package org.joyofcoding.items;

public class DexterityVest5 extends Item {

	public DexterityVest5( int sellIn, int quality) {
		super("+5 Dexterity Vest", sellIn, quality);

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
