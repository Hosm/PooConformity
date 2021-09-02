package modele;

import java.util.ArrayList;
import java.util.Random;

public class ResultProduit {
	
	public ResultProduit() {
		super();
	}
	private ArrayList<ArrayList<Object>> table = new ArrayList<ArrayList<Object>>();
	
	public ArrayList<ArrayList<Object>> getTable() {
		return table;
	}

	public void setTable(ArrayList<ArrayList<Object>> table) {
		this.table = table;
	}

	public void conformityTest() {
		int X=0,Y=0,Z=0,T=0,i=0;
		
		do{ 
			int x;
			float earning,price,tva;
			boolean a1=true,b1,a2,b2;
			a2=b1=b2=a1;
			Random r1 = new Random();
			price = r1.nextFloat()*200;
			Random r2 = new Random();
			earning = r2.nextFloat()*price / 3;
			Random r3 = new Random();
			x = r3.nextInt((int)(price));
			Random r4 = new Random();
			tva = r4.nextFloat();
		
			Produit2 o2 = new Produit2(price,earning,tva);
			Produit1 o1 = new Produit1(price,earning);
			Produit2 t = new Produit2(price,earning,tva);
		    o1.reducePrice(x);
			if(o1.getPrice()>t.getPrice() && o1.getEarning()<0)
				a1=false;
			if(o1.getPrice()<0)
				b1=false;
			o2.reducePrice(x);
			if(o2.getPrice()>t.getPrice() && o2.getEarning()<0)
		        a2=false;
			if(o2.getPrice()<0 )
				b2=false;
			/*System.out.println(o2.getBalance()+"+++++++++++++"+(t.getBalance()-x));
			System.out.println((o2.getBalance()+"+++++++++++++"+(t.getBalance() - (1 + 2*o2.getInterestRate()) * x)));
			System.out.println(o2.getBalance()+"+++++++++++++"+t.getBalance());*/
			if (a1 == b1 == a2 == b2 == true)
				X++;
			else
				if(a1 == b1 == true && (a2 && b2) == false)
					Z++;
					else
						if(a2 == b2 == true && (a1 && b1) == false)
							T++;
						else
							Y++;
			ArrayList<Object> row = new ArrayList<Object>();
			row.add(i);
				row.add(x);
				row.add("Produit2("+price+","+earning+","+tva+")");
				row.add(X);
				row.add(Y);
				row.add(Z);
				row.add(T);
				table.add(row);
			i++;
			}while (X < 100 && Y == 0 && Z < 100 && T < 100); 
			System.out.println(X);
			System.out.println(Y);
			System.out.println(Z);
			System.out.println(T);

	}
	}

