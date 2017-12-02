package topology;

import java.util.List;

import primitive.Edge;
import primitive.Face;
import primitive.Quad;
import primitive.Triangle;

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
