package example;

public class Triangle {
	double a, b, c ;

	public Triangle(double a, double b, double c) {
		this.a = a ;
		this.b = b ;
		this.c = c ;
	}
	
	public boolean isValidTriangle() {
		if(a<0||b<0||c<0) {
			return false ;
		}
		if((a+b)>c) {
			return true ;
		}
		return false ;
	}
	
	public boolean isIsoscelesTriangle() {
		throw new RuntimeException("Not Implemented") ;
	}
	
	public boolean isEquilateral() {
		throw new RuntimeException("Not Implemented") ;
	}
	
}
