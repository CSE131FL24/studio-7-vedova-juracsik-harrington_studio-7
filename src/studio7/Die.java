package studio7;

public class Die {

	private int n;
	
	Die(int sides){
		n = sides;
	}
	
	public int roll() {
		return (int) (Math.random() * n + 1);
	}
}
