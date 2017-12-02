package topology;

import java.util.ArrayList;
import java.util.List;

import primitive.Edge;
import primitive.Face;
import primitive.Quad;
import primitive.Triangle;

public abstract class BaseMeshTopology<T> implements Topology {
	
	protected ArrayList<T> positions;
	
	/** Constructeur */
	public BaseMeshTopology() {
		this.positions = new ArrayList<T>();
	}
	
	//** Positions accessor **//
	
	public int getNbPositions() {
		return this.positions.size();
	}
	
	public List<T> getPositions() {
		return this.positions;
	}
	
	public T getPosition(int i) {
		return this.positions.get(i);
	}
	
	//** Topology accessor **//
	
	@Override
	public int getNbEdges() {
		return getEdges().size();
	}
	
	@Override
	public int getNbTriangles() {
		return getTriangles().size();
	}
	
	@Override
	public int getNbQuads() {
		return getQuads().size();
	}
	
	@Override
	public int getNbFaces() {
		return getFaces().size();
	}
	
	@Override
	public Edge getEdge(int i) {
		return getEdges().get(i);
	}
	
	@Override
	public Triangle getTriangle(int i) {
		return getTriangles().get(i);
	}
	
	@Override
	public Quad getQuad(int i) {
		return getQuads().get(i);
	}
	
	@Override
	public Face getFace(int i) {
		return getFaces().get(i);
	}
	
	//** Features **//
	
	public List<Edge> getEdgesAroundVertex(T position) {
		return null;
	}
	
	public List<Triangle> getTrianglesAroundVertex(T position) {
		return null;
	}
	
	public List<Quad> getQuadsAroundVertex(T position) {
		return null;
	}
	
	public List<Face> getFacesAroundVertex(T position) {
		return null;
	}
}
