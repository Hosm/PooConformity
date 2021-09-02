package modele;

public class Produit1 {
	protected float price;
	protected float earning;// inv1 ( price >0 ), p1 ( x<price ) , Q1 (earning > 0)

	Produit1(float price, float earning) {
		this.price = price;
		this.earning = earning;
	}
	
	public void reducePrice(int x){
		float d = this.price - this.earning;
		this.price=this.price-x;
		this.earning = this.price - d;
	}

	float getPrice() {
		return this.price;
	}
	float getEarning() {
		return this.earning;
	}
}
