package topology;

import java.util.ArrayList;
import java.util.List;

import primitive.Edge;
import primitive.Face;
import primitive.Polygon;
import primitive.Quad;
import primitive.Triangle;

public class TopologyContainer<T, P extends Polygon> extends BaseMeshTopology<T> {
	
	protected ArrayList<P> polygons;
	
	/** Constructeur */
	public TopologyContainer() {
		super();
		this.polygons = new ArrayList<P>();
	}
	
	@Override
	public List<Edge> getEdges() {
		return new ArrayList<Edge>();
	}
	
	@Override
	public List<Triangle> getTriangles() {
		return new ArrayList<Triangle>();
	}
	
	@Override
	public List<Quad> getQuads() {
		return new ArrayList<Quad>();
	}
	
	@Override
	public List<Face> getFaces() {
		return new ArrayList<Face>();
	}
}
