package factory;

import math2D.Point2D;
import topology.MeshTopology;

public class MeshFactory {
	
	public static MeshTopology<Point2D> createCircle(Point2D center, double radius, int radiusSampling, int thetaSampling) {
		MeshTopology<Point2D> topology = new MeshTopology<Point2D>();
		
		topology.addPosition(new Point2D(center));
		int nbPoints = 1 + radiusSampling * thetaSampling;
		int maxIndex = nbPoints - 1;
		
		for (int t = 0; t < thetaSampling; t++) {
			double radian = 2 * Math.PI * (t / (double) thetaSampling);
			double cos = Math.cos(radian);
			double sin = Math.sin(radian);
			for (int r = 1; r <= radiusSampling; r++) {
				double R = radius * (r / (double) radiusSampling);
				double x = center.getX() + R * cos;
				double y = center.getY() + R * sin;
				topology.addPosition(new Point2D(x, y));
				if (r == 1) {
					int i1 = 0;
					int i2 = r + radiusSampling * t;
					int i3 = r + radiusSampling * (t+1);
					if (t == thetaSampling - 1) {
						i3 %= maxIndex;
					}
					topology.addTriangle(i1, i2, i3);
				} else {
					int i1 = (r-1) + radiusSampling * t;
					int i2 = r + radiusSampling * t;
					int i3 = r + radiusSampling * (t+1);
					int i4 = (r-1) + radiusSampling * (t+1);
					if (t == thetaSampling - 1) {
						i3 %= maxIndex;
						i4 %= maxIndex;
					}
					topology.addQuad(i1, i2, i3, i4);
				}
			}
		}
		
		return topology;
	}
}
