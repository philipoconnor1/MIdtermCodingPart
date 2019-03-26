package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test(expected = Exception.class)
	public void constructortest() throws Exception {
		Rectangle rec = new Rectangle(0, -5);
	}
	
	@Test
	public void perimetertest1() throws Exception {
		Rectangle rec = new Rectangle(3,4);
		double expect = 14;
		double actual = rec.perimeter();
		
		assert expect == actual; 
	}
	
	@Test
	public void areatest1() throws Exception {
		Rectangle rec = new Rectangle(3,4);
		double expect = 12;
		double actual = rec.area();
		
		assert expect == actual; 
	}
	
	@Test
	public void compareTotest1() throws Exception {
		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		rec.add(new Rectangle(3,4));
		rec.add(new Rectangle(2,2));
		rec.add(new Rectangle(4,2));
		Collections.sort(rec);
		for(int i = 0; i < rec.size(); i++) {
			System.out.println(rec.get(i).area());
		}
	}

}
