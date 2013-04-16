package org.joyofcoding.items;

public class ElixirOfTheMongoose extends Item {

	public ElixirOfTheMongoose( int sellIn, int quality) {
		super("Elixir of the Mongoose", sellIn, quality);
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

	@Override
	public boolean testSellInQuality(int sellIn, int quality) {
		// TODO Auto-generated method stub
		return false;
	}

}
