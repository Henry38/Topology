package topology;

import java.util.List;

import geometry.Edge;
import geometry.Face;
import geometry.Quad;
import geometry.Triangle;

public interface Topology {
	
	public int getNbEdges();
	public int getNbTriangles();
	public int getNbQuads();
	public int getNbFaces();
	
	public List<Edge> getEdges();
	public List<Triangle> getTriangles();
	public List<Quad> getQuads();
	public List<Face> getFaces();
	
	public Edge getEdge(int i);
	public Triangle getTriangle(int i);
	public Quad getQuad(int i);
	public Face getFace(int i);
}
