package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	@Test(expected = IllegalArgumentException.class)
	public void constructortest() throws IllegalArgumentException {
		Cuboid cub = new Cuboid(1,3,-6);
	} 
	
	@Test
	public void constructortest1() throws IllegalArgumentException {
	  boolean thrown = false;
	  try {
		Cuboid cub = new Cuboid(1,-2,3);
	  } catch (IllegalArgumentException e) {
	    thrown = true;
	  }
	  assertTrue(thrown);
	}
	
	@Test
	public void perimetertest() throws Exception {
	  boolean thrown = false;
	  try {
		Cuboid cub = new Cuboid(1,2,3);
	    cub.perimeter();
	  } catch (UnsupportedOperationException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	@Test
	public void surfaceareatest1() throws Exception {
		Cuboid cub = new Cuboid(1,3,2);
		double expect = 24;
		double actual = cub.area();
		
		assert expect == actual; 
	}
	
	@Test
	public void volumetest1() throws Exception {
		Cuboid cub = new Cuboid(1,3,2);
		double expect = 6;
		double actual = cub.volume();
		
		assert expect == actual; 
	}
	
	@Test
	public void sortByAreatest1() throws Exception {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		cub.add(new Cuboid(3,4,1));
		cub.add(new Cuboid(1,3,1));
		cub.add(new Cuboid(5,1,2));
		Collections.sort(cub, new SortbyArea());
		System.out.println("Sorted Surface Areas: ");
		for(int i = 0; i < cub.size(); i++) {
			System.out.println(cub.get(i).area());
		}
	}
	
	@Test
	public void sortByAreatest2() throws Exception {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		for(int i = 0; i < 10; i++) {
			int len = (int)(Math.random()*10 + 1);
			int wid = (int)(Math.random()*10 + 1);
			int dep = (int)(Math.random()*10 + 1);
			cub.add(new Cuboid(len, wid, dep));
		}	
		Collections.sort(cub, new SortbyArea());
		System.out.println("Sorted Surface Areas: ");
		for(int i = 0; i < cub.size(); i++) {
			System.out.println(cub.get(i).area());
		}
	}
	
	@Test
	public void sortByVolumetest1() throws Exception {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		cub.add(new Cuboid(3,4,1));
		cub.add(new Cuboid(1,3,1));
		cub.add(new Cuboid(5,1,2));
		Collections.sort(cub, new SortbyVolume());
		System.out.println("Sorted Volumes: ");
		for(int i = 0; i < cub.size(); i++) {
			System.out.println(cub.get(i).volume());
		}
	}
	
	@Test
	public void sortByVolumetest2() throws Exception {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		for(int i = 0; i < 10; i++) {
			int len = (int)(Math.random()*10 + 1);
			int wid = (int)(Math.random()*10 + 1);
			int dep = (int)(Math.random()*10 + 1);
			cub.add(new Cuboid(len, wid, dep));
		}	
		Collections.sort(cub, new SortbyVolume());
		System.out.println("Sorted Volumes: ");
		for(int i = 0; i < cub.size(); i++) {
			System.out.println(cub.get(i).volume());
		}
	}

}
