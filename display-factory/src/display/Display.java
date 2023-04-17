package display;

public abstract class Display {

	protected double inches;
	protected String features = null;

	public Display(double inches) {
		this.inches = inches;
	}
	
	public double getInches() {
		return inches;
	}

	public abstract void assemble( ); // diagonalSize of display

	public String toString() {
		return features;
	}
	
}
