package factory;

import display.FoldableDisplay;

public abstract class FoldableDisplayFactory extends DisplayFactory {

	public FoldableDisplay create(double unfoldedInches, double foldedInches) {
		return (FoldableDisplay) super.create(unfoldedInches, foldedInches);
    }

}
