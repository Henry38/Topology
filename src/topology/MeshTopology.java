package topology;

import java.util.ArrayList;

import geometry.Edge;
import geometry.Face;
import geometry.Quad;
import geometry.Triangle;

public class MeshTopology<T> extends BaseMeshTopology<T> {
	
	protected ArrayList<Edge> edges;
	protected ArrayList<Triangle> triangles;
	protected ArrayList<Quad> quads;
	protected ArrayList<Face> faces;
	
	/** Contructeur */
	public MeshTopology() {
		super();
		this.edges = new ArrayList<Edge>();
		this.triangles = new ArrayList<Triangle>();
		this.quads = new ArrayList<Quad>();
		this.faces = new ArrayList<Face>();
	}
	
	/** Accessor */
	
	@Override
	public ArrayList<Edge> getEdges() {
		return this.edges;
	}
	
	@Override
	public ArrayList<Triangle> getTriangles() {
		return this.triangles;
	}
	
	@Override
	public ArrayList<Quad> getQuads() {
		return this.quads;
	}
	
	@Override
	public ArrayList<Face> getFaces() {
		return this.faces;
	}
	
	/** procedural function */
	
	public void addPosition(T position) {
		if (getPositions().contains(position)) {
			return;
		}
		this.positions.add(position);
	}
	
	public void addEdge(int a, int b) {
		Edge edge = new Edge(a, b);
		if (getEdges().contains(edge)) {
			return;
		}
		this.getEdges().add(edge);
	}
	
	public void addTriangle(int a, int b, int c) {
		Triangle triangle = new Triangle(a, b, c);
		if (getTriangles().contains(triangle)) {
			return;
		}
		addEdge(a, b);
		addEdge(b, c);
		addEdge(c, a);
		this.getTriangles().add(triangle);
	}
	
	public void addQuad(int a, int b, int c, int d) {
		Quad quad = new Quad(a, b, c, d);
		if (getQuads().contains(quad)) {
			return;
		}
		addEdge(a, b);
		addEdge(b, c);
		addEdge(c, d);
		addEdge(d, a);
		this.getQuads().add(quad);
	}
	
	public void addFace(int ... points) {
		int length = points.length;
		if (length < 2) {
			System.out.println("Can't add face with " + length + " points");
		} else if (length == 2) {
			addEdge(points[0], points[1]);
		} else if (length == 3) {
			addTriangle(points[0], points[1], points[2]);
		} else if (length == 4) {
			addQuad(points[0], points[1], points[2], points[3]);
		} else {
			Face face = new Face(points);
			if (getFaces().contains(face)) {
				return;
			}
			for (int i = 0; i < points.length; i++) {
				int j = (i+1) % points.length;
				addEdge(i, j);
			}
			this.getFaces().add(face);
		}
	}
}
