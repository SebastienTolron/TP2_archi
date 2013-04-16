package org.joyofcoding.items;

public class SulfurasHandOfRagnaros extends Item {

	public SulfurasHandOfRagnaros( int sellIn, int quality) {
		super("Sulfuras, Hand of Ragnaros", sellIn, quality);
	
	}

	@Override
	public void updateQuality() {

		
	}

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
		
		return false;
	}

}
