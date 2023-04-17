package factory.samsung.foldable;

import display.Display;
import display.FoldableDisplay;
import display.samsung.foldable.SamsungFoldableTabletDisplay;
import factory.FoldableDisplayFactory;

public class SamsungFoldableTabletDisplayFactory extends FoldableDisplayFactory {

    @Override
    protected FoldableDisplay createDisplay(double inches) {
        return null;
    }

    @Override
    protected Display createDisplay(double unfoldedInches, double foldedInches) {
        return new SamsungFoldableTabletDisplay(unfoldedInches, foldedInches);
    }

}
