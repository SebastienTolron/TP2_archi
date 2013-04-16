package org.joyofcoding.items;

public class DexterityVest5 extends Item {

	public DexterityVest5( int sellIn, int quality) {
		super("+5 Dexterity Vest", sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		if (this.getQuality() > 0) {
			this.setQuality(this.getQuality() - 1);
		}
		this.setSellIn(this.getSellIn() - 1);
	
		if (this.getSellIn() < 0 && this.getQuality() > 0)
		{
			this.setQuality(this.getQuality() - 1);
		}

	}

}
