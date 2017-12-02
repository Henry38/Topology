package primitive;

import java.util.Arrays;

public abstract class Polygon {
	
	protected int[] points;
	
	public Polygon(int... points) {
		this.points = points.clone();
		//Arrays.sort(this.points);
	}
	
	public int getNbPoints() {
		return this.points.length;
	}
	
	public int get(int i) {
		return this.points[i];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(points);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Polygon))
			return false;
		Polygon other = (Polygon) obj;
		int[] sortPoints = points.clone();
		Arrays.sort(sortPoints);
		int[] sortOtherPoints = other.points.clone();
		Arrays.sort(sortOtherPoints);
		if (!Arrays.equals(sortPoints, sortOtherPoints))
			return false;
		return true;
	}
}
