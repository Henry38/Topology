package geometry;

public class Edge extends Polygon {
	
	public final int a;
	public final int b;
	
	/** Conctructeur */
	public Edge(int a, int b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}
}
