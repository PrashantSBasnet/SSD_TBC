package testingSample;



public class Product {
	
	
	private int stockLevel;
	private float unitCost;
	
	public float getStockValue() {
		return stockLevel * unitCost;
	}
	
	public boolean inStock() {
		return stockLevel !=0;
	}
	
	public int setllProduct() throws Exception {
		if (stockLevel <=1) {
			throw new Exception();
		}
		return --stockLevel;
	}
	
	public Product (int stockLevel, float unitCost) {
		this.stockLevel = stockLevel; 
		this.unitCost= unitCost;
	}
}
