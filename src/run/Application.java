package run;

import factory.MeshFactory;
import math2D.Point2D;
import topology.MeshTopology;

public class Application {
	
	public static void main(String[] args) {
		
		MeshTopology<Point2D> topology = MeshFactory.createCircle(new Point2D(0, 0), 2, 5, 6);
		
//		MeshTopology<Point2D> topology = new MeshTopology<Point2D>();
//		
//		for (int i : new int[] {-1, 0, -1}) {
//			for (int j : new int[] {-1, 0, -1}) {
//				topology.addPosition(new Point2D(i, j));
//			}
//		}
//		
//		topology.addQuad(0, 1, 4, 3);
//		topology.addQuad(1, 2, 5, 4);
//		topology.addQuad(3, 4, 7, 6);
//		topology.addQuad(4, 5, 8, 7);
		
//		MeshTopology<Point3D> topology = new MeshTopology<Point3D>();
//		
//		topology.addPosition(new Point3D(-1, -1, -1));
//		topology.addPosition(new Point3D( 1, -1, -1));
//		topology.addPosition(new Point3D( 1,  1, -1));
//		topology.addPosition(new Point3D(-1,  1, -1));
//		topology.addPosition(new Point3D(-1, -1,  1));
//		topology.addPosition(new Point3D( 1, -1,  1));
//		topology.addPosition(new Point3D( 1,  1,  1));
//		topology.addPosition(new Point3D(-1,  1,  1));
//		
//		topology.addQuad(0, 1, 2, 3);
//		topology.addQuad(0, 1, 5, 4);
//		topology.addQuad(1, 2, 6, 5);
//		topology.addQuad(2, 3, 7, 6);
//		topology.addQuad(3, 0, 4, 7);
		
		System.out.println(topology.getNbPositions());
		System.out.println(topology.getNbEdges());
		System.out.println(topology.getNbTriangles());
		System.out.println(topology.getNbQuads());
	}
}
