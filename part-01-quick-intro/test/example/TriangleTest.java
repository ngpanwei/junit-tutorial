package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void isValidTriangle() {
		assertTrue("normal triangle",new Triangle(2,2,3).isValidTriangle()) ;
	}
	@Test
	public void isInvalidTriangle() {
		assertFalse("with negative side",new Triangle(-1,2,3).isValidTriangle()) ;
		assertFalse("sum of two sides less than third side",
					new Triangle(2,2,5).isValidTriangle()) ;
	}
	@Test
	public void isIsoscelesTriangle() {
		fail("Not yet implemented");
	}	
	@Test
	public void isEquilateralTriangle() {
		fail("Not yet implemented");
	}	
	
}
