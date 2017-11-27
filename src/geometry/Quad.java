package geometry;

public class Quad extends Polygon {
	
	public final int a;
	public final int b;
	public final int c;
	public final int d;
	
	/** Conctructeur */
	public Quad(int a, int b, int c, int d) {
		super(a, b, c, d);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}
