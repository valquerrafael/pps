package factory.samsung.foldable;

import display.Display;
import display.FoldableDisplay;
import display.samsung.foldable.SamsungFoldableSmartphoneDisplay;
import factory.FoldableDisplayFactory;

public class SamsungFoldableSmartphoneDisplayFactory extends FoldableDisplayFactory {

    @Override
    protected FoldableDisplay createDisplay(double inches) {
        return null;
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return new SamsungFoldableSmartphoneDisplay(unfoldedInches, foldedInches);
    }

}
