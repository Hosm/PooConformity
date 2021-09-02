package modele;

public class TableComformity {

	private int	i;
	private int x1;
	private String o;
	private int X;
	private int Y;
	private int Z;
	private int T;
	

	public TableComformity(int i, int x1, String o, int x, int y, int z, int t) {
		super();
		this.i = i;
		this.x1 = x1;
		this.o = o;
		X = x;
		Y = y;
		Z = z;
		T = t;
	}

	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public String getO() {
		return o;
	}
	public void setO(String o) {
		this.o = o;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int z) {
		Z = z;
	}
	public int getT() {
		return T;
	}
	public void setT(int t) {
		T = t;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}		
}