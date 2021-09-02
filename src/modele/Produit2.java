package modele;

public class Produit2 extends Produit1{
	private float tva;   // inv2 ( price >0, ), p2 ( x<price, 0<tva<100 ) , Q2 (ob.Price>of.Price )
	

	Produit2(float price,float earning,float tva) {
		super(price,earning);
		this.tva=tva;
	}
	
	@Override
	public void reducePrice(int x) {
		this.price=this.price*(1+tva/100);
		x = (int)(x - 2 * this.price*tva/100);
		super.reducePrice(x);
	}


	float getPrice() {
		return this.price;
	}
	float getEarning() {
		return this.earning;
	}
}
