package factory;

import display.StandardDisplay;

public abstract class StandardDisplayFactory extends DisplayFactory {

	public StandardDisplay create(double inches) {
		return (StandardDisplay) super.create(inches);
    }

}
