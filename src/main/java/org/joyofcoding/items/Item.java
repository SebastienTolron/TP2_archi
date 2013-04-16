package org.joyofcoding.items;




public abstract class Item {
	protected String name;
	protected int sellIn;
	protected int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
	}
	
	@Deprecated
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	@Deprecated
	public void setQuality(int quality) {
		this.quality = quality;
	}
	@Deprecated
	public String getName() {
		return name;
	}
	@Deprecated
	public int getSellIn() {
		return sellIn;
	}
	@Deprecated
	public int getQuality() {
		return quality;
	}
	
	public abstract void updateQuality();
	
	public abstract boolean testSellInQuality (int sellIn , int quality );
	
}
