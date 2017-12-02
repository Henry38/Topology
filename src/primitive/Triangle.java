package primitive;

public class Triangle extends Polygon {
	
	public final int a;
	public final int b;
	public final int c;
	
	/** Conctructeur */
	public Triangle(int a, int b, int c) {
		super(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
