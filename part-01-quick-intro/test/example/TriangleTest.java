/** 
 *  Copyright (c) 2014  Ng Pan Wei
 *  
 *  Permission is hereby granted, free of charge, to any person 
 *  obtaining a copy of this software and associated documentation files 
 *  (the "Software"), to deal in the Software without restriction, 
 *  including without limitation the rights to use, copy, modify, merge, 
 *  publish, distribute, sublicense, and/or sell copies of the Software, 
 *  and to permit persons to whom the Software is furnished to do so, 
 *  subject to the following conditions: 
 *  
 *  The above copyright notice and this permission notice shall be 
 *  included in all copies or substantial portions of the Software. 
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS 
 *  BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN 
 *  ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 *  SOFTWARE. 
 */
package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void aValidTriangle_ShouldHave_AllPositiveSides() {
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


