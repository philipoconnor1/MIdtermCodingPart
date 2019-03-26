package pkgShape;

import java.util.ArrayList;

public class Rectangle extends Shape implements Comparable {
	
	private int iLength;
	private int iWidth;
	
	public Rectangle(int l, int w) throws Exception {
		if(l > 0 && w > 0) { 
			setiLength(l);
			setiWidth(w);
		} else {
			throw new Exception("Invalid Input");
		}
	}
	
	public int getiLength() {
		return iLength;
	}

	public void setiLength(int length) {
		this.iLength = length;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int width) {
		this.iWidth = width;
	}

	@Override
	public double perimeter() {
		return (double) (2*getiLength()) + (2*getiWidth());
	}

	@Override
	public double area() {
		return (double) this.iLength * this.iWidth;
	}

	public int compareTo(Object o) {
		Rectangle rec = (Rectangle) o;
		return (int) ((int) this.area() - rec.area());
	}
}
