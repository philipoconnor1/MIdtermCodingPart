package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public Cuboid(int length, int width, int depth) throws IllegalArgumentException { 
		super(length, width);
		if(depth > 0) {
			setiDepth(depth);
		} else {
			throw new IllegalArgumentException("Invalid Input");
		}
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int depth) {
		this.iDepth = depth;
	}

	public double volume() {
		return (double) (this.getiLength() * this.getiWidth() * iDepth);
	}

	@Override
	public double area() {
		double recs = 4 * (this.getiLength() * this.getiWidth());
		double sides = 2 * (this.getiWidth() * getiDepth()); 
		return recs + sides;
	}

	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Object o) {
		Cuboid cub = (Cuboid) o;
		return 0;
	}
}

class SortbyArea implements Comparator<Cuboid> {
	public int compare(Cuboid c1, Cuboid c2) {
		return (int) (c1.area() - c2.area());
	}	
}
	
class SortbyVolume implements Comparator<Cuboid> {
	public int compare(Cuboid c1, Cuboid c2) {
		return (int) (c1.volume() - c2.volume());
	}
}
