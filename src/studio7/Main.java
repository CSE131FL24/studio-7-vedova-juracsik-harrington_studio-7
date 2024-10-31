package studio7;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(2, 5);
		if (r1.isSmaller(r2)) {
			System.out.println("r1 is smaller than r2");
		}
		else {
			System.out.println("r1 is not smaller than r2");
		}
		
		if (r1.isSquare()) {
			System.out.println("r1 is square");
		}
		else {
			System.out.println("r1 is not square");
		}
		
		Die d1 = new Die(6);
		System.out.println (d1.roll());
	
		Fraction f1 = new Fraction(10, 5);
		Fraction f2 = new Fraction(1, -8);
		System.out.println(f1.addFractions(f2));
	
		System.out.println(f1.multiplyFractions(f2));
	
		System.out.println(f2.reciprocal());
		System.out.println(f1.reciprocal());
		
		System.out.println(f1.simplify());
	
	}
	
	

}
