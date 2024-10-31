package studio7;

public class Fraction {

	private int top;
	private int bottom;
	
	Fraction(int n, int d){
		top = n;
		bottom = d;
	}
	
	public String addFractions(Fraction f) {
		int commonDenom = this.bottom * f.bottom;
		int new1 = this.top * f.bottom;
		int new2 = f.top * this.bottom;
		int newTop = new1 + new2;
		return newTop + "/" + commonDenom;
	}
	
	public String multiplyFractions(Fraction f) {
		return (this.top * f.top) + "/" + (this.bottom * f.bottom);
	}
	
	public String reciprocal() {
		return this.bottom + "/" + this.top;
	}
	
	public String simplify() {
		int lower;
		if(this.bottom >= this.top) {
			lower = this.top;
		}
		else {
			lower = this.bottom;
		}
		
		for(int i = lower; i > 0; i--) {
			if(this.top % i == 0 && this.bottom % i == 0) {
				return (this.top / lower) + "/" + (this.bottom/lower);
			}
		}
		return this.top + "/" + this.bottom;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
