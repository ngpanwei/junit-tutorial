package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void aValidTriangleShouldHaveAllPositiveSides() {
		assertTrue("normal triangle",new Triangle(2,2,3).isValidTriangle()) ;
	}
	@Test
	public void anInvalidTriangle_ShouldHave_NoZeroOrNegativeSides() {
		assertFalse("with negative side",new Triangle(-1,2,3).isValidTriangle()) ;
		assertFalse("with negative side",new Triangle(2,-2,3).isValidTriangle()) ;
		assertFalse("with negative side",new Triangle(2,-2,-3).isValidTriangle()) ;
	}
	@Test
	public void anInvalidTriangle_ShouldHave_SumOfTwoSidesGreaterThanTheOther() {
		assertFalse("sum of two sides less than third side",new Triangle(2,2,5).isValidTriangle()) ;
		assertFalse("sum of two sides less than third side",new Triangle(2,2,4).isValidTriangle()) ;
		assertFalse("sum of two sides less than third side",new Triangle(2,5,2).isValidTriangle()) ;
		assertFalse("sum of two sides less than third side",new Triangle(5,2,2).isValidTriangle()) ;
	}
	@Test
	public void anIsoscelesTriangle_ShouldHave_TwoEqualSides() {
		assertTrue("first two sides equal",new Triangle(2,2,3).isIsoscelesTriangle()) ;
		assertTrue("second and third sides equal",new Triangle(3,2,2).isIsoscelesTriangle()) ;
		assertTrue("first and third side equal",new Triangle(2,3,2).isIsoscelesTriangle()) ;
	}
	@Test
	public void aNonIsoscelesTriangle_ShouldHave_NoEqualSides() {
		assertFalse("no equal sides",new Triangle(2,4,3).isIsoscelesTriangle()) ;
	}	
	@Test
	public void anEquilateralTriangle_ShouldHave_ThreeEqualSides() {
		assertFalse("all three sides equal",new Triangle(2,2,3).isEquilateral()) ;
	}	
}


