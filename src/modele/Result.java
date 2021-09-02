package modele;

import java.util.ArrayList;
import java.util.Random;

public class Result {
	
	public Result() {
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
			int x,b;
			double ir;
			boolean a1=true,b1,a2,b2;
			a2=b1=b2=a1;
			Random r1 = new Random();
			b = r1.nextInt(200);
			Random r2 = new Random();
			x = r2.nextInt(b+1);
			Random r3 = new Random();
			ir = r3.nextDouble()*.3;
		
			Account2 o2 = new Account2(b,ir);
			Account1 o1 = new Account1(b);
			Account2 t = new Account2(b,ir);
		    o1.withdraw(x);
			if(o1.getBalance()>t.getBalance())
				a1=false;
			if(o1.getBalance()<0)
				b1=false;
			o2.withdraw(x);
			if(o2.getBalance()>t.getBalance())
		        a2=false;
			if(o2.getBalance()<0)
				b2=false;
			System.out.println(o2.getBalance()+"+++++++++++++"+(t.getBalance()-x));
			System.out.println((o2.getBalance()+"+++++++++++++"+(t.getBalance() - (1 + 2*o2.getInterestRate()) * x)));
			System.out.println(o2.getBalance()+"+++++++++++++"+t.getBalance());
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
				row.add("Account2("+b+","+ir+")");
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

