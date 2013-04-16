package org.joyofcoding.items;

public class ElixirOfTheMongoose extends Item {

	public ElixirOfTheMongoose( int sellIn, int quality) {
		super("Elixir of the Mongoose", sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		if (this.quality > 0) {
			this.quality--;
		}
		this.sellIn--;
	
		if (testSellInQuality(0, 0))
		{
			this.quality--;
		}
		
	}

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
		
		return this.sellIn < sellIn && this.quality > quality;
	}

}
